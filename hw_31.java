import java.util.Arrays;
import java.util.Random;

public class hw_31 {
   public static void main(String[] args) {
      // (Дополнительное) Реализовать алгоритм сортировки слиянием
      int n = (int) (5+Math.random()*10);
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
         Random random = new Random();
         arr[i] = random.nextInt(100);
      }
      System.out.println(Arrays.toString(arr));

      System.out.println();
      
      int[] res = new int[n];
      res = divideAndMerge(arr);
      System.out.println(Arrays.toString(res));
   }


   public static int[] divideAndMerge(int[]array){
      int[] result;
      if(array.length <2){
         return array;
      }
      else{
         int[] lstRight = Arrays.copyOf(array, array.length/2);
         int[] lstLeft = Arrays.copyOfRange(array, array.length-(array.length - lstRight.length), array.length);
         int[] newArrLeft = divideAndMerge(lstLeft);
         int[] newArrRight = divideAndMerge(lstRight);
         result = new int[newArrLeft.length + newArrRight.length];
         int i = 0, j = 0, k = 0;
         while (k < result.length) {    //k=0 len = 
            if (i < newArrLeft.length && j < newArrRight.length){
               if (newArrLeft[i] < newArrRight[j]){
                  result[k] = newArrLeft[i];
                  i++;
               }
               else{
                  result[k] = newArrRight[j];
                  j++;
               }
            }
            else if (i < newArrLeft.length && j == newArrRight.length){
               result[k] = newArrLeft[i];
               i++;
            }
            else if (i == newArrLeft.length && j < newArrRight.length){
               result[k] = newArrRight[j];
               j++;
            }
            k++;
         }
      }
      return result;
   }
}