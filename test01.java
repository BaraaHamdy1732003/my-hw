public class test01 {
    public static void main(String[] args) {
       printeq(5);
    }

    public static int printeq( int n){
        if (n==0)return 0;

        printeq(n-1);
        System.out.println(n+" res = "+(n*n));

        return 0;
    }

}
