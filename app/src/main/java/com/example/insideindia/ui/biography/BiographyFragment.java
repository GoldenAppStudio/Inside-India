package com.example.insideindia.ui.biography;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.insideindia.R;
import com.example.insideindia.ui.assembley.AssembleyViewModel;

public class BiographyFragment extends Fragment {

    private BiographyViewModel biographyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        biographyViewModel =
                new ViewModelProvider(this).get(BiographyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_biography, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        biographyViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}