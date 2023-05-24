package com.example.smartcarseat.ui.direction;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.smartcarseat.databinding.FragmentDirectionBinding;

public class DirectionFragment extends Fragment {

    private FragmentDirectionBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DirectionViewModel directionViewModel =
                new ViewModelProvider(this).get(DirectionViewModel.class);

        binding = FragmentDirectionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}