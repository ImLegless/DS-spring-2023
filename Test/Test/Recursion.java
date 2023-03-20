package Test;
//You need to modify and turn in this file for HW4

//Please include your name(s) in these top comments or the Javadoc comment.
//Your name:    Logan Gardner
//For any groupmates, add a line here with their name and brief description of their contribution.
/**
 * A class where recursive functions can be implemented and tested
 *
 * @author Starter code by Jon Juett
 * @version Starter code written 9/6/2021, updated 2/15/2022
 * 
 * @author Completed code by Logan Gardner
 * @version Code revised and completed on 3/3/2023
 */
public class Recursion{
    
    /**
     * Returns the sum of all values in an array
     * @param arr is an array of ints, must have at least i elements, can have any values
     * @param 0 <= i <= arr.length is the current index being checked
     * @return the sum of all ints in arr as an int
     */
    public static int arraySum(int[] arr, int i){
        //This solution is provided as an example.
        //base case
        if(i == arr.length){
            return 0;
        }
        //recursive case
        else{
            return arr[i] + arraySum(arr, i + 1);
        }
    }

    
    
    /**
     * Returns the product of all values in an array
     * @param arr is an array of ints, must have at least i elements, can have any values
     * @param 0 <= i <= arr.length is the current index being checked
     * @return the product of all ints in arr as an int
     */
    public static int arrayProduct(int[] arr, int i){
        //base case
        if(i == arr.length){
            return 1;
        }
        
        else{
            return arr[i] * arrayProduct(arr, i + 1);
        }

    }
    
    /**
     * Returns the maximum of all values in an array
     * @param arr is an array of ints, must have at least i elements, can have any values
     * @param 0 <= i < arr.length is the current index being checked
     * @return the maximum valued int in arr
     */
    public static int arrayMax(int[] arr, int i){
        //replace this function stub with your recursive solution


        System.out.println("Currently checking if "+arr[i]+" is the highest value in the array");



            if(i == arr.length-1){
                return arr[i];
            }
            else{
                return Math.max(arr[i],arrayMax(arr, i+1));
            }

        }
    
    /**
     * Returns the index of the first appearance of val in arr, or -1 if val is not in arr.
     * @param arr is an array of ints to search through, must have at least i elements, can have any values
     * @param 0 <= i <= arr.length is the current index being checked
     * @param val is the int being searched for in arr, may have any value
     * @return an int representing the first index i where arr[i] == val
     */
    public static int arrayIndex(int[] arr, int i, int val){
        //replace this function stub with your recursive solution

        System.out.println("Current index searching is: "+i);
        if(arr[i] == val){
            return i;
        }
        else if(i >= arr.length-1){
            return -1;
        }
        else{
            return arrayIndex(arr, i+1, val);
        }
        



    }
    
    /**
     * Generates the hailstone sequence for an input number n, which is generated by these rules:
     * If n is 1, the sequence ends
     * If n is even, the next n is n/2
     * If n is odd (and not 1), the next n is 3*n+1
     * @param n >= 1 is the current number in the sequence
     * @return a String containing the full sequence starting from n and ending with 1. 
     * These should be seperated by spaces, like "3 10 5 16 8 4 2 1".
     * This function should not generate any output, but the String may be printed elsewhere (like in main).
     */
    public static String hailstone(int n){
        //replace this function stub with your recursive solution
        String hail ="";

        if(n == 1){
            //System.out.println("Current value of n is: "+ n);
            return hail.concat(Integer.toString(n));
        }
        else{
            if(n %2 ==0){
                //System.out.println("Current value of n is: "+ n);
                return hail.concat(Integer.toString(n)+ " "+hailstone(n/2));
            }
            if(n% 2 ==1 && n!= 1){
                //System.out.println("Current value of n is: "+ n);
                return hail.concat(Integer.toString(n)+ " " +hailstone(3*n+1));
            }
        }
        return hail;
}
    
    /**
     * Counts the number of appearances of a specified digit in a number n.
     * For example, countDigit(2313,3) returns 2 because '3' appears two times.
     * @param n >= 0 specifies the number to count appearances of digit in
     * @param 0 <= n <= 9 specifies a digit to check for appearances of
     * @return an int representing the number of times digit appears in n
     */
    public static int countDigit(int n, int digit){
        //replace this function stub with your recursive solution

            if(n == digit && n <10){
                return 1;
            }
            if (n == 0 || n!= digit && n<10){
                return 0;
            }
            if (n % 10 == digit){
                return 1 + countDigit(n / 10, digit);
            }
        return countDigit(n / 10, digit);
    }
    
