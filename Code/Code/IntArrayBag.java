package Code;

public class IntArrayBag {
    //instance variables
    private int numItems; //the number of current items in the bag
                          //0<=numItems<=data.length
    private int [] data; /*storage for the data, valid items are
                         always in indices 0 to numItems -1*/

    /*default constructor - create an array of default size and 
    *                       start empty
    */
    public IntArrayBag(){
        data = new int[5];
        numItems = 0;
    }
    //custom contructor
    public IntArrayBag(int capacity){
        data = new int[capacity];
        numItems = 0;
    }
    //empty() - returns true if no valid items, false otherwise
    public boolean is_empty(){
        return numItems == 0;
    }
    //full()
    public boolean is_full(){
        return numItems == data.length;
    }
    //contains() - true if value is equal to at least 1 item
    public boolean contains(int value){
        for(int i = 0;i<numItems;i++){
            if(data[i]==value){
                return true;
            }
        }
        return false;
    }
    //size
    public int getSize(){
        return numItems;
    }
    //add()
    public void add(int value){
        //start with a simple bad that refuses to add when out of room
        if(is_full()){
            System.out.println("Storage full");
        }
        else{
            data[numItems] = value;
            numItems++;
        }
    }
    //remove()
    public void remove(int value){
        if(contains(value)){
            for(int i = 0;i<numItems;i++){
                if(data[i]==value){
                    data[i] = data[numItems -1];
                    numItems--;
                    break;
                }
            }
        }
    }



}
