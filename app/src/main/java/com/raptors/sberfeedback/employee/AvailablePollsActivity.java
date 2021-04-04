package com.raptors.sberfeedback.employee;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import com.raptors.sberfeedback.R;

public class AvailablePollsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_polls);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_view_item_string);
    }
}