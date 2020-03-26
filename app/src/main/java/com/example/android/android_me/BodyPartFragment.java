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
 * Use the {@link BodyPartFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BodyPartFragment extends Fragment {
    ImageView imageView;
    public BodyPartFragment() {
        // Required empty public constructor
    }


    public static BodyPartFragment newInstance(String param1, String param2) {
        BodyPartFragment fragment = new BodyPartFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
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
        View layout = inflater.inflate(R.layout.fragment_body_part, container, false);
        imageView = (ImageView)layout.findViewById(R.id.imageView_body);
        imageView.setImageResource(AndroidImageAssets.getBodies().get(0));
        return layout;
    }
}
