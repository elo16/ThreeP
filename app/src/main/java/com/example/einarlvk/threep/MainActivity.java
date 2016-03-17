package com.example.einarlvk.threep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Button mButton1, mButton2,mSeqButton;
    private int[] mCurrSeq = new int[5];
    private int mCurrentIndex = 0;



    private void updateSequence(){
        for(int i = 0; i < mCurrSeq.length ; i++){
            int buttonNo =(int) Math.floor(Math.random()*2);

            mCurrSeq[i]= buttonNo;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSeqButton = (Button) findViewById(R.id.seqButton);
        mSeqButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

        mButton1 = (Button) findViewById(R.id.button1);
        mButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, R.string.Button1_toast, Toast.LENGTH_SHORT).show();
            }
        });

        mButton2 = (Button) findViewById(R.id.button2);
        mButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, R.string.Button2_toast, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
