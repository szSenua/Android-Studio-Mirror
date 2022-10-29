package com.example.mirror;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spn = (Spinner) findViewById(R.id.spn);
        spn.setOnItemSelectedListener(this);

        Spinner spn2 = (Spinner) findViewById(R.id.spn2);
        spn2.setEnabled(false);
        Intent intent = getIntent();
        String value = intent.getStringExtra("key");



        CheckBox check1 = (CheckBox)  findViewById(R.id.condition1);
        CheckBox check2 = (CheckBox)  findViewById(R.id.condition2);
        CheckBox check3 = (CheckBox)  findViewById(R.id.condition3);
        CheckBox check4 = (CheckBox)  findViewById(R.id.condition4);
        CheckBox check5 = (CheckBox)  findViewById(R.id.condition5);
        CheckBox check6 = (CheckBox)  findViewById(R.id.condition6);

        RadioGroup radio = (RadioGroup) findViewById(R.id.radioGroup);
        RadioButton button1 = (RadioButton) findViewById(R.id.radioButton1);
        RadioButton button2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton button3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton button4 = (RadioButton) findViewById(R.id.radioButton4);
        RadioButton button5 = (RadioButton) findViewById(R.id.radioButton5);
        RadioButton button6 = (RadioButton) findViewById(R.id.radioButton6);
        RadioGroup radio2 = (RadioGroup) findViewById(R.id.radioGroup2);
        EditText name1 = (EditText) findViewById(R.id.names);
        EditText name2 = (EditText) findViewById(R.id.names2);
        Button sb = (Button) findViewById(R.id.button);


        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                check4.setChecked(check1.isChecked());

            }
        });

        check2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                check5.setChecked(check2.isChecked());

            }
        });

        check3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                check6.setChecked(check3.isChecked());

            }
        });

        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                button4.setChecked(button1.isChecked());
                button5.setChecked(button2.isChecked());
                button6.setChecked(button3.isChecked());
            }
        });

        name1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                name2.setText(name1.getText());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });



        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                spn2.setSelection(spn.getSelectedItemPosition());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
<<<<<<< HEAD

        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Info.class);
                String edit_text = name1.getText().toString();

                myIntent.putExtra("La frase: ", edit_text);
                myIntent.putExtra("Final Fantasy: ", check1.isChecked());//Optional parameters
                myIntent.putExtra("Anime: ", check2.isChecked());
                myIntent.putExtra("Motos: ", check3.isChecked());

                myIntent.putExtra("Apple: ", button1.isChecked());
                myIntent.putExtra("Xiaomi: ", button2.isChecked());
                myIntent.putExtra("Samsung: ", button3.isChecked());


                myIntent.putExtra("Spinner_item", spn.getSelectedItem().toString());

                MainActivity.this.startActivity(myIntent);
            }
        });


=======
>>>>>>> 7e3c56fc5df447c5e79f6097250aeaabb3e1968f
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String item = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG).show();
<<<<<<< HEAD

=======
>>>>>>> 7e3c56fc5df447c5e79f6097250aeaabb3e1968f
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
