package LinkedList;
    
class Node{
    int data;
    Node add;
    Node(int data){
        this.data=data;
    }
}
class linkedlist1{
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
    void length(){
        Node x=root;
        int count=0;
        while(x!=null){
            x=x.add;
            count++;
        }
        System.out.println("Length is:"+count);
    }
}
public class P2_LinkedListLength
{
    public static void main(String[] args) {
        linkedlist1 l=new linkedlist1();
        l.append(10);
        l.append(20);
        l.append(30);
        l.append(40);
        l.append(50);
        l.append(80);
        l.disp();
        l.length();
    }
}
