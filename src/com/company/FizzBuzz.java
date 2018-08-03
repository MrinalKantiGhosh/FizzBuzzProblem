package com.company;

public class FizzBuzz {
    private String fizz;
    private String buzz;
    private String fizzbuzz;

    FizzBuzz(){
        this.fizz = "Fizz";
        this.buzz = "Buzz";
        this.fizzbuzz = "FizzBuzz";
    }

    public String getFizz(){
        return this.fizz;
    }

    public String getBuzz(){
        return this.buzz;
    }

    public String getFizzBuzz(){
        return this.fizzbuzz;
    }

    public String checkFizzBuzz(int num){
        if(num % 3 == 0 && num % 5 == 0)
            return getFizzBuzz();
        else if(num % 3 == 0)
            return getFizz();
        else if(num % 5 == 0)
            return getBuzz();
        else
            return String.valueOf(num);

    }
}
