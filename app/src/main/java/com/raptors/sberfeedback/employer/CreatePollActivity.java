package com.raptors.sberfeedback.employer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.raptors.sberfeedback.QuestionsListAdapter;
import com.raptors.sberfeedback.R;
import com.raptors.sberfeedback.modules.Question;

import java.util.ArrayList;

public class CreatePollActivity extends AppCompatActivity {

    private ListView questionsListView;
    private ArrayList<Question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_poll);
        QuestionsListAdapter questionsListAdapter = new QuestionsListAdapter(this, R.layout.question_item, questions);
        questionsListView.setAdapter(questionsListAdapter);
    }

    public void addQuestion(View view)
    {
        questions.add(null);
    }
}