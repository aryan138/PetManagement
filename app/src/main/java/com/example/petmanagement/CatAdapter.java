package com.example.petmanagement;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.CatViewHolder> {

    private List<Cat> catList;

    public CatAdapter(List<Cat> catList) {
        this.catList = catList;
    }

    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cat, parent, false);
        return new CatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder, int position) {
        Cat cat = catList.get(position);
        holder.catImageView.setImageResource(cat.getImageResource());
        holder.catNameTextView.setText(cat.getName());
        holder.catLifespanTextView.setText("Lifespan: " + cat.getLifespan());
        holder.catBreedTextView.setText("Breed: " + cat.getBreed());
        holder.catTemperamentTextView.setText("Temperament: " + cat.getTemperament());
        // Bind other details here if needed
    }

    @Override
    public int getItemCount() {
        return catList.size();
    }

    static class CatViewHolder extends RecyclerView.ViewHolder {
        ImageView catImageView;
        TextView catNameTextView;
        TextView catLifespanTextView;
        TextView catBreedTextView;
        TextView catTemperamentTextView;

        CatViewHolder(@NonNull View itemView) {
            super(itemView);
            catImageView = itemView.findViewById(R.id.catImageView);
            catNameTextView = itemView.findViewById(R.id.catNameTextView);
            catLifespanTextView = itemView.findViewById(R.id.catLifespanTextView);
            catBreedTextView = itemView.findViewById(R.id.catBreedTextView);
            catTemperamentTextView = itemView.findViewById(R.id.catTemperamentTextView);
        }
    }
}

