package com.example.constructor;

public class Perro {
    private String Name;
    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }
    public static void main(String[] args) {
        Perro puppy = new Perro();
        puppy.setName("Benji");
        System.out.println(puppy.getName());
    }
}
