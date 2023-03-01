public class Ex01_writefun {
    public static void main(String[] args) {
      //  printHello();
     //   printHello();
        printHello(4);
        System.out.println("End of the program");


    }
    public static void printHello(int n){
        if (n ==0)return;

        System.out.println(n+"Hello!!!");
        printHello(n -1);
        System.out.println(n+"Bye!!!");

    }
}
