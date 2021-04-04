package com.raptors.sberfeedback.modules;

import android.widget.EditText;
import android.widget.TextView;

public class TextQuestion extends Question {
    private EditText editText;
    private String answer;

    public TextQuestion(TextView questionTextView, String questionText) {
        super(questionTextView, questionText);
    }
}
