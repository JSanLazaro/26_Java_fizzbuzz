package org.factoriaf5;

import java.util.ArrayList;

public class FizzBuzz {
  int num;
  ArrayList<String> numbers;
public void setNum(int num) {
    this.num = num;
}  
  public static String check(int num){
    if(num%3 == 0 && num%5 == 0){
        return "FizzBuzz";
    }else if(num%3==0){
        return "Fizz";
    }else if(num%5==0){
        return "Buzz";
    }
    return Integer.toString(num);
  }
  private static String checkWithContain(int num){
    if((num%3 == 0 && num%5 == 0) || (num%3 == 0 && hasContained(num, 5)) || (num%5==0 && hasContained(num,3))){
        return "FizzBuzz";
    }else if(num%3==0 || hasContained(num, 3)){
      return "Fizz";
    }else if(num%5 ==0|| hasContained(num, 5)){
      return "Buzz";
    }
    return Integer.toString(num);
  }
  public static ArrayList<String> spell(int totalNumbers){
    ArrayList<String> result = new ArrayList<>(totalNumbers+1);
    System.out.println(result.size());
    for(int i=0;i<=totalNumbers;i++){
        result.add(i, check(i));
    }
    System.out.println(result.size());
    return result;
  }
  public static ArrayList<String> spellWithContain(int totalNumbers){
    ArrayList<String> result = new ArrayList<>(totalNumbers+1);
    for(int i=0;i<=totalNumbers;i++){
      result.add(i, checkWithContain(i));
    }
    return result;
  }
  private static boolean hasContained(int number, int numberToContain){
    int count = digitsOfNumberCount(number);
    for(int i=1;i<=count;i++){
      int divisor = i*10;
      if(number%divisor == numberToContain){
        return true;
      }
    }
    return false;
  }
  private static int digitsOfNumberCount(int number){
    int count= 0;
    while(number !=0){
      number/=10;
      count++;
    }
    return count;
  }
}
