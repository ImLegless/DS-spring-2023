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
//int array[] = {2,2,3,3,5,6,6,8,8,8}

public static void inserstionSort(int array[]){
    int i,j,tmp;
    for(i=1; i<array.length;i++){
        tmp = array[i];//2,6,8,8,8,5,3

        for(j=i;    j>0 && array[j-1]>tmp     ;j--){

            array[j] = array[j-1];
            
        }

        array[j] = tmp;
    }
}


/////////////////////////////////////////////////

public static void bubbleSort(int array[]){
    int tmp;
    for(int i = 0; i<array.length-1;i++){
        for(int j=0; j<array.length-1;j++){
            if(array[j]>array[j+1]){
                tmp = array[j];
                array[j] =array[j+1];
                array[j+1] = tmp;
            }
        }
    }
}

///////////////////////////////////////////////




public static void insertionTest(int[] array){
    int i,j,tmp;
    for(i =1; i<array.length;i++){
        tmp = array[i];
        for(j=i; j>0 && array[j-1] > tmp;j--){
            array[j] = array[j-1];
        }
        array[j] = tmp;
    }
}


//////////////////////////////////////////////



public static double rPow(double b, int n){
    double product;
    //base cases
    if(b==1.0){
        return 1.0;
    }
    if(b==0){
        return 0;
    }
    if(n == 1){
        return b;
    }
    if(n == 0){
        return 1.0;
    }
    if(n<0){
        return 1.0 / rPow(b, -n);
    }


    return b* rPow(b, n-1);

    
}



    public static void main(String[] args){
        int array[] = {3,2,6,8,8,8,5,3,2,6};
        //selectionSort(array);
        //inserstionSort(array)
        //bubbleSort(array);
        //insertionTest(array);
        //insertionAgain(array);
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i]);
        }

        //System.out.println(rPow(2, -3));
    }



    public static void insertionAgain(int [] array){
        int i,j,tmp;
        for(i = 1; i<array.length;i++){
            tmp = array[i];
            for(j=i; j>0 && array[j-1] >tmp;j--){
                array[j] =array[j-1];
            }
            array[j]=tmp;
        }
    }


}
