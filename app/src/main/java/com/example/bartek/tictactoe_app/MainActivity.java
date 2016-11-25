package com.example.bartek.tictactoe_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean my_turn=true;
    public void btnClick(View v) {


        Button b= (Button) v;
        if (b.getText().equals(".")){
            if(my_turn)
            {
                b.setText("X");
            }
            else
            {
                b.setText("O");
            }
            my_turn= !my_turn;
        }


    }

}
