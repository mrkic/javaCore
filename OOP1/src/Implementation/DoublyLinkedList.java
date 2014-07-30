package Implementation;


public class DoublyLinkedList {
    private Box head;
    private Box last;
    
    public DoublyLinkedList(){
        head = null;
        last = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public DoublyLinkedList(int data){
        head = new Box(data);
        last = null;
    }
    
    //
    public void Add(int data, int position){
        Box current = head;
        Box newBox = new Box(data);
        if(position > this.size()+1){
            System.out.println("--- Wrong position! ---");
            return;
        }
        if(this.isEmpty()){
            this.head = newBox;
            this.last = head;
            return;
        }
        if(position == 1){

            AddFirst(data);
            return;
            
        }
        if(position == size()+1){

            AddLast(data);
            return;
        }
        for(int i=0; i<position -2; i++){
            current = current.next;
        }
        newBox.next = current.next;
        newBox.previous = current;
        current.next = newBox;
    }
    
    public void Add(int data){
        Box newBox = new Box(data);
        if(this.isEmpty()){
            
            head = newBox;
            last = head;
            return;
        }

        last.next = newBox;
        newBox.previous = last;
        last = newBox;
    }
    
    public void AddFirst(int data){
       
        if(this.isEmpty()){
            head = new Box(data);
            last = head;
            return;
        }

        Box newBox = new Box(data);
        head.previous = newBox;
        newBox.next = head;
        
        head = newBox;
    }
    //
    public void AddLast(int data){
        Box newBox = new Box(data);
        if(isEmpty()){
            head = newBox;
            last = newBox;
            return;
        }
        
        last.next = newBox;
        newBox.previous = last;
        last = newBox;
        
    }
    
    
    public int getHead(){
        return head.data;
    }
    public int getLast(){

        return last.data;
    }
    public int getElement(int position){
        if(position > this.size()){
            return 0;
        }
        if(position == 1){
            return this.getHead();
        }
        if(position == this.size()){
            return this.getLast();
        }
        Box current = head;
        for(int i=0; i<position-1; i++){
            current = current.next;
        }
        return current.data;
        
    }
    
    public int size(){
        int counter =0;
        Box current = head;
        while(current != null){
            counter++;
            current = current.next;
        }
        return counter;
    }
    public void print(){
        Box current = this.head;
        do{
            System.out.print(current.data + " ");
            current = current.next;
        }while(current != null);
        System.out.println();
    }
    public void remove(int position){

        if(position == 1 || head == null){
            head = null;
        }
        Box current = head;
        for(int i=0; i<position -2; i++){
            current = current.next;
        }
        if(current.next == last){
            Box temp = current.next;
            current.next.previous = temp.previous;
            current.next = temp.next;
            last = current;
            return;
        }
        Box temp = current.next;
        current.next.previous = temp.previous;
        current.next = temp.next;
        
        
    }
    
 
public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();
    System.out.println(dll.size());
    dll.Add(1);
    dll.Add(2);
    dll.Add(3);
    dll.Add(4,3);
    dll.print();
    dll.remove(dll.size());
    dll.print();
//    dll.Add(5);
    System.out.println(dll.getLast());
    dll.print();
//    dll.reverse();
    dll.print();

}
}


class Box{
    int data;
    Box next;
    Box previous;
    public Box(int data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
