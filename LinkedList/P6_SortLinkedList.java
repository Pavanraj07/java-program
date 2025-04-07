package LinkedList;

class Node{
    int data;
    Node add;
    Node(int data){
        this.data=data;
    }
}
class linkedlist5{
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
    void sort(){
        for(Node i=root;i!=null;i=i.add){
            for(Node j=i.add;j!=null;j=j.add){
                if(i.data>j.data){
                    // int t=i.data;
                    // i.data=j.data;
                    // j.data=t;
                    i.data=i.data+j.data-(j.data=i.data);
                }
               
            }
        }
    }
}
public class P6_SortLinkedList
{
    public static void main(String[] args) {
        linkedlist5 l=new linkedlist5();
        l.append(10);
        l.append(20);
        l.append(30);
        l.append(90);
        l.append(50);
        l.append(80);
        l.disp();
        l.sort();
        l.disp();
    }
}