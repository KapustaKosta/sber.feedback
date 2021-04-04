package com.raptors.sberfeedback.employer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.raptors.sberfeedback.QuestionsListAdapter;
import com.raptors.sberfeedback.R;
import com.raptors.sberfeedback.modules.Question;

import java.util.ArrayList;

public class CreatePollActivity extends AppCompatActivity {

    private ListView questionsListView;
    private ArrayList<Question> questions;
    QuestionsListAdapter questionsListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_poll);
        questions = new ArrayList<Question>();
        questionsListView = findViewById(R.id.questionsListViewPollCreating);
        questionsListAdapter = new QuestionsListAdapter(this, R.layout.question_item, questions);
        questionsListView.setAdapter(questionsListAdapter);
        Button btn = findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void addQuestion(View view)
    {
        questions.add(new Question("null"));
        questionsListAdapter.notifyDataSetChanged();
        questionsListView.invalidateViews();
    }
}