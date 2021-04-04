package com.raptors.sberfeedback.modules;

import java.util.ArrayList;

public class Poll {
    private ArrayList<Filter> filters;
    private ArrayList<Question> questions;

    public String getName() {
        return name;
    }

    private String name;
    private int id;

    public int getId() {
        return id;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getQuestionsSize() {
        return questions.size();
    }

    public Poll(String name, ArrayList<Question> questions, ArrayList<Filter> filters) {
        this.name = name;
        this.questions = questions;
        this.filters = filters;
        id = PollsAndFilters.getPolls().size() + 1;
    }

    public Poll(String str) {
        name = str;
    }

    @Override
    public String toString() {
        return name;
    }
}
