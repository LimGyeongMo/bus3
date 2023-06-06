package com.example.bus3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;


public class Fragment_main_home extends Fragment {

    private ViewGroup viewGroup;



    @Override
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        viewGroup = (ViewGroup) inflater.inflate(R.layout.bus_fragment_main_home, container, false);


        setInit();

        return  viewGroup;
    }
    private void setInit(){

        ViewPager2 viewPageSetUp = viewGroup.findViewById(R.id.viewpager2);
        FragPagerAdapter SetupPagerAdapter = new FragPagerAdapter(getActivity());
        viewPageSetUp.setAdapter(SetupPagerAdapter);
        viewPageSetUp.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        viewPageSetUp.setOffscreenPageLimit(3);
        viewPageSetUp.setCurrentItem(1000);

        final float pageMargin = (float) getResources().getDimensionPixelOffset(R.dimen.pageMargin);
        final float pageOffset = (float) getResources().getDimensionPixelOffset(R.dimen.offset);

        viewPageSetUp.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }
        });

       viewPageSetUp.setPageTransformer(new ViewPager2.PageTransformer() {
           @Override
           public void transformPage(@NonNull View page, float position) {

               float offset = position * -(2 * pageOffset + pageMargin);
               if (-1 > position) {
                   page.setTranslationX(-offset);
               } else if (-1 >= position) {
                   float scaleFactor = Math.max(0.7f, 1 - Math.abs(position - 0.14285715f));
                   page.setTranslationX(offset);
                   page.setScaleY(scaleFactor);
                   page.setAlpha(scaleFactor);
               } else {
                   page.setAlpha(0f);
                   page.setTranslationX(offset);
               }

           }
       });

    }
}
