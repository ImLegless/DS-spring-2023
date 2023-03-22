package Code;

public class IntArrayBag implements Cloneable {
    //instance variables
    private int numItems; //the number of current items in the bag
                          //0<=numItems<=data.length
    private int [] data; /*storage for the data, valid items are
                         always in indices 0 to numItems -1*/

    /*
     * default constructor - create an array of default size and
     * start empty
     */
    public IntArrayBag() {
        data = new int[5];
        numItems = 0;
    }

    // custom contructor
    public IntArrayBag(int capacity) {
        data = new int[capacity];
        numItems = 0;
    }

    // empty() - returns true if no valid items, false otherwise
    public boolean is_empty() {
        return numItems == 0;
    }

    // full()
    public boolean is_full() {
        return numItems == data.length;
    }

    // contains() - true if value is equal to at least 1 item
    public boolean contains(int value) {
        for (int i = 0; i < numItems; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }

    // size
    public int getSize() {
        return numItems;
    }
    //add()
    public void add(int value){
        //start with a simple bad that refuses to add when out of room
            if(is_full()){
                //System.out.println("Storage full");
                grow();
            }
        }

    // remove()
    public void remove(int value) {
        if (contains(value)) {
            for (int i = 0; i < numItems; i++) {
                if (data[i] == value) {
                    data[i] = data[numItems - 1];
                    numItems--;
                    break;
                }
            }
        }
    }


    

    //increases the storage of the data set
    public void grow(){
        //we need to allocate an array thats
        //twice the size of data[]
        int[] newData = new int[data.length*2];
        for(int i = 0; i <numItems;i++){
            newData[i] = data[i];
        }
        //newData is a temprary local variable and goes away
        //at the end of this method
        //to keep access to the new larger array. we should
        //have data also refer to it
        data=newData;
        //in java, the old data array now has no reference
        //and it gets garbage collected

    }
    //decreases the storage of the data set
    public void shrink(){
        int[] newData = new int[numItems];
        for(int i = 0; i < numItems;i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    public void add_many(int[]... values) {
        for (int i = 0; i < values.length; i++) {
            add(data[i]);
        }
    }
    public void add_all(IntArrayBag other){
        for(int i = 0; i<other.numItems;i++){
            add(other.data[i]);
        }
    }

    public void remove_all(){
        numItems=0;
    }
}
    }
