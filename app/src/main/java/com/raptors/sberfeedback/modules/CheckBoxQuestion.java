package com.raptors.sberfeedback.modules;

import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class CheckBoxQuestion extends Question {
    private ArrayList<String> variants;
    private ArrayList<CheckBox> checkBoxes;
    private ArrayList<String> answers;

    public CheckBoxQuestion(String questionText) {
        super(questionText);
    }
}
