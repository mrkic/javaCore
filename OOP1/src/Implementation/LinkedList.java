package Implementation;


public class LinkedList {
    private Node head;
    
    public LinkedList(){
        this.head = null;
    }
    public LinkedList(int data){
        head = new Node(data);
    }
    public void Insert(int data){
        if(this.head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        Node newNode = new Node(data);
        while(current.next != null){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public int getData(int position){
        Node current = head;
        if(position >this.size()){
            System.out.println("--- Wrong position! ---");
            return 0;
        }
        for(int i=0; i < position -1; i++){
            current = current.next;
        }
        return current.data;
    } 
    public void Insert(int data, int number){
       
        if(this.head == null){
        head = new Node(data);
        return;
        }

        Node newNode = new Node(data);
       
        Node current = head;
        if(number==1){
            newNode.next=current;
           // current.next = newNode;
            head = newNode;
            return;
        }
        for(int i=0; i<number-2; i++){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void Delete(int position){
        Node current = head;
        if(position > this.size()){
            System.out.println("--- Wrong position! ---");
            return;
        }
        if(position == 1){
            current= this.head.next;
            return;
        }
        for(int i =0 ; i<position-2; i++){
            current =current.next;
        }
        Node temp=current.next;
        current.next = temp.next;
        
    }
    public void print(){
        Node current = head;
        if(current == null){
            System.out.println("--- ---");
            return;
        }
        if(current.next == null){
            System.out.println(current.data);
            return;
        }
        do{
            System.out.print(current.data + " ");
            current = current.next;
        }
        while(current !=null);
        System.out.println();
    }
    public int size(){
        int counter = 0;
        Node current = this.head;
//        if(current == null)
//            return counter;
//        if(current.next == null){
//        counter++;
//        return counter;
//        }
        while(current!= null){
            counter++;
            current= current.next;
        }
        return counter;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList(1);
        list.Insert(3);
        list.Insert(4, 1);
        list.print();
        System.out.println(list.getData(3));
        list.Insert(5, 1);
        list.print();
        System.out.println(list.size());
        list.Insert(4, 4);


    }
    
}

class Node{
    Node next;
    int data;
    
    public Node(int data){
        this.data=data;
        this.next = null;
    }
}