package ru.job4j.temp;

class Calculator {
   int c;
	
   public void addition(int a, int b) {
      c = a + b;
      System.out.println("Сумма чисел: " + c);
   }
	
   public void subtraction(int a, int b) {
      c = a - b;
      System.out.println("Разность чисел: " + c);
   }
}

public class MyCalculator extends Calculator {
   public void multiplication(int a, int b) {
      c = a * b;
      System.out.println("Произведение чисел: " + c);
      // добавленное ниже в этом методе для примера
      a = 10;
      b = 20;
      MyCalculator cal = new MyCalculator();
      cal.addition(a, b);
      cal.subtraction(a, b);
      cal.multiplication(a, b);
   }
	
   public static void main(String[] args) {
      int a = 10, b = 20;
      MyCalculator cal = new MyCalculator();
      cal.addition(a, b);
      cal.subtraction(a, b);
      cal.multiplication(a, b);
   }
}