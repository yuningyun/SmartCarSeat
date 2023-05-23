package com.example.smartcarseat.ui.voice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.smartcarseat.databinding.FragmentVoiceBinding;

public class VoiceFragment extends Fragment {

    private FragmentVoiceBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        VoiceViewModel voiceViewModel =
                new ViewModelProvider(this).get(VoiceViewModel.class);

        binding = FragmentVoiceBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textVoice;
        voiceViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}