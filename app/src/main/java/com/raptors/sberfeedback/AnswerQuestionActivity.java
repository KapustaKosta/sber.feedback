package com.raptors.sberfeedback;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.raptors.sberfeedback.modules.Question;

public class AnswerQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_question);
        long id = getIntent().getLongExtra("id", 0);
        ListView lv = findViewById(R.id.list_view_questions);
        QuestionAdapter adapter = new
    }
}

class QuestionAdapter extends ArrayAdapter<Question> {
    public QuestionAdapter(@NonNull Context context, int resource, @NonNull Question[] objects) {
        super(context, resource, objects);
    }
}