package com.example.bus3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_1 extends Fragment {
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_1, container, false);

        setInit(view);
        return view;
    }

    private void setInit(View _view){

        ImageView imageView =_view.findViewById(R.id.imageView);
    }
}
