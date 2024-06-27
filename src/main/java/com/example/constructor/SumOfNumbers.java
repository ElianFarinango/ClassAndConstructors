package com.example.constructor;

public class SumOfNumbers {
    int numberOne=5;
    int numberTwo=10;
    int sum=numberOne+numberTwo;
    public static void main(String[] args) {
        SumOfNumbers summarly= new SumOfNumbers();
        System.out.println(summarly.sum);
    }
}
