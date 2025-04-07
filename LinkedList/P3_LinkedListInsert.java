package LinkedList;

  
class Node{
    int data;
    Node add;
    Node(int data){
        this.data=data;
    }
}
class linkedlist2{
    Node root;
    void append(int data){
        Node n=new Node(data);
        if(root==null){
            root=n;
            return;
        }
        Node x=root;
        while(x.add!=null){
            x=x.add;
        }
        x.add=n;
        return;
    }

    void disp(){
        Node x=root;
        System.out.println("Node\t\tData\tNode add");
        System.out.println("___________________________________");
        while(x!=null){
            System.out.println(x+"\t"+x.data+"\t"+x.add);
            x=x.add;
        }
    }
    int len(){
        Node x=root;
        int c=0;
        while(x!=null){
            x=x.add;
            c++;
        }
        return c;
    }
    void insert(int i,int data){
        Node x = root;
        Node n = new Node(data);

        if(i == 0) {
            n.add = x;
            root = n;
            return;
        }

        while(i != 1) {
            x = x.add;
            i--;
        }
        n.add = x.add;
        x.add = n;
        return;
    }
}
public class P3_LinkedListInsert{
    public static void main(String[] args) {
        linkedlist2 l=new linkedlist2();
        l.append(10);
        l.append(20);
        l.append(30);
        l.append(40);
        l.append(50);
        l.append(80);
        l.insert(0, 100);
        l.disp();
        l.len();
    }
}

