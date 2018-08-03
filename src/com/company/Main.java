package com.company;

public class Main {

    public static void main(String[] args) {
        FizzBuzz fizzbuzz = new FizzBuzz();
        for(int itr = 1; itr <= 100; itr++){
            System.out.println(fizzbuzz.checkFizzBuzz(itr));
        }
    }
}
