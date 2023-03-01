public class test0602 {
    public static void main(String[] args) {
        int[] array={6,-9,57,12,0,4,9,17,-4};
        int kay= 17;
        System.out.println(indexOf(array,kay));
        array=new int[]{-9,-4,0,4,6,9,12,17,57};
        System.out.println(findElm(array,57,0,array.length -1));

    }
    public static int findElm(int []a,int k,int l,int r){
       if (l>r)return -1;
       int m = (l+r)/2;
       if (k==a[m])return m;
       if (k<a[m])findElm(a,k,l,m-1);
       else return findElm(a,k,m+1,r);

        return m;
    }
    public static int indexOf(int[]a,int k){
        for (int i=0 ;i<a.length;i++){
            if (a[i]==k )return i;
        }
        return -1;
    }

}
