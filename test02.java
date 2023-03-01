import java.util.Scanner;

class test02{
    public static void main(String[] args) {

        Scanner sce = new Scanner(System.in);

         readAndwrite(sce);
    }
    public static void readAndwrite(Scanner sc){
        System.out.print("next :");
        int x= sc.nextInt();
        if (x== 0 )return;
        readAndwrite(sc);
        System.out.println(x);



    }
}