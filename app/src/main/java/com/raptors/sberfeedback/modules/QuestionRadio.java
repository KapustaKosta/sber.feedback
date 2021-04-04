package com.raptors.sberfeedback.modules;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class QuestionRadio extends Question {
    private ArrayList<String> variants;
    private RadioGroup radioGroup;
    private ArrayList<RadioButton> radioButtons;
    private String answer;

    public QuestionRadio(TextView questionTextView, String questionText) {
        super(questionTextView, questionText);
    }

    public ArrayList<String> getVariants() {
        return variants;
    }
}
