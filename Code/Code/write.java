package Code;

public class write{
    public static void vertical(int n){
        n = Math.abs(n);
        if(n<10){
            System.out.println(n);
        }else{
            vertical(n/10);
            System.out.println(n%10);
        }
    }

    public static void main(String[] args){
        write.vertical(10045);
    }
}