package Code;

public class Test {
    public static void main(String[] args){
        IntArrayBag b = new IntArrayBag();
        IntArrayBag b2 = new IntArrayBag(3);

        System.out.println(b.is_empty());

        for(int i = 0;i<6;i++){
            b.add(i);
        }
        System.out.println(b.is_full());
        System.out.println(b.getSize());
        b.remove(2);
        System.out.println(b.is_full());
        System.out.println(b.getSize());
        b.add(5);
        System.out.println(b.is_full());
        System.out.println(b.getSize());
        System.out.println(b);

        b.add_many(1,1,1,1,1,1);
        System.out.println(b.getSize());

    }
}
