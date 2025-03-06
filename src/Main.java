import LinkedList.LinkedList;
import LinkedList.Node;

public class Main {
    public static void main(String[] args) {

        int[] data = {2,3,5,85,54,6,2,5,6};

        LinkedList linkedList = new LinkedList();
        for(int i=0;i < data.length;i++){
            linkedList.append(data[i]);
        }

        linkedList.append(55);
        linkedList.prepend(66);
        linkedList.print();

    }
}