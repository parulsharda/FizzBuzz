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
        if (value % 3 == 0)
            return "fizz";
        else
            return "Blah";
        }

}
