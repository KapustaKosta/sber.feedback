package com.raptors.sberfeedback.employee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.raptors.sberfeedback.AnswerQuestionActivity;
import com.raptors.sberfeedback.R;
import com.raptors.sberfeedback.modules.Poll;
import com.raptors.sberfeedback.modules.PollsAndFilters;

public class AvailablePollsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_polls);
        ListView lv = findViewById(R.id.list_view_polls);
        ArrayAdapter<Poll> adapter = new ArrayAdapter<Poll>(this, R.layout.list_view_item_string, PollsAndFilters.getPolls());
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(AvailablePollsActivity.this, AnswerQuestionActivity.class);

            }
        });
    }
}