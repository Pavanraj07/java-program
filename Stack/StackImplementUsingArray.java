package Stack;

import java.util.Stack;

public class StackImplementUsingArray {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int n=st.size();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=st.peek();
            st.pop();
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
}
