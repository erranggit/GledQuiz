package com.erranggit.gledquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.erranggit.gledquiz.MainActivity;
import com.erranggit.gledquiz.R;

public class soal6 extends Activity implements OnClickListener {

    Button submit;

    CheckBox cekholland, cekturkey, cekspain, cekmaladewa;
    TextView outputscore;
    String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal6);

        submit = (Button) findViewById(R.id.submit);

        cekholland = (CheckBox) findViewById(R.id.cholland);
        cekturkey = (CheckBox) findViewById(R.id.cturkey);
        cekspain = (CheckBox) findViewById(R.id.cspain);
        cekmaladewa = (CheckBox) findViewById(R.id.cmaladewa);
        outputscore = (TextView) findViewById(R.id.tscore);

        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View klik) {
        // TODO Auto-generated method stub

        if (cekturkey.isChecked() && cekspain.isChecked()
                && cekholland.isChecked() && cekmaladewa.isChecked()) {
            outputscore.setText("10");
        } else if (cekturkey.isChecked() && cekspain.isChecked()
                && cekholland.isChecked()) {
            outputscore.setText("15");
        } else if (cekturkey.isChecked() && cekspain.isChecked()
                && cekmaladewa.isChecked()) {
            outputscore.setText("15");
        } else if (cekspain.isChecked() && cekturkey.isChecked()
                && cekmaladewa.isChecked()) {
            outputscore.setText("0");
        } else if (cekturkey.isChecked() && cekspain.isChecked()) {
            outputscore.setText("20");
        } else if (cekturkey.isChecked() && cekholland.isChecked()) {
            outputscore.setText("5");
        } else if (cekturkey.isChecked() && cekmaladewa.isChecked()) {
            outputscore.setText("5");
        } else if (cekholland.isChecked() && cekspain.isChecked()) {
            outputscore.setText("5");
        } else if (cekmaladewa.isChecked() && cekspain.isChecked()) {
            outputscore.setText("5");
        } else if (cekmaladewa.isChecked() && cekholland.isChecked()) {
            outputscore.setText("-10");
        } else if (cekturkey.isChecked()) {
            outputscore.setText("10");
        } else if (cekspain.isChecked()) {
            outputscore.setText("-5");
        } else if (cekholland.isChecked()) {
            outputscore.setText("-5");
        } else if (cekmaladewa.isChecked()) {
            outputscore.setText("-5");
        } else {
            outputscore.setText("0");
        }

        cekturkey.setChecked(false);
        cekspain.setChecked(false);
        cekholland.setChecked(false);
        cekmaladewa.setChecked(false);
    }

    public void goToMainActivity(View view) {
        Intent go_MainActivity = new Intent(this, MainActivity.class);
        Toast.makeText(this, "You're Done!", Toast.LENGTH_SHORT).show();
        startActivity(go_MainActivity);
    }
}