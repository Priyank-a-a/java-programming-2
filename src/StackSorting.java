/*Q. 17)sorting a stack using a temporary stack
A temporary stack can be used to push the values inside it after being popped out from our main stack. Then the values from temp stack can be
pushed again to the main stack in ascending order
 */

import java.util.*;
public class StackSorting {
    public static Stack<Integer> stackSort(Stack<Integer> unsortedStack){

            Stack<Integer> tempStack = new Stack<>();

            while(!unsortedStack.isEmpty()) {
                int tmp = unsortedStack.pop();
                System.out.println("Element being popped out: "+tmp);
                while(!tempStack.isEmpty() && tempStack.peek() > tmp) {
                    unsortedStack.push(tempStack.pop());
                }
                tempStack.push(tmp);
                System.out.println("Unsorted stack:\n "+unsortedStack);
                System.out.println("temporary Stack:\n "+tempStack);
            }
            return tempStack;
        }

        public static void main(String args[]){

            Stack<Integer> unsortedStack = new Stack<Integer>();
            unsortedStack.add(60);
            unsortedStack.add(50);
            unsortedStack.add(30);
            unsortedStack.add(90);
            unsortedStack.add(10);
            unsortedStack.add(40);
            System.out.println("Sorted stack:\n"+stackSort(unsortedStack));
        }
    }

