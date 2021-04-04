package com.raptors.sberfeedback.modules;

import java.util.ArrayList;

public class PollsAndFilters {
    private static ArrayList<Filter> filters;
    private static ArrayList<Poll> polls;

    static {
        filters = new ArrayList<>();
        polls = new ArrayList<>();
        polls.add(new Poll("ghkl;sd"));
        polls.add(new Poll("ahioghe"));
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new TextQuestion("question 1"));
        questions.add(new TextQuestion("question 2"));
        ArrayList<Filter> filters = null;
        Poll poll = new Poll("name", questions, filters);
        polls.add(poll);
    }

    public static ArrayList<Filter> getFilters() {
        return filters;
    }

    public static ArrayList<Poll> getPolls() {
        return polls;
    }

    public static void addPoll(Poll poll) {
        polls.add(poll);
    }

    public static void addFilter(Filter filter) {
        filters.add(filter);
    }
}
