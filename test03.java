public class test03 {
    public static void main(String[] args) {
        System.out.println(g(1));
        System.out.println(g(3));
        System.out.println(g(4));
        System.out.println(g(5));
    }
    public static double g(int n){
        if (n== 0) return 0;
        return Math.sqrt(2.0+g(n-1));

    }
}
