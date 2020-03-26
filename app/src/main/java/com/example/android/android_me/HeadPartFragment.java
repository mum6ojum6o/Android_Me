package com.example.android.android_me;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.data.AndroidImageAssets;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HeadPartFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HeadPartFragment extends Fragment {
    ImageView imageView;
    public HeadPartFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static HeadPartFragment newInstance(String param1, String param2) {
        HeadPartFragment fragment = new HeadPartFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout=  inflater.inflate(R.layout.fragment_head_part, container, false);
        imageView = (ImageView)layout.findViewById(R.id.imageView_head);
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));
        return layout;
    }
}
