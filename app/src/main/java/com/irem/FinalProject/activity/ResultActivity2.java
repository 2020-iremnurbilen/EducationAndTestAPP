package com.irem.FinalProject.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.irem.FinalProject.R;

public class ResultActivity2 extends AppCompatActivity {

    LinearLayout home;
    TextView correctt, wrongt, resultinfo, resulttext;
    ImageView resultImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        home = findViewById(R.id.returnHome);
        correctt = findViewById(R.id.correctt);
        wrongt = findViewById(R.id.wrongt);
        resultinfo = findViewById(R.id.resultInfo);
        resultImage = findViewById(R.id.resultImage);
        resulttext = findViewById(R.id.resultTextview);
        resulttext.setText("Return to Homepage");


        int correct = getIntent().getIntExtra("correct",0);
        int wrong = getIntent().getIntExtra("wrong",0);

        correctt.setText("Correct: " + correct);
        wrongt.setText("Wrong: " + wrong);

        if (correct >= 0 && correct <= 2) {
            resultinfo.setText("You have to take the test again");
            resultImage.setImageResource(R.drawable.ic_sad_face);
        } else if (correct >= 3 && correct <= 5) {
            resultinfo.setText("You have to try a little more");
            resultImage.setImageResource(R.drawable.ic_neutral_face);
        } else if (correct >= 6 && correct <= 8) {
            resultinfo.setText("You're pretty good");
            resultImage.setImageResource(R.drawable.ic_smile_face);
        } else {
            resultinfo.setText("You are very good congratulations");
            resultImage.setImageResource(R.drawable.ic_smile_face);
        }

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent cnn = new Intent( ResultActivity2.this, MainActivity.class );
                startActivity( cnn );
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent cnn = new Intent( ResultActivity2.this, MainActivity2.class );
        startActivity( cnn );
        finish();
    }
}