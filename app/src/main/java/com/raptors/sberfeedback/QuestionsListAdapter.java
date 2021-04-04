package com.raptors.sberfeedback;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.raptors.sberfeedback.modules.Poll;
import com.raptors.sberfeedback.modules.Question;

import java.util.List;

public class QuestionsListAdapter extends ArrayAdapter<Question> {
    List<Question> questionsList;

    Context context;

    int resource;

    public QuestionsListAdapter(Context context, int resource, List<Question> questionsList) {
        super(context, resource, questionsList);
        this.context = context;
        this.resource = resource;
        this.questionsList = questionsList;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(resource, null, false);


        Question question = questionsList.get(position);

        return view;
    }

    private void removeHero(final int position) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Are you sure you want to delete this?");

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                questionsList.remove(position);

                notifyDataSetChanged();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
