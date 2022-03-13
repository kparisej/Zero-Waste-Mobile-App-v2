package com.example.zero_waste_mobile_app.ui.welcome;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zero_waste_mobile_app.R;

public class WelcomePageFragment extends Fragment {

    private WelcomeViewModel mViewModel;

    public static WelcomePageFragment newInstance() {
        return new WelcomePageFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.welcome_page_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(WelcomeViewModel.class);
        // TODO: Use the ViewModel
    }

}