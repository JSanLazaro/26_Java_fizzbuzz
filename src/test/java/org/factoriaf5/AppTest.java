package org.factoriaf5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import org.factoriaf5.FizzBuzz;


/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }
    @Test
    void testFizzBuzz3(){
        //Given
        int num = 3;
        //When        
        String result = FizzBuzz.check(num);
        //Then
        assertEquals(result, "Fizz");
    }
    @Test
    void testFizzBuzz5(){
        //Given
        int num = 5;
        //When        
        String result = FizzBuzz.check(num);
        //Then
        assertEquals(result, "Buzz");
    }
    @Test
    void testFizzBuzz15(){
        //Given
        int num = 15;
        //When        
        String result = FizzBuzz.check(num);
        //Then
        assertEquals(result, "FizzBuzz");
    }
    @Test
    void testSpell(){
        int totalNumbers = 15;
        
        ArrayList<String> esperados = new ArrayList<>(Arrays.asList("FizzBuzz","1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"));
        ArrayList<String> result = FizzBuzz.spell(totalNumbers);
        assertEquals(esperados, result);
    }
    @Test
    void testSpellWithContain(){
        int totalNumbers = 15;
        ArrayList<String> esperados = new ArrayList<>(Arrays.asList("FizzBuzz","1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz", "14", "FizzBuzz"));
        ArrayList<String> result = FizzBuzz.spellWithContain(totalNumbers);
        assertEquals(esperados, result);
    }
}
