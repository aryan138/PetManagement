package com.example.petmanagement;

public class Cat {
    private int imageResource;
    private String name;
    private String lifespan;
    private String breed;
    private String temperament;

    public Cat(int imageResource, String name, String lifespan, String breed, String temperament) {
        this.imageResource = imageResource;
        this.name = name;
        this.lifespan = lifespan;
        this.breed = breed;
        this.temperament = temperament;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLifespan() {
        return lifespan;
    }

    public void setLifespan(String lifespan) {
        this.lifespan = lifespan;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getTemperament() {
        return temperament;
    }

    public void setTemperament(String temperament) {
        this.temperament = temperament;
    }
}

