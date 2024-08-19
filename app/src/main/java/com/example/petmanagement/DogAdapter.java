package com.example.petmanagement;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DogAdapter extends RecyclerView.Adapter<DogAdapter.DogViewHolder> {

    private List<Dog> dogList;

    public DogAdapter(List<Dog> dogList) {
        this.dogList = dogList;
    }

    @NonNull
    @Override
    public DogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_dog, parent, false);
        return new DogViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DogViewHolder holder, int position) {
        Dog dog = dogList.get(position);
        holder.dogImageView.setImageResource(dog.getImageResource());
        holder.dogNameTextView.setText(dog.getName());
        holder.dogLifespanTextView.setText("Lifespan: " + dog.getLifespan());
        holder.dogBreedTextView.setText("Breed: " + dog.getBreed());
        holder.dogTemperamentTextView.setText("Temperament: " + dog.getTemperament());
        // Bind other details here if needed
    }

    @Override
    public int getItemCount() {
        return dogList.size();
    }

    static class DogViewHolder extends RecyclerView.ViewHolder {
        ImageView dogImageView;
        TextView dogNameTextView;
        TextView dogLifespanTextView;
        TextView dogBreedTextView;
        TextView dogTemperamentTextView;


        DogViewHolder(@NonNull View itemView) {
            super(itemView);
            dogImageView = itemView.findViewById(R.id.dogImageView);
            dogNameTextView = itemView.findViewById(R.id.dogNameTextView);
            dogLifespanTextView = itemView.findViewById(R.id.dogLifespanTextView);
            dogBreedTextView = itemView.findViewById(R.id.dogBreedTextView);
            dogTemperamentTextView = itemView.findViewById(R.id.dogTemperamentTextView);
        }
    }
}

