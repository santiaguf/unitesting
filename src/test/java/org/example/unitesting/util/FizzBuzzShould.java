package org.example.unitesting.util;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class FizzBuzzShould {

    private FizzBuzz fizzBuzz;
    private String Fizz = "Fizz";
    private String Buzz = "Buzz";

    @Before
    public void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void fizz_when_number_is_divisible_by_3(){
        assertThat(fizzBuzz.fizzBuzz(3), is(Fizz));
    }

    @Test
    public void buzz_when_number_is_divisible_by_5(){
        assertThat(fizzBuzz.fizzBuzz(10), is(Buzz));
    }

    @Test
    public void fizzbuzz_when_number_is_divisible_by_3_and_5(){
        assertThat(fizzBuzz.fizzBuzz(15), is(Fizz+Buzz));
    }

    @Test
    public void return_number_when_is_not_divisible_by_3_or_5(){
        assertThat(fizzBuzz.fizzBuzz(16), is("16"));
    }
}