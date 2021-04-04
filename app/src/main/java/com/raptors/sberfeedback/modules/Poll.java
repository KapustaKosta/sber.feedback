package com.raptors.sberfeedback.modules;

import java.util.ArrayList;

public class Poll {
    private ArrayList<Filter> filters;
    private ArrayList<Question> questions;
    private int id;

    public int getQuestionsSize() {
        return questions.size();
    }
}
