package com.raptors.sberfeedback;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

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
        Poll poll = PollsAndFilters.getPolls().get((int)id);
        QuestionAdapter adapter = new QuestionAdapter(this, R.layout.list_view_item_question, poll.getQuestions());
        Button btn = findViewById(R.id.button_ready);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

class QuestionAdapter extends ArrayAdapter<Question> {
    public QuestionAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Question> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Question question = getItem(position);
//        final MyMonth month = getItem(position);
//
//        if (convertView == null) {
//            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_item, null);
//        }
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view_item_question, null);
        }

        ((TextView) convertView.findViewById(R.id.text_view)).setText(question.getQuestionText());
        EditText et = (EditText) convertView.findViewById(R.id.edit_text);


//
//// Заполняем адаптер
//        ((TextView) convertView.findViewById(R.id.textView)).setText(month.month);
//        ((TextView) convertView.findViewById(R.id.textView2)).setText(String.valueOf(month.temp));
//        ((TextView) convertView.findViewById(R.id.textView3)).setText(String.valueOf(month.days));
//// Выбираем картинку для месяца
//        if (month.temp > 0.)
//            ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.sun);
//        else
//            ((ImageView) convertView.findViewById(R.id.imageView)).setImageResource(R.drawable.snow);
//
//        CheckBox ch = (CheckBox) convertView.findViewById(R.id.checkBox);
//        ch.setChecked(month.like);
//        ch.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                month.like = ((CheckBox) v).isChecked();
//            }
//        });
        return convertView;
    }
}