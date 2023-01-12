package com.example.tabslayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SampleAdaptor extends FragmentStateAdapter {
    public SampleAdaptor(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 0){
            FirstFragment fragmentAwal = new FirstFragment();
            return fragmentAwal;
        }else{
            SecondFragment fragment2 = new SecondFragment();
            return fragment2;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
