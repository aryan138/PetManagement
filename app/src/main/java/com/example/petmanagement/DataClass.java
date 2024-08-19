package com.example.petmanagement;

public class DataClass {

    private String name;
    private String email;
    private String phone;
    private String petname;

    public DataClass(String name, String email, String phone, String petname) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.petname = petname;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPetname() {
        return petname;
    }

}
