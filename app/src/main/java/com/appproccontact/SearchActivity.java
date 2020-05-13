package com.appproccontact;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.appproccontact.recyclerView.BoulangerActivity;
import com.appproccontact.recyclerView.JardinierActivity;
import com.appproccontact.recyclerView.MedecinActivity;
import com.example.firebaseemailpasswordexample.R;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    SearchView searchView;
    ListView myList;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchView = findViewById(R.id.searchView);
        myList = findViewById(R.id.myList);

        list =new ArrayList<String>();

        list.add("Boulanger");
        list.add("Jardinier");
        list.add("Médecin");
        list.add("Infirmière");
        list.add("Psychologue");
        list.add("Pilote");
        list.add("Avocat");
        list.add("Dentiste");
        list.add("Mécanicien");
        list.add("Vétérinaire");
        list.add("Photogrpahe");
        list.add("Comptable");
        list.add("Architecte");
        list.add("Pédiatre");
        list.add("Biologiste");
        list.add("Musicien");
        list.add("Ingénieur en informatique");
        list.add("Coiffeur");
        list.add("Ingénieur civil");
        list.add("Ingénieur logiciel");

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, list);
        myList.setAdapter(adapter);

       myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position==0){
                   Intent i = new Intent(SearchActivity.this, BoulangerActivity.class);
                   startActivity(i);
               }
               if (position==1){
                   Intent i = new Intent(SearchActivity.this, JardinierActivity.class);
                   startActivity(i);
               }
               if (position==2){
                   Intent i = new Intent(SearchActivity.this, MedecinActivity.class);
                   startActivity(i);
               }
           }
       });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });
    }
}

