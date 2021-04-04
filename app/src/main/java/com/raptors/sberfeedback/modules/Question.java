package com.raptors.sberfeedback.modules;

import android.widget.TextView;

public class Question {
    private TextView questionTextView;
    private String questionText;

    public String getQuestionText() {
        return questionText;
    }

    public Question(TextView questionTextView, String questionText) {
        this.questionTextView = questionTextView;
        this.questionText = questionText;
    }
}
