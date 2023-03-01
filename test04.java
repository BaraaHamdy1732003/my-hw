public class test04 {
    public static void main(String[] args) {
        int[] array={6,-9,57,12,0,4,9,17,-4};
        System.out.println("The sum = "+sum(array,array.length ));
    }
   public static int sum(int[] a, int n){
        if(n==1)return a[0];
        return a[n-1]+sum(a,n-1);
   }
   //8
   public static int maxEl(int[]a,int l,int r){
        if (l==r)return a[l];
        if (l==r-1)return Math.max(a[l],a[r]);
        int m = (r+l)/2;
        return Math.max(maxEl(a,l,m),maxEl(a,m+1,r));
    }
 /*   public static int maxEl(int[]a, int n){
        if (n== 1)return a[0];
        if (n== 2)return Math.max(a[0],a[1]);
        return Math.max(maxEl(a, n-1),a[n-1]);
    }
 /*   public static int max(int[] a){
        int maxs= a[0];
        for (int i= 1; i<a.length;i++){
            if(a[i]>maxs)
                maxs= a[i];
        }
        return maxs;*/
    }

