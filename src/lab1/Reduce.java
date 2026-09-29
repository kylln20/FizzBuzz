package lab1;

public class Reduce {
    static void main(String[] args) {
        System.out.println(reduce(100));
    }
    public static int reduce(int n){
        int count = 0;
        int tracker = n;
        while (tracker > 0){
            if (tracker % 2 == 0){
                tracker /= 2;
            } else {
                tracker -= 1;
            }
            count ++;
        }
        return count;
    }
}
