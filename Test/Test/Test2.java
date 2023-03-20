package Test;

public class Test2 {
    /*static long [] termsPast = new long[500];
    *    public static long fibNum1(int n){
    *        if (n<=1){
    *            return 1;
    *        } else if(termsPast[n] == 0){
    *            termsPast[n] = fibNum1(n-2) + fibNum1(n-1);
    *        }
    *        return termsPast[n];
    *
    *    }
    */

    /*
     * Revised Solution
     */

     static long [] termsPast= new long[500];
     
        public static long fibNum2(int n){

            //If the number in the sequence is 1 or 0, return 1
            if(n<=1){
                return 1;
            }

            //Checks to see if the number
            //in the current sequence has already
            //been calculated
            else if(termsPast[n] == 0){ 

            //If it has not, calculate and save
            //in the current index
                termsPast[n] = fibNum2(n-2) +fibNum2(n-1);
            }

            //Return 
            return termsPast[n];
        }





    public static void main(String[] args){
        System.out.println(fibNum2(100));
    }

}
