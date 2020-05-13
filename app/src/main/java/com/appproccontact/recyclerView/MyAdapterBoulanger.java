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

public class MyAdapterBoulanger extends RecyclerView.Adapter<MyAdapterBoulanger.MyViewHolder> {

    private final List<Pair<String, String>> characters = Arrays.asList(
            Pair.create("Boulangerie Jean Marc", "Elle a gagné le trophée de la meilleure baguette des Alpes-Maritimes, cette maison est réputée pour ses pâtisseries artisanales et propose une gamme de pain incroyable. "),
            Pair.create("Boulangerie la Niçoise", "Cette boulangerie fait partie des meilleures de la ville avec ses pains au levain nature"),
            Pair.create("Boulangerie le Fournil", "Tous les produits y sont bons : la baguette artisanale, les viennoiseries intemporelles et petite mention spéciale pour les fougasses et les bugnes"),
            Pair.create("Boulangerie du col", "Une boulangerie-pâtisserie qui propose des créations exquises "),
            Pair.create("Boulangerie Jean Marc", "Elle a gagné le trophée de la meilleure baguette des Alpes-Maritimes, cette maison est réputée pour ses pâtisseries artisanales et propose une gamme de pain incroyable. "),
            Pair.create("Boulangerie la Niçoise", "Cette boulangerie fait partie des meilleures de la ville avec ses pains au levain nature"),
            Pair.create("Boulangerie le Fournil", "Tous les produits y sont bons : la baguette artisanale, les viennoiseries intemporelles et petite mention spéciale pour les fougasses et les bugnes"),
            Pair.create("Boulangerie du col", "Une boulangerie-pâtisserie qui propose des créations exquises "),
            Pair.create("Boulangerie Jean Marc", "Elle a gagné le trophée de la meilleure baguette des Alpes-Maritimes, cette maison est réputée pour ses pâtisseries artisanales et propose une gamme de pain incroyable. "),
            Pair.create("Boulangerie la Niçoise", "Cette boulangerie fait partie des meilleures de la ville avec ses pains au levain nature")
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
                    Intent i = new Intent(view.getContext(), DetailsBoulanger.class);
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