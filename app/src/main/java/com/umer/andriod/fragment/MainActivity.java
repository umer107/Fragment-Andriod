package com.umer.andriod.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.activity_button);
        btn.setOnClickListener(this);

    }


    public  void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.activity_button:
                Toast.makeText(this, "ActivtyButton", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
