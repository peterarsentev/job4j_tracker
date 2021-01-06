package ru.job4j.temp;

   // Интерфейс
class SuperClass {
   int num = 88;

   // Метод display() суперкласса
   public void display() {
      System.out.println("Это метод display() суперкласса");
   }
}

public class SubClass extends SuperClass {
   int num = 77;

   // Метод display() субкласса
   public void display() {
      System.out.println("Это метод display() подкласса");
   }

   public void myMethod() {
      // Инициализация подкласса
      SubClass sub = new SubClass();

      // Вызываем метод display() подкласса
      sub.display();

      // Вызываем метод display() суперкласса
      super.display();

      // Выводим значение переменной num подкласса
      System.out.println("Значение переменной num в подклассе: " + sub.num);

      // Выводим значение переменной num суперкласса
      System.out.println("Значение переменной num в суперклассе: " + super.num);
   }

   public static void main(String[] args) {
      SubClass obj = new SubClass();
      obj.myMethod();
   }
}