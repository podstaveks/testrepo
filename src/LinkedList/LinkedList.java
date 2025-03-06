package LinkedList;

public class LinkedList {
    Node head;

    public void setHead(Node node){
        this.head = node;
    }

    public void prepend(int num){
        Node node = new Node(num);
        prepend(node);
    }


    public void prepend(Node node){
        node.next = this.head;
        this.head = node;
    }


    public void append(int num){
        Node node = new Node(num);
        append(node);
    }

    public void append(Node node){
        if(isEmpty()){
            this.head = node;
            return;
        }

        Node current = this.head;
        while (current.next != null){
            current = current.next;
        }
        current.next = node;
    }

    public int delete(int num){
        if(isEmpty()){
            return -1;
        }

        if(head.num == num){
            Node previoudHead = head;
            head = previoudHead.next;
            return previoudHead.num;
        }

         Node currentNode = head;

        while (currentNode.next != null){
            if(currentNode.next.num == num){
                currentNode.next = currentNode.next.next;
                return currentNode.next.num;
            }
        }

        return -1;


    }

    public void print(){
        Node currentNode = head;
        while (currentNode!=  null){
            System.out.print(currentNode.num+"->");
            currentNode = currentNode.next;
        }
    }


    public boolean isEmpty(){
        return this.head == null;
    }




}
