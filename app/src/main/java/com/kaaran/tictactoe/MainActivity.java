package com.kaaran.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buClick(View view) {
        Button buSelected = (Button) view;
        int cellId=0;
        switch (buSelected.getId())
        {
            case R.id.bu1:
                cellId=1;
                break;
            case R.id.bu2:
                cellId=2;
                break;
            case R.id.bu3:
                cellId=3;
                break;
            case R.id.bu4:
                cellId=4;
                break;
            case R.id.bu5:
                cellId=5;
                break;
            case R.id.bu6:
                cellId=6;
                break;
            case R.id.bu7:
                cellId=7;
                break;
            case R.id.bu8:
                cellId=8;
                break;
            case R.id.bu9:
                cellId=9;
                break;
        }
        PlayGame(cellId,buSelected);

    }
    int Activeplayer=1;
    ArrayList<Integer> player1=new ArrayList<Integer>();
    ArrayList<Integer> player2=new ArrayList<Integer>();
    void PlayGame(int cellId,Button buSelected)
    {
        Log.d("Player",String.valueOf(cellId));
        if(Activeplayer==1)
        {
            buSelected.setText("X");
            player1.add(cellId);
            buSelected.setBackgroundColor(Color.RED);
            Activeplayer=2;

        }
        else if(Activeplayer==2)
        {
            buSelected.setText("O");
            player2.add(cellId);
            buSelected.setBackgroundColor(Color.GREEN);
            Activeplayer=1;
        }
        buSelected.setEnabled(false);
        CheckWinner();

    }
    void CheckWinner()
    {
        int winner=-1;
        //Row1
        if(player1.contains(1)&&player1.contains(2)&&player1.contains(3)){
            winner=1;
        }
        if(player2.contains(1)&&player2.contains(2)&&player2.contains(3)){
            winner=2;
        }
        //Row2
        if(player1.contains(4)&&player1.contains(5)&&player1.contains(6)){
            winner=1;
        }
        if(player2.contains(4)&&player2.contains(5)&&player2.contains(6)){
            winner=2;
        }
        //Row3
        if(player1.contains(7)&&player1.contains(8)&&player1.contains(9)){
            winner=1;
        }
        if(player2.contains(7)&&player2.contains(8)&&player2.contains(9)){
            winner=2;
        }
        //Col1
        if(player1.contains(1)&&player1.contains(4)&&player1.contains(7)){
            winner=1;
        }
        if(player2.contains(1)&&player2.contains(4)&&player2.contains(7)){
            winner=2;
        }
        //Col2
        if(player1.contains(2)&&player1.contains(5)&&player1.contains(8)){
            winner=1;
        }
        if(player2.contains(2)&&player2.contains(5)&&player2.contains(8)){
            winner=2;
        }
        //Col3
        if(player1.contains(3)&&player1.contains(6)&&player1.contains(9)){
            winner=1;
        }
        //Cross1
        if(player1.contains(1)&&player1.contains(5)&&player1.contains(9)){
            winner=1;
        }
        if(player2.contains(1)&&player2.contains(5)&&player2.contains(9)){
            winner=2;
        }
        //Cross2
        if(player1.contains(3)&&player1.contains(5)&&player1.contains(7)){
            winner=1;
        }
        if(player2.contains(3)&&player2.contains(5)&&player2.contains(7)){
            winner=2;
        }
        if(winner!=-1)
        {
            if(winner==1)
            {
            Toast.makeText(this,"Player 1 Wins",Toast.LENGTH_LONG).show();
            }
            else if(winner==2)
            {
                Toast.makeText(this,"Player 2 Wins",Toast.LENGTH_LONG).show();

            }
            else
            {
                Toast.makeText(this,"DRAW",Toast.LENGTH_LONG).show();

            }
        }
    }

    }
