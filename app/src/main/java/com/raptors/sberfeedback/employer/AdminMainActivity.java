package com.raptors.sberfeedback.employer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.raptors.sberfeedback.LoginActivity;
import com.raptors.sberfeedback.R;

public class AdminMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main);
    }

    public void createPoll(View view)
    {
        Intent intent = new Intent(AdminMainActivity.this, CreatePollActivity.class);
        startActivity(intent);
    }
}
