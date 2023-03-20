package Test;














public class Test1 {
    public static void write_vertical(int n){
        n = Math.abs(n);
        //base case - one digit left
        if(n<10){
            System.out.println(n);
        }
        else{

            /*  this variation prints out the number from the ones
            *   and up, putting the recursion first allows it to print
            *   out the front of the number down to the ones           
            *Below is right to left
            */

            //System.out.println(n%10); //print the current ones digit  
            //write_vertical(n/10);//move to remaining digits
        
            // Example: Left to right
            write_vertical(n/10);
            System.out.println(n%10);
             
        
        }
    }

    public static void main(String[] args){
        write_vertical(52406);
    }


}
