package Implementation;

public class StackLL {
    private int top;
    private Node head;
    private Node last;
//class LinkedList{
//    
//  
    public StackLL(StackLL stack){
        this.top = stack.top;
        this.head = stack.head;
        this.last = stack.last;
    }
    
    public StackLL(){
        this.top=0; 
        this.head=null;
        this.last=null;
    }
    
    public void push(int element){
        if(top==0){
            head= new Node(element);
            last=head;
            top++;
            return;
        }
//        if(top==1){
//            Node newNode = new Node(element);
//            newNode.next = last.next;
//            newNode.previous = head;
//            top++;
//            return;
//        }
        else{
            Node newNode = new Node(element);
//            newNode.next = last.next;
//            newNode.previous = last.previous;
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
            
            top++;
        }
    }
    
    public int pop(){
        if(head == null){
            return 0;
        }
        if(top==1){
            int data = this.head.data;
            head=null;
            top--;
            return data;
        }
        int popData = last.data;
        Node current = head;
        for(int i=0; i<top -2; i++){
            current = current.next;
        }
     //   Node temp = current.next;
//        System.out.println(current.next.data);
        Node temp = current.next;
        current.next.previous = temp.previous;
        current.next = temp.next;
        last = current;
        
        top--;
        return popData;
    }
    
    public int getTop(){
        return this.last.data;
    }
    
    public boolean isEmpty(){
        return top==0;
    }
    public int size(){
        return top;
    }
    
    public static void main(String[] args) {
        StackLL stack = new StackLL();
        System.out.println(stack.isEmpty());
        for(int i=1; i<=10; i++)
        stack.push(i);
        System.out.println(stack.isEmpty());
        for(int i=0; i<10; i++)
            System.out.print(stack.pop() + " ");
        System.out.println();
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
//        stack.push(1);
//        stack.push(2);
//        System.out.println(stack.pop() + " " + stack.top);
//        System.out.println(stack.pop());
    }
    
    
    class Node{
        Node next;
        Node previous;
        int data;
        
        public Node(int data){
            this.data=data;
            this.previous = null;
            this.next = null;
        }
//    }
}

}
