package com.palmtechy.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void onBtnClick(View view){
        TextView txtFirst = findViewById(R.id.edtFirstName);
        EditText edtFirst = findViewById(R.id.txtFirstName);

        txtFirst.setText( edtFirst.getText().toString());

        TextView txtLast = findViewById(R.id.edtLastName);
        EditText edtLast = findViewById(R.id.txtLastName);

        txtLast.setText( edtLast.getText().toString());

        TextView txtEmail = findViewById(R.id.edtEmail);
        EditText edtEmail = findViewById(R.id.txtEmail);

        txtEmail.setText( edtEmail.getText().toString());
    }

}