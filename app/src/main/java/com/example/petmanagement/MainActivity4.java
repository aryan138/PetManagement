package com.example.petmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DogAdapter adapter;
    private List<Dog> dogList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        dogList = new ArrayList<>();
        dogList.add(new Dog(R.drawable.dog1, "Golden Retriever", "10-12 years","Golden Retriever","Intelligent, Friendly, Devoted, Kind, Trustworthy, Confident"));
        dogList.add(new Dog(R.drawable.dog2, "German Shepherd", "9-13 years","German Shepherd","Loyal, Courageous, Confident, Alert, Intelligent, Watchful"));
        dogList.add(new Dog(R.drawable.dog3, "Beagle", "12-15 years","Beagle","Merry, Friendly, Curious, Excitable, Determined, Amiable"));
        dogList.add(new Dog(R.drawable.dog4, "Poodle", "12-15 years","Poodle","Active, Alert, Faithful, Intelligent, Trainable, Instinctual"));
        dogList.add(new Dog(R.drawable.dog5, "Bulldog", "8-10 years","Bulldog","Active, Alert, Faithful, Intelligent, Trainable, Instinctual"));
        // Add more dogs here

        adapter = new DogAdapter(dogList);
        recyclerView.setAdapter(adapter);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

}