package Arrays;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // wrapper class
        // Integer i = Integer.valueOf(10);
        // System.out.println(i);
        // Float f = Float.valueOf(4.5f);
        // System.out.println(f);

        // create an Array List
        ArrayList<Integer> l1 = new ArrayList<>();
        // ArrayList<Boolean> l2 = new ArrayList<>();
        // ArrayList<Float> l3 = new ArrayList<>();
       
        // add new element
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        // // get an element at index i
        // System.out.println(l1.get(2));


        // // print with for loop
        // for (int i = 0; i < l1.size(); ++i){
        //     System.out.println(l1.get(i)); // 1 2 3 4
        // }

        // // printing the array list directly
        // System.out.println(l1);// [1 ,2 ,3 ,4]

    //    // adding element at some index i
    //    l1.add(1, 100);
    //    System.out.println(l1);

    //    // modifying element at index i
    //    l1.set(1,10);
    //    System.out.println(l1);

    //    // removing an elememt at index i
    //    l1.remove(1);
    //    System.out.println(l1);

    //    // removing an element e
    //    l1.remove(Integer.valueOf(2));
    //    System.out.println(l1);

    //    // Check if an element exists
    //    boolean ans = l1.contains(Integer.valueOf(3));
    //    System.out.println(ans);

    //    // If you don't specify the class, you can put anything inside L
    //    ArrayList l = new ArrayList();
    //    l.add("Bhavesh");
    //    l.add(1);
    //    l.add(true);
    //    System.out.println(l);

    }
}

