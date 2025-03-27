package Arrays;

public class P19_Merge2Arrays {
    static void merge(int []arr1,int [] arr2,int[] arr3) {
        int i=0,j=0,k=0;
        int n1=arr1.length;
        int n2=arr2.length;
        while(i<n1){
            arr3[k++]=arr1[i++];
        }
        while(j<n2){
            arr3[k++]=arr2[j++];
        }
    }
    public static void main(String[] args) {
        int[] arr1={3,2,4,5,6};
        int[] arr2={9,0,1,7,8};
        int[] arr3=new int[arr1.length+arr2.length];

        merge(arr1,arr2,arr3);
        for (int res:arr3)
            System.out.print(res+" ");
    }
}
