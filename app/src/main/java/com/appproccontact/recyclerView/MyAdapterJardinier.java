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

public class MyAdapterJardinier extends RecyclerView.Adapter<MyAdapterJardinier.MyViewHolder> {


    private final List<Pair<String, String>> characters = Arrays.asList(
            Pair.create("Les Jardins du Sud Est", "Intervention toute hauteur, démontage, prise en charge d'arbres fragiles ou dangereux, suivi prsonnalisé..."),
            Pair.create("Jardinier 06", "Entretien des jardins, création de cascades, maçonneries paysagère..."),
            Pair.create("Vert Coop Services", "Plantation, maintenance d'arroasage, abattage, spécialiste de la taille d'olivier..."),
            Pair.create("Sun Jardin 06", "Notre société intervient pour la réalisation de tous vos travaux paysagers et met à votre service son savoir-faire pour réaliser des travaux d'aménagements de qualité."),
            Pair.create("Sc Jardin", "Forte de plus de 10 ans d'expérience, notre entreprise vous propose la création et l'entretien de vos espaces verts."),
            Pair.create("Jardins des collines", "Notre équipe de professionnels assure un travail de qualité et vous certifie des réalisations dans les meilleurs délais."),
            Pair.create("Azur Jardin Création", "Travail à domicile spécialisé dans la coupe de haies"),
            Pair.create("Bruno Jardin", "\n" +
                    "Jardinier de père en fils, je vous propose mes 30 ans d’expérience professionnelle et de passion pour entretenir et aménager vos espaces verts.\n" +
                    "\n"),
            Pair.create("Nice paysage", "Nous proposons ponctuellement ou tout au long de l'année des petits travaux de jardinage et des petits travaux de bricolage.\n" +
                    "\n"),
            Pair.create("Jardinage", "Ensemble, nous imaginons et réalisons votre jardin avec efficacité, confiance et respect de l'environnement.")
    );


    //Nombre total de cellules que contiendra la liste
    @Override
    public int getItemCount() {
        return characters.size();
    }

    // Créer la vue d'une cellule
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_my_row, parent, false);
        return new MyViewHolder(view);

    }

    //Applique une donnée à une vue
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pair<String, String> pair = characters.get(position);
        holder.display(pair);

    }

    class MyViewHolder extends RecyclerView.ViewHolder {

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
                    Intent i = new Intent(view.getContext(), DetailsJardinier.class);
                    view.getContext().startActivity(i);
                }

            });


        }

        //Affichage des données de la pair qui est fournie
        void display(Pair<String, String> pair) {
            currentPair = pair;
            titre.setText(pair.first);
            description.setText(pair.second);
        }
    }


}
