package Test;


import java.util.Arrays;

import java.util.Arrays;







public class Sorting {
    


/*
    public static void main(String[] args){
        int array[] = {7,5,4,1,2};
        Arrays.sort(array);;
        for(int i = 0; i<array.length; i++){
            System.out.print(" "+ array[i]);
        }     
    }
*/

    public static void main(String[] args){
        int array[] = {3,2,6,8,8,8,5,3,2,6};
        //selectionSort(array);
        //inserstionSort(array)
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i]);
        }

    }




/////////////////////////////////////////////////
    public static void selectionSort(int arr[]){
        int mindex,tmp;

        //////////
        for(int x = 0;x <= arr.length-2;x++){
            mindex=x;

            ///////
            for(int y=x+1; y<=arr.length-1;y++){

                if(arr[y] < arr[mindex]){
                    mindex = y;
                }

            }
            ///////

            tmp = arr[x];
            arr[x] = arr[mindex];
            arr[mindex] = tmp;


        }
        //////////


    }
/////////////////////////////////////////////////


public static void inserstionSort(int array[]){
    int x,y,tmp;
    for(x=1; x<array.length;x++){
        tmp = array[x];

        for(y=x;    y>0 && array[y-1]>tmp     ;y--){

            array[y] = array[y-1];
            
        }

        array[y] = tmp;
    }
}

}
