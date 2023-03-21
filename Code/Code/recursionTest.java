package Code;

public class recursionTest {
    public static void main(String[] args){

        int[]array = {7,10,2,4,6,9,12,13,8};

    /*
    int []array = new int[10];

    for(int i = 0; i <array.length;i++){
        array[i] = i+1;
    }
    */
        for(int i = 0; i <array.length;i++){
        if(i != array.length -1){
            System.out.print(array[i]+ ",");
        }else{
            System.out.println(array[i]);
        }
    }

        System.out.print("\n\n\n");

        //System.out.println(Recursion.arrayMax(array, array.length-1));

        //System.out.println(Recursion.arrayIndex(array, 0, 8));

        
        int nerd = 56455;
        //System.out.println(Recursion.hailstone(100));


        System.out.println(Recursion.countDigit(nerd, 5));

    }
}
