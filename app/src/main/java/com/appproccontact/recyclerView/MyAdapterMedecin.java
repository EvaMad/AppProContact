package com.appproccontact.recyclerView;

import android.content.Intent;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.firebaseemailpasswordexample.R;

import java.util.Arrays;
import java.util.List;

public class MyAdapterMedecin extends RecyclerView.Adapter<MyAdapterMedecin.MyViewHolder> {

    private final List<Pair<String, String>> characters = Arrays.asList(
            Pair.create("Georges Méthot", "Médecin Généraliste"),
            Pair.create("Jean-Luc Baldin", "Gastro-entérologue, Chirurgien généraliste, Hépathologue"),
            Pair.create("Erwan Genoux", "Chirurgien de la face et du cou"),
            Pair.create("Andréa Slim", "Prise de tension, de température, l’auscultation, la vaccination"),
            Pair.create("Sabrina", "Médecin Généraliste"),
            Pair.create("Philippe Kestemont", "Médecin Généraliste"),
            Pair.create("Jean Baretge", "Médecin Généraliste"),
            Pair.create("Angus Hand", "Médecin Généraliste" +
                    "Médecin Généraliste" +
                    "\n"),
            Pair.create("Jean Pierre Costet", "Médecin Généraliste" +
                    "\n"),
            Pair.create("Stéphanie Etesse", "Médecin Généraliste")
    );

    @Override
    public int getItemCount() {
        return characters.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pair<String, String> pair = characters.get(position);
        holder.display(pair);
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView titre;
        private final TextView description;

        private Pair<String, String> currentPair;

        MyViewHolder(final View itemView) {
            super(itemView);

            titre = itemView.findViewById(R.id.jobTitle);
            description = itemView.findViewById(R.id.jobDescription);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), DetailsMedecin.class);
                    view.getContext().startActivity(i);
                }

            });

        }

        void display(Pair<String, String> pair) {
            currentPair = pair;
            titre.setText(pair.first);
            description.setText(pair.second);
        }
    }

}
