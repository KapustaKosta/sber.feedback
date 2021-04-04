package com.raptors.sberfeedback.modules;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Admin {
    private ArrayList<Filter> filters;
    private ArrayList<Poll> polls;

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    public void createPoll(String name, ArrayList<Filter> filters, ArrayList<Question> questions) {
        Poll poll = new Poll(name, questions, filters);
        polls.add(poll);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference(  Integer.toString(poll.getId())).child("Name");
        databaseReference.setValue(poll.getName());
        for (Question question : questions)
        {
            databaseReference = firebaseDatabase.getReference(  Integer.toString(poll.getId())).child("Questions").child(question.getQuestionText()).child("Text");
            databaseReference.setValue(poll.getName());
            if(question instanceof TextQuestion)
            {
                databaseReference = firebaseDatabase.getReference(  Integer.toString(poll.getId())).child("Questions").child(question.getQuestionText()).child("Type");
                databaseReference.setValue("TextQuestion");
            }
            if(question instanceof QuestionRadio)
            {
                databaseReference = firebaseDatabase.getReference(  Integer.toString(poll.getId())).child("Questions").child(question.getQuestionText()).child("Type");
                databaseReference.setValue("RadioQuestion");
                QuestionRadio questionRadio = (QuestionRadio) question;
                for(int i = 0; i < questionRadio.getVariants().size(); i++)
                {
                    databaseReference = firebaseDatabase.getReference(  Integer.toString(poll.getId())).child("Questions").child(question.getQuestionText()).child("Variants").child(Integer.toString(i));
                    databaseReference.setValue(questionRadio.getVariants().get(i));
                }
            }
        }
    }

    public void createQuestion() {

    }

    public ArrayList<Filter> getFilters() {
        return filters;
    }

}
