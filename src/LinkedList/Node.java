package LinkedList;

public class Node {
    int num;
    Node next;

    public Node(int num){
        this.num = num;
        this.next = null;
    }


    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return this.num;
    }

    public void setNode(Node next){
        this.next = next;
    }

    public Node getNode(){
        return this.next;
    }
}
