package com.example.constructor;

public class DogOne {
    private String Name;
    public void setName(String Name){
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }
    public static void main(String[] args) {
        DogOne puppy = new DogOne();
        puppy.setName("Benji");
        System.out.println(puppy.getName());
    }
}
