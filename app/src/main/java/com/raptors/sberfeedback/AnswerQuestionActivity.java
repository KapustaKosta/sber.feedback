package com.raptors.sberfeedback;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.raptors.sberfeedback.modules.Poll;
import com.raptors.sberfeedback.modules.PollsAndFilters;
import com.raptors.sberfeedback.modules.Question;

import java.util.ArrayList;

public class AnswerQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_question);
        long id = getIntent().getLongExtra("id", 0);
        ListView lv = findViewById(R.id.list_view_questions);
        Poll poll = PollsAndFilters.getPolls().get((int)id-1);
        QuestionAdapter adapter = new QuestionAdapter(this, R.layout.list_view_item_question, poll.getQuestions());
    }
}

class QuestionAdapter extends ArrayAdapter<Question> {
    public QuestionAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Question> objects) {
        super(context, resource, objects);
    }
}