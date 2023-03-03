package com.example.recoverytap;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import com.example.recoverytap.databinding.FragmentRegFullNameBinding;
import com.example.recoverytap.databinding.FragmentRegPasswordBinding;

public class RegPasswordFragment extends Fragment {
    private String name="";
    private FragmentRegPasswordBinding binding;
    public static final String KEY_REG_NAME = "name";
    public static final String KEY_RESULT = "result";
    ///фабричный метод для создания фрагмента
    public static RegPasswordFragment newInstance(String name){
        RegPasswordFragment fragment = new RegPasswordFragment();
        Bundle bundle = new Bundle();
        bundle.putString(KEY_REG_NAME,name);
        fragment.setArguments(bundle);
        return fragment;
    }
    private void parseArgs(){
        Bundle bundle = this.getArguments();
        if (bundle != null){
            name = bundle.getString(KEY_REG_NAME);
            binding.textView.setText(getString(R.string.inout,name));
        }
    }
    @Override
    public void onAttach(@NonNull Context context) {
        Log.d("regpasswordfrag", "onAttach");
        Toast.makeText(getContext(), "onAttach", Toast.LENGTH_SHORT).show();
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.d("regpasswordfrag", "onCreate");
        Toast.makeText(getContext(), "onCreate", Toast.LENGTH_SHORT).show();
        super.onCreate(savedInstanceState);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("regpasswordfrag", "onCreateView");
        Toast.makeText(getContext(), "onCreateView", Toast.LENGTH_SHORT).show();
        binding = FragmentRegPasswordBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.d("regpasswordfrag", "onViewCreated");
        Toast.makeText(getContext(), "onViewCreated", Toast.LENGTH_SHORT).show();
        super.onViewCreated(view, savedInstanceState);
        parseArgs();
        Bundle result = new Bundle();
        result.putString(RegiFullNameFragment.KEY_REG_NAME, name);
        getParentFragmentManager().setFragmentResult(RegiFullNameFragment.KEY_RESULT, result);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        Log.d("regpasswordfrag", "onViewStateRestored");
        Toast.makeText(getContext(), "onViewStateRestored", Toast.LENGTH_SHORT).show();
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.d("regpasswordfrag", "onStart");
        Toast.makeText(getContext(), "onStart", Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    public void onResume() {
        Log.d("regpasswordfrag", "onResume");
        Toast.makeText(getContext(), "onResume", Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.d("regpasswordfrag", "onPause");
        Toast.makeText(getContext(), "onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.d("regpasswordfrag", "onStop");
        Toast.makeText(getContext(), "onStop", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d("regpasswordfrag", "onSaveInstanceState");
        Toast.makeText(getContext(), "onSaveInstanceState", Toast.LENGTH_SHORT).show();
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onDestroyView() {
        Log.d("regpasswordfrag", "onDestroyView");
        Toast.makeText(getContext(), "onDestroyView", Toast.LENGTH_SHORT).show();
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.d("regpasswordfrag", "onDestroy");
        Toast.makeText(getContext(), "onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.d("regpasswordfrag", "onDetach");
        Toast.makeText(getContext(), "onDetach", Toast.LENGTH_SHORT).show();
        super.onDetach();
    }
}
