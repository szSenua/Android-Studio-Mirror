package com.example.mirror;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        TextView receiver_msg = (TextView) findViewById(R.id.message);
        CheckBox finalfantasy = (CheckBox) findViewById(R.id.condition1);
        CheckBox anime = (CheckBox) findViewById(R.id.condition2);
        CheckBox motos = (CheckBox) findViewById(R.id.condition3);
        RadioGroup radio = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton radio1 = (RadioButton) findViewById(R. id.radioButton1);
        RadioButton radio2 = (RadioButton) findViewById(R. id.radioButton2);
        RadioButton radio3 = (RadioButton) findViewById(R. id.radioButton3);
        TextView spinner_text = (TextView) findViewById(R.id.spinner_text);

        Intent intent = getIntent();
        String str = intent.getStringExtra("La frase: ");
        receiver_msg.setText(str);
        finalfantasy.setChecked(intent.getBooleanExtra("Final Fantasy: ", false));
        anime.setChecked(intent.getBooleanExtra("Anime: ", false));
        motos.setChecked(intent.getBooleanExtra("Motos: ", false));
        radio1.setChecked(intent.getBooleanExtra("Apple: ", false));
        radio2.setChecked(intent.getBooleanExtra("Xiaomi: ", false));
        radio3.setChecked(intent.getBooleanExtra("Samsung: ", false));
        Bundle extras = getIntent().getExtras();
        String transportItemChosen = extras.getString("Spinner_item");
        spinner_text.setText(transportItemChosen);

    }
}