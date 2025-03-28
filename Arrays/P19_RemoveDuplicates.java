package Arrays;

import java.util.Arrays;

public class P19_RemoveDuplicates {
    static int remove(int[] a){
        int j=1; 
        int n=a.length;
        Arrays.sort(a);
        for (int i=1;i<n;i++) {
            if(a[i]!=a[i-1]) {
                a[j++]=a[i];
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] a={1,2,2,2,6,6,4,2,5,5};
        int res=remove(a);
        for (int i=0;i<res;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
