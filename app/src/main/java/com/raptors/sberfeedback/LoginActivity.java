package com.raptors.sberfeedback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.raptors.sberfeedback.employee.AvailablePollsActivity;
import com.raptors.sberfeedback.employer.AdminMainActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editTextTextPersonName);
                Intent intent;
                if (editText.getText().toString().equals("admin")) {
                    intent = new Intent(LoginActivity.this, AdminMainActivity.class);
                }
                else {
                    intent = new Intent(LoginActivity.this, AvailablePollsActivity.class);
                }
                startActivity(intent);
            }
        });
    }
}