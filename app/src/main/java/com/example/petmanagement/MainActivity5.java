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

public class MainActivity5 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CatAdapter adapter;
    private List<Cat> catList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main5);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        catList = new ArrayList<>();
        catList.add(new Cat(R.drawable.cat1, "American Shorthair", "15-20 years", "Domestic Shorthair", "Friendly, Gentle, Loyal, Playful, Quiet"));
        catList.add(new Cat(R.drawable.cat2, "Persian", "12-15 years", "Persian", "Sweet, Quiet, Intelligent, Affectionate, Calm"));
        catList.add(new Cat(R.drawable.cat3, "Siamese", "12-15 years", "Siamese", "Affectionate, Social, Vocal, Intelligent, Energetic"));
        catList.add(new Cat(R.drawable.cat4, "Maine Coon", "12-15 years", "Maine Coon", "Gentle, Friendly, Adaptable, Playful, Intelligent"));
        catList.add(new Cat(R.drawable.cat5, "Bengal", "12-15 years", "Bengal", "Active, Intelligent, Curious, Athletic, Social"));
        // Add more cats here

        adapter = new CatAdapter(catList);
        recyclerView.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}