package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000, 5, 5);
        System.out.println(count);
        System.out.println();
    }
    public static int multiples(int n, int a, int b){
        if (a == b){
            return (n-n%a)/a - 1;
        }
        return ((n-n%a)/a + (n-n%b)/b - (n-n%(a*b))/(a*b)) - 1;
    }

    public static int multiples(){
        return (1000/5 + (1000-1000%3)/3 - (1000-1000%(15))/(15)) - 1;
    }
}
