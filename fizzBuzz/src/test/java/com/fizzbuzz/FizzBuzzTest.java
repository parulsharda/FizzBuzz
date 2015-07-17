package com.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by parulsha on 17/07/15.
 */
public class FizzBuzzTest {

  private FizzBuzz number;


    @Test
    public void shouldReturnTrueIfDivisibleByThree() {
        number = new FizzBuzz(3);

        String actualResult = number.isFizzBuzz();
        assertEquals("fizz", actualResult);
      }

    @Test
    public void shouldReturnTrueIfDivisibleByFive()  {
        number = new FizzBuzz(20);

        String actualResult = number.isFizzBuzz();
        assertEquals("Buzz",actualResult);

    }

    @Test
    public void shouldReturnTrueIfNotDivisible() {
       number = new FizzBuzz(17);

        String actualResult = number.isFizzBuzz();
        assertEquals("Blahh",actualResult);

    }

    @Test
    public void shouldReturnTrueIfDivisibleByThreeAndFive()  {

        number = new FizzBuzz(15);

        String actualResult = number.isFizzBuzz();
        assertEquals("FizzBuzz",actualResult);

    }
}


