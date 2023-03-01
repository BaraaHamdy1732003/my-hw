public class test06 {
    public static void main(String[] args) {
        int[] array={6,-9,57,12,0,4,9,17,-4};
        int kay= 17;
        System.out.println(indexOf(array,kay));
        array=new int[]{-9,-4,0,4,6,9,12,17,57};
        System.out.println(findElm(array,1000));

    }
    public static int findElm(int []a,int k){
        int left= 0;
        int right=a.length-1;
        while (left<= right){
            int m = (right+left)/2;
            if (k==a[m])return m;
            if (k<a[m])right= m-1;
            if (a[m]<k)left=m+1;
        }
        return -1;
    }

    public static int indexOf(int[]a,int k){
        for (int i=0 ;i<a.length;i++){
            if (a[i]==k )return i;
        }
        return -1;
    }

}


