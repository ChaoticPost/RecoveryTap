package com.example.recoverytap;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import com.example.recoverytap.databinding.FragmentRegFullNameBinding;

public class RegiFullNameFragment extends Fragment {
    public static final String KEY_REG_NAME = "name";
    public static final String KEY_RESULT = "result";
    private FragmentRegFullNameBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentRegFullNameBinding.inflate(inflater, container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name = binding.name.getText().toString();
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container_fragment,RegPasswordFragment.newInstance(Name))
                        .addToBackStack(null)
                        .commit();
            }
        });
        getParentFragmentManager().setFragmentResultListener(KEY_RESULT, this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                String name = result.getString(KEY_REG_NAME);
                binding.textView.setText(getString(R.string.inout, name));
            }
        });
    }
}
