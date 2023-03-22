import java.util.ArrayList;
import java.util.Random;

public class hw_33 {
   public static void main(String[] args) {
      
   /*
    * Задан целочисленный список ArrayList.
    Найти минимальное, максимальное и среднее ариф. из этого списка.
    */
    int n = (int) (5+Math.random()*10);
      
      ArrayList <Integer> lst = new ArrayList<>();
      
      for (int i = 0; i < n; i++) {
         Random random = new Random();
         // int m = random.nextInt(100);
         lst.add(random.nextInt(100));
      }
      System.out.println(lst); // Выводим на экран, полученный массив
      int min = 100, max = 0;
      for (int i = 0; i < n; i++) {
         if(lst.get(i) < min) min =lst.get(i);
         else if (lst.get(i) > max) max = lst.get(i);
         }
      double arithmeticMean = ((double)max + (double)min)/2;
      System.out.println("Максимальное значение: " + max + "; минимальное значение: " + min + "; среднее арифметическое: " + arithmeticMean);
    
   }
}

