package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] a={4,2,6,8,1};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min_index]){
                    min_index=j;
                } 
            }
            int temp=a[i];
            a[i]=a[min_index];
            a[min_index]=temp;
            
        }
        
        for(int i=0;i<n;i++){
            System.out.println(a[i]+"");
        }
    }
}
