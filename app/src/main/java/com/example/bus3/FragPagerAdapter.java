package com.example.bus3;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragPagerAdapter extends FragmentStateAdapter {

    public final int mSetItemCount = 3;

    public FragPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        int iViewIdx = getRealPosition(position);
        switch (iViewIdx) {
            case 0    : {return new Fragment_1();}
            case 1    : {return new Fragment_2();}
            case 2    : {return new Fragment_3();}


            default   : {return new Fragment_1();}
        }
    }
    public int getRealPosition(int _Position){
        return _Position % mSetItemCount;
    }
    @Override
    public long getItemId(int position){
        return super.getItemId(position);
    }
    @Override
    public int getItemCount(){
        return Integer.MAX_VALUE;
    }
}