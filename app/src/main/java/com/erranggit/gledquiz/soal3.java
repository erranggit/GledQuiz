package com.erranggit.gledquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.erranggit.gledquiz.R;

public class soal3 extends Activity implements OnClickListener {

    Button submit;

    CheckBox cek1, cek2, cek3, cek4;
    TextView outputscore;
    String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal3);

        submit = (Button) findViewById(R.id.submit);

        cek1 = (CheckBox) findViewById(R.id.c1);
        cek2 = (CheckBox) findViewById(R.id.c2);
        cek3 = (CheckBox) findViewById(R.id.c3);
        cek4 = (CheckBox) findViewById(R.id.c4);
        outputscore = (TextView) findViewById(R.id.tscore);

        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View klik) {
        // TODO Auto-generated method stub

        if (cek2.isChecked() && cek3.isChecked()
                && cek1.isChecked() && cek4.isChecked()) {
            outputscore.setText("10");
        } else if (cek2.isChecked() && cek3.isChecked()
                && cek1.isChecked()) {
            outputscore.setText("15");
        } else if (cek2.isChecked() && cek3.isChecked()
                && cek4.isChecked()) {
            outputscore.setText("15");
        } else if (cek3.isChecked() && cek1.isChecked()
                && cek4.isChecked()) {
            outputscore.setText("0");
        } else if (cek2.isChecked() && cek3.isChecked()) {
            outputscore.setText("20");
        } else if (cek2.isChecked() && cek1.isChecked()) {
            outputscore.setText("5");
        } else if (cek2.isChecked() && cek4.isChecked()) {
            outputscore.setText("5");
        } else if (cek1.isChecked() && cek3.isChecked()) {
            outputscore.setText("5");
        } else if (cek4.isChecked() && cek3.isChecked()) {
            outputscore.setText("5");
        } else if (cek4.isChecked() && cek1.isChecked()) {
            outputscore.setText("-10");
        } else if (cek2.isChecked()) {
            outputscore.setText("10");
        } else if (cek3.isChecked()) {
            outputscore.setText("-5");
        } else if (cek1.isChecked()) {
            outputscore.setText("-5");
        } else if (cek4.isChecked()) {
            outputscore.setText("-5");
        } else {
            outputscore.setText("0");
        }

        cek2.setChecked(false);
        cek3.setChecked(false);
        cek1.setChecked(false);
        cek4.setChecked(false);
    }

    public void goTosoal4Activity(View view) {
        Intent go_soal4 = new Intent(this, soal4.class);
        startActivity(go_soal4);
    }
}