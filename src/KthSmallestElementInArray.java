//Question 24 - find out the Kth smallest element in array

import java.util.*;
public class KthSmallestElementInArray {
    // data structure used: heap
        public static int findKthSmallest(List<Integer> myList, int k)
        {
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
            priorityQueue.addAll(myList.subList(0, k));
            for (int i = k; i < myList.size(); i++)
            {

                if (myList.get(i) < priorityQueue.peek())
                {

                    priorityQueue.poll();
                    priorityQueue.add(myList.get(i));
                }
            }
            return priorityQueue.peek();
        }

        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            List<Integer> A = Arrays.asList(10,9,8,7,6,5,4);
            System.out.println("Enter the value of k: ");
            int k = sc.nextInt();
            System.out.println("The Kth smallest element in the created array is " + findKthSmallest(A, k));
        }
    }

