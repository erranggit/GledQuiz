package com.erranggit.gledquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class soalkedua extends Activity implements OnClickListener {

    Button submit;

    CheckBox cekdiamond, cekgems, cekbasalt, cekgold;
    TextView outputscore;
    String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soalkedua);

        submit = (Button) findViewById(R.id.submit);

        cekdiamond = (CheckBox) findViewById(R.id.cdiamond);
        cekgems = (CheckBox) findViewById(R.id.cgems);
        cekbasalt = (CheckBox) findViewById(R.id.cbasalt);
        cekgold = (CheckBox) findViewById(R.id.cgold);
        outputscore = (TextView) findViewById(R.id.tscore);

        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View klik) {
        // TODO Auto-generated method stub

        if (cekdiamond.isChecked() && cekbasalt.isChecked()
                && cekgems.isChecked() && cekgold.isChecked()) {
            outputscore.setText("10");
        } else if (cekdiamond.isChecked() && cekbasalt.isChecked()
                && cekgems.isChecked()) {
            outputscore.setText("15");
        } else if (cekdiamond.isChecked() && cekbasalt.isChecked()
                && cekgold.isChecked()) {
            outputscore.setText("15");
        } else if (cekbasalt.isChecked() && cekgems.isChecked()
                && cekgold.isChecked()) {
            outputscore.setText("0");
        } else if (cekdiamond.isChecked() && cekbasalt.isChecked()) {
            outputscore.setText("20");
        } else if (cekdiamond.isChecked() && cekgems.isChecked()) {
            outputscore.setText("5");
        } else if (cekdiamond.isChecked() && cekgold.isChecked()) {
            outputscore.setText("5");
        } else if (cekgems.isChecked() && cekbasalt.isChecked()) {
            outputscore.setText("5");
        } else if (cekgold.isChecked() && cekbasalt.isChecked()) {
            outputscore.setText("5");
        } else if (cekgold.isChecked() && cekgems.isChecked()) {
            outputscore.setText("-10");
        } else if (cekdiamond.isChecked()) {
            outputscore.setText("10");
        } else if (cekbasalt.isChecked()) {
            outputscore.setText("-5");
        } else if (cekgems.isChecked()) {
            outputscore.setText("-5");
        } else if (cekgold.isChecked()) {
            outputscore.setText("-5");
        } else {
            outputscore.setText("0");
        }

        cekdiamond.setChecked(false);
        cekbasalt.setChecked(false);
        cekgems.setChecked(false);
        cekgold.setChecked(false);
    }

    public void goTosoal3Activity(View view) {
        Intent go_soal3 = new Intent(this, soal3.class);
        startActivity(go_soal3);
    }
}