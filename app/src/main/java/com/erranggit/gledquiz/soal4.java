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

public class soal4 extends Activity implements OnClickListener {

    Button submit;

    CheckBox cekdinar, cekpeso, cekbaht, cekbolivar;
    TextView outputscore;
    String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal4);

        submit = (Button) findViewById(R.id.submit);

        cekdinar = (CheckBox) findViewById(R.id.cdinar);
        cekpeso = (CheckBox) findViewById(R.id.cpeso);
        cekbaht = (CheckBox) findViewById(R.id.cbaht);
        cekbolivar = (CheckBox) findViewById(R.id.cbolivar);
        outputscore = (TextView) findViewById(R.id.tscore);

        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View klik) {
        // TODO Auto-generated method stub

        if (cekdinar.isChecked() && cekbaht.isChecked()
                && cekpeso.isChecked() && cekbolivar.isChecked()) {
            outputscore.setText("10");
        } else if (cekdinar.isChecked() && cekbaht.isChecked()
                && cekpeso.isChecked()) {
            outputscore.setText("15");
        } else if (cekdinar.isChecked() && cekbaht.isChecked()
                && cekbolivar.isChecked()) {
            outputscore.setText("15");
        } else if (cekbaht.isChecked() && cekpeso.isChecked()
                && cekbolivar.isChecked()) {
            outputscore.setText("0");
        } else if (cekdinar.isChecked() && cekbaht.isChecked()) {
            outputscore.setText("20");
        } else if (cekdinar.isChecked() && cekpeso.isChecked()) {
            outputscore.setText("5");
        } else if (cekdinar.isChecked() && cekbolivar.isChecked()) {
            outputscore.setText("5");
        } else if (cekdinar.isChecked() && cekbaht.isChecked()) {
            outputscore.setText("5");
        } else if (cekbolivar.isChecked() && cekbaht.isChecked()) {
            outputscore.setText("5");
        } else if (cekbolivar.isChecked() && cekpeso.isChecked()) {
            outputscore.setText("-10");
        } else if (cekdinar.isChecked()) {
            outputscore.setText("10");
        } else if (cekbaht.isChecked()) {
            outputscore.setText("-5");
        } else if (cekpeso.isChecked()) {
            outputscore.setText("-5");
        } else if (cekbolivar.isChecked()) {
            outputscore.setText("-5");
        } else {
            outputscore.setText("0");
        }

        cekdinar.setChecked(false);
        cekbaht.setChecked(false);
        cekpeso.setChecked(false);
        cekbolivar.setChecked(false);
    }


    public void goTosoal6Activity(View view) {
        Intent go_soal6 = new Intent(this, soal6.class);
        startActivity(go_soal6);

    }
}