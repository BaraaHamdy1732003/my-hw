public class Ex02 {
    public static void main(String[] args) {
        System.out.println(f(1));
        System.out.println(f(3));
        System.out.println(f(4));
        System.out.println(f(5));
        System.out.println(f(20));

    }

    public static int f(int n){
        if (n< 2)return 1;// recursion base
        return n*f(n-1);
    }
}
