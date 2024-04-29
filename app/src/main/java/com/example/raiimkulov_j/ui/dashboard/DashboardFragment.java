package com.example.raiimkulov_j.ui.dashboard;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;

import com.example.raiimkulov_j.Prefs;
import com.example.raiimkulov_j.R;
import com.example.raiimkulov_j.databinding.FragmentDashboardBinding;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        new Prefs(requireContext()).saveBoardState();


        binding.viewpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                changeColor();
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
                changeColor();
            }
        });


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


    @SuppressLint("ResourceAsColor")
    private void changeColor() {
        if (binding.viewpager.getCurrentItem() == 0) {
            binding.iv1.setImageResource(R.drawable.selected);
            binding.iv2.setImageResource(R.drawable.not_selected);
            binding.iv3.setImageResource(R.drawable.not_selected);
        } else if (binding.viewpager.getCurrentItem() == 1) {
            binding.iv1.setImageResource(R.drawable.not_selected);
            binding.iv2.setImageResource(R.drawable.selected);
            binding.iv3.setImageResource(R.drawable.not_selected);
        } else {
            binding.iv1.setImageResource(R.drawable.not_selected);
            binding.iv2.setImageResource(R.drawable.not_selected);
            binding.iv3.setImageResource(R.drawable.selected);
        }
    }
}