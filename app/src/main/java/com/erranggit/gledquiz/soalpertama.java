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

public class soalpertama extends Activity implements OnClickListener {

    Button submit;

    CheckBox cekrevolution, cekrotation, cekorbit, cekphase;
    TextView outputscore;
    String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soalpertama);

        submit = (Button) findViewById(R.id.submit);

        cekrevolution = (CheckBox) findViewById(R.id.crevolution);
        cekrotation = (CheckBox) findViewById(R.id.crotation);
        cekorbit = (CheckBox) findViewById(R.id.corbit);
        cekphase = (CheckBox) findViewById(R.id.cphase);
        outputscore = (TextView) findViewById(R.id.tscore);

        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View klik) {
        // TODO Auto-generated method stub

        if (cekrevolution.isChecked() && cekorbit.isChecked()
                && cekrotation.isChecked() && cekphase.isChecked()) {
            outputscore.setText("10");
        } else if (cekrevolution.isChecked() && cekorbit.isChecked()
                && cekrotation.isChecked()) {
            outputscore.setText("15");
        } else if (cekrevolution.isChecked() && cekorbit.isChecked()
                && cekphase.isChecked()) {
            outputscore.setText("15");
        } else if (cekorbit.isChecked() && cekrotation.isChecked()
                && cekphase.isChecked()) {
            outputscore.setText("0");
        } else if (cekrevolution.isChecked() && cekorbit.isChecked()) {
            outputscore.setText("20");
        } else if (cekrevolution.isChecked() && cekrotation.isChecked()) {
            outputscore.setText("5");
        } else if (cekrevolution.isChecked() && cekphase.isChecked()) {
            outputscore.setText("5");
        } else if (cekrevolution.isChecked() && cekorbit.isChecked()) {
            outputscore.setText("5");
        } else if (cekphase.isChecked() && cekorbit.isChecked()) {
            outputscore.setText("5");
        } else if (cekphase.isChecked() && cekrotation.isChecked()) {
            outputscore.setText("-10");
        } else if (cekrevolution.isChecked()) {
            outputscore.setText("10");
        } else if (cekorbit.isChecked()) {
            outputscore.setText("-5");
        } else if (cekrotation.isChecked()) {
            outputscore.setText("-5");
        } else if (cekphase.isChecked()) {
            outputscore.setText("-5");
        } else {
            outputscore.setText("0");
        }

        cekrevolution.setChecked(false);
        cekorbit.setChecked(false);
        cekrotation.setChecked(false);
        cekphase.setChecked(false);
    }


    public void goTosoalkeduaActivity(View view) {
        Intent go_soalkedua = new Intent(this, soalkedua.class);
        startActivity(go_soalkedua);

    }
}