package com.fizzbuzz;

/**
 * Created by paruls
 * ha on 17/07/15.
 */
public class FizzBuzz {


    private int value;

    public FizzBuzz(int i) {
        value = i;
    }

    public String isFizzBuzz() {
        if(value % 3 ==0 && value % 5 == 0)
            return "FizzBuzz";
        else if (value % 3 == 0)
            return "fizz";
        else if (value % 5 == 0)
            return "Buzz";
        else
            return "Blahh";
        }

}
