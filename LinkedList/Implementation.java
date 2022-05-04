public class LL {
    Node head;
    private int size;
    LL(){
        this.size = 0;
    }
    
    //our linked list has a Node class to store data and address
    class Node {
        String data;
        Node next;  //next is to store address of next node

        Node(String data){    //constructor
            this.data = data;
            this.next = null;  //every node initially will hold a null ptr.
            size++;
        }


    }
    //add - first,last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode; 
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;  //newNode object holds the address of newNode;
            return;
        }
        Node currNode=head;
        currNode = currNode.next;
        while(currNode.next !=null){
            currNode = currNode.next;
        }
        currNode.next= newNode;

    }
    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode= head;
        while(currNode!=null){
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
  
    //delete first
    public void deleteFirst(){
        size--;
        if(head==null){
            System.out.println("This is emoty");
            return;
        }
        head = head.next;

    }

    //delete last
    public void deleteLast(){
        size--;
        if(head==null){
            System.out.println("The list is empty!");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        Node secondLast = head; //this is holding address of first node
        Node lastNode  = head.next; //head.next = null -> lastNode = null;
        while(lastNode.next != null){ 
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }





    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();
    
        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

    }
}

