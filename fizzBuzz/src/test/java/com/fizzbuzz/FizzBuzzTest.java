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


    }
