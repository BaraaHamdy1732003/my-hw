public class test05 {
    public static void main(String[] args) {
        int[] array={6,-9,57,12,0,4,9,17,-4};
        int kay= 17;
        System.out.println(indexOf(array,kay));
        System.out.println(indexOf(array,9));
        System.out.println(indexOf(array,12));
        System.out.println(indexOf(array,1000));
        array=new int[]{-9,-4,0,4,6,9,12,17,57};


    }
    public static int indexOf(int[]a,int k){
        for (int i=0 ;i<a.length;i++){
            if (a[i]==k )return i;
        }
        return -1;
    }
}