    /**
     * A main function that runs a few simple tests for each recursive function.
     * Modifies standard output using println.
     */
    public static void main(String[] args){
        int[] arr1 = new int[1];
        arr1[0] = 2;
        int[] arr2 = new int[4];
        arr2[0] = 2;
        arr2[1] = 0;
        arr2[2] = 4;
        arr2[3] = 3;
        int[] arr3 = new int[3];
        arr3[0] = -3;
        arr3[1] = -1;
        arr3[2] = -2;

        int starting_index = 0;
        
        System.out.println("Testing arraySum:");
        System.out.println("Expected sum of [2] is 2.");
        System.out.println("Your code's result: " + arraySum(arr1,starting_index));
        System.out.println("Expected sum of [2, 0, 4, 3] is 9.");
        System.out.println("Your code's result: " + arraySum(arr2,starting_index));
        System.out.println("Expected sum of [-3, -1, -2] is -6.");
        System.out.println("Your code's result: " + arraySum(arr3,starting_index));
        System.out.println("");
        
        System.out.println("Testing arrayProduct:");
        System.out.println("Expected product of [2] is 2.");
        System.out.println("Your code's result: " + arrayProduct(arr1,starting_index));
        System.out.println("Expected product of [2, 0, 4, 3] is 0.");
        System.out.println("Your code's result: " + arrayProduct(arr2,starting_index));
        System.out.println("Expected product of [-3, -1, -2] is -6.");
        System.out.println("Your code's result: " + arrayProduct(arr3,starting_index));
        System.out.println("");
        
        System.out.println("Testing arrayMax:");
        System.out.println("Expected max of [2] is 2.");
        System.out.println("Your code's result: " + arrayMax(arr1,starting_index));
        System.out.println("Expected max of [2, 0, 4, 3] is 4.");
        System.out.println("Your code's result: " + arrayMax(arr2,starting_index));
        System.out.println("Expected max of [-3, -1, -2] is -1.");
        System.out.println("Your code's result: " + arrayMax(arr3,starting_index));
        System.out.println("");
        
        System.out.println("Testing arrayIndex:");
        System.out.println("Expected index of value 2 in [2, 0, 4, 3] is 0.");
        System.out.println("Your code's result: " + arrayIndex(arr2,starting_index,2));
        System.out.println("Expected index of value 4 in [2, 0, 4, 3] is 2.");
        System.out.println("Your code's result: " + arrayIndex(arr2,starting_index,4));
        System.out.println("Expected index of value 5 in [2, 0, 4, 3] is -1.");
        System.out.println("Your code's result: " + arrayIndex(arr2,starting_index,5));
        System.out.println("");
        
        System.out.println("Testing hailstone:");
        System.out.println("Expected sequence from 1 is 1");
        System.out.println("Your code's result: " + hailstone(1));
        System.out.println("Expected sequence from 4 is 4 2 1");
        System.out.println("Your code's result: " + hailstone(4));
        System.out.println("Expected sequence from 3 is 3 10 5 16 8 4 2 1");
        System.out.println("Your code's result: " + hailstone(3));
        System.out.println("");
        
        System.out.println("Testing countDigit:");

        System.out.println("Expected number of '2' in 0: 0");
        System.out.println("Your code's result: " + countDigit(0,2));

        System.out.println("Expected number of '0' in 0: 1");
        System.out.println("Your code's result: " + countDigit(0,0));

        System.out.println("Expected number of '0' in 5: 0");
        System.out.println("Your code's result: " + countDigit(5,0));

        System.out.println("Expected number of '5' in 5: 1");
        System.out.println("Your code's result: " + countDigit(5,5));

        System.out.println("Expected number of '5' in 545: 2");
        System.out.println("Your code's result: " + countDigit(545,5));

        System.out.println("Expected number of '8' in 545: 0");
        System.out.println("Your code's result: " + countDigit(545,8));

        System.out.println("Expected number of '2' in 203220: 3");
        System.out.println("Your code's result: " + countDigit(203220,2));

        System.out.println("Expected number of '0' in 203220: 2");
        System.out.println("Your code's result: " + countDigit(203220,0));
    }
}