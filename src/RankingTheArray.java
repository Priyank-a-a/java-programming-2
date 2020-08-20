//Question 22)Replace each element of the array by its rank in the array

import java.util.*;

public class RankingTheArray {
       public static void Ranking(int[] arr)
        {

            Map<Integer, Integer> map = new TreeMap<>();


            for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], i);
            }


            // i have started the rank from 0
            int rank = 0;

            // for loop for traversal and then replacement of element by its corresponding rank
            for (int val : map.values()) {
                arr[val] = rank++;
            }
        }

        public static void main(String[] args)
        {
            int arr[] = { 101, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
            Ranking(arr);
            System.out.println("The array whose all elements have been ranked and then replaced by their corresponding rank is: ");
            System.out.println(Arrays.toString(arr));
        }

}
