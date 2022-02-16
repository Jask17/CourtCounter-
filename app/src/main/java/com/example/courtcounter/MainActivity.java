package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int TeamAScore=0;
    int TeamBScore=0;


    public void Add3toA(View view) {
        TeamAScore=TeamAScore+3;
        DisplayA(TeamAScore);
    }

    public void Add3toB(View view) {
        TeamBScore=TeamBScore+3;
        DisplayB(TeamBScore);
    }

    public void Add2toA(View view) {
        TeamAScore=TeamAScore+2;
        DisplayA(TeamAScore);
    }

    public void Add2toB(View view) {
        TeamBScore=TeamBScore+2;
        DisplayB(TeamBScore);
    }

    public void Add1toA(View view) {
        TeamAScore=TeamAScore+1;
        DisplayA(TeamAScore);
    }
    public void  Add1toB(View view){
        TeamBScore=TeamBScore+1;
        DisplayB(TeamBScore);
    }

    public void ResetBoth(View view) {
        TeamAScore=0;
        TeamBScore=0;
        DisplayA(TeamAScore);
        DisplayB(TeamBScore);
    }

    public void DisplayA(int n)
    {
        TextView viewA=(TextView) findViewById(R.id.TeamA_Score );
        viewA.setText(String.valueOf(n));
    }
    public void DisplayB(int  n)
    {
        TextView viewB=(TextView) findViewById(R.id.TeamB_Score);
        viewB.setText(String.valueOf(n));
    }

}