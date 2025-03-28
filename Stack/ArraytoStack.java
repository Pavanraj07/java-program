package Stack;

import java.util.Stack;

public class ArraytoStack {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};

        Stack<Integer> st = new Stack<>();

        System.out.println("Size:"+st.size());
        for(int i:a){
            st.push(i);
        }
        if(st.size()==0){
            System.out.println("Stack is Empty");
        }
        else System.out.println("Stack has "+st.size()+" elements");
        System.out.println(st);
        for(int i : a){
            st.pop();
        }
        System.out.println(st);
    }
}
