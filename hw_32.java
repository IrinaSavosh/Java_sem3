import java.util.Random;
import java.util.ArrayList;

public class hw_32 {
   // Пусть дан произвольный список целых чисел, удалить из него чётные числа
      public static void main(String[] args) {
      int n = (int) (5+Math.random()*10);
      
      ArrayList <Integer> lst = new ArrayList<>();
      
      for (int i = 0; i < n; i++) {
         Random random = new Random();
         int m = random.nextInt(100);
         lst.add(m);
      }
      System.out.println(lst); // Выводим на экран, полученный массив

      for (int i = 0; i < n; i++) {
         if(lst.get(i)%2 == 0){
            lst.remove(i);
            n--;
         }
      }
      System.out.println(lst);

   }
}