package com.umer.andriod.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Umar on 8/23/2017.
 */

public class SimpleFragment extends Fragment implements View.OnClickListener {
    View view;
    Button firstButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_simple , container , false);
        // get the reference of Button
        firstButton = (Button) view.findViewById(R.id.firstButton);
         firstButton.setOnClickListener(this);
        return  view;
    }
    
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.firstButton:
                Toast.makeText(getActivity(), "Fragment's Button", Toast.LENGTH_SHORT).show();
        }
    }
}
