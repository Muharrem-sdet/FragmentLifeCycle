package com.example.a44fragmentlifecycle;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends Fragment {

    private static final String LOG_TAG = "LOG_TAG";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d(LOG_TAG, "Fragment is onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "Fragment is onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(LOG_TAG, "Fragment is onCreateView");
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(LOG_TAG, "Fragment is onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(LOG_TAG, "Fragment is onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "Fragment is onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "Fragment is onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "Fragment is onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "Fragment is onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(LOG_TAG, "Fragment is onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "Fragment is onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(LOG_TAG, "Fragment is onDetach");
    }
}