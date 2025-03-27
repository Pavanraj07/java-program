package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int []a={8,3,6,2,4,5};
        int n=a.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
}
