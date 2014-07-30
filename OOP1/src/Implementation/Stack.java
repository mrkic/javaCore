package Implementation;

public class Stack {
private int top;
private int[] stack;
public Stack(int size){
    stack = new int[size];
    this.top=0;
}
public void setTop(int top){
    this.top = top;
}
public void setStack(int [] stack){
    this.stack = new int[stack.length];
    for(int i=0; i<stack.length; i++)
        this.push(stack[i]);
}
public Stack(int[] stack){
    this.setStack(stack);
}
public int getTop(){
    return this.top;
}
public int[] getStack(){
    return this.stack;
}
public Stack(Stack stack){
    this.setTop(stack.top);
    this.setStack(stack.stack);
}
public void push(int integer){
    if(this.stack.length == this.length()){
        System.out.println("--- Stack is full ---");
        return;
    }
    if(this.search(integer)==false){
    this.stack[top++]=integer;
    }
}
public void clear(){
    if(this.length()==1)
        System.out.println(this.pop());
    else {
        System.out.print(this.pop() + " ");
    this.clear();
    }
}
public int length(){
    return this.top;
}
public boolean isEmpty(){
    return this.top == 0;
}
public int pop(){
    if(this.isEmpty())
    {
        System.out.println("--- Stack is empty ---");
        return 0;
    }
    return stack[--top];
}
public boolean search(int integer){
    boolean found = false;
    for(int i=0; i<this.stack.length; i++)
        if(integer == this.stack[i]){
            found = true;
            System.out.println("--- There is already " + integer + "! ---");
            break;
        }
    return found;
}
public static void main(String[] args) {
    int size=15;
    Stack stack = new Stack(size);
    stack.pop();
    for(int i=0; i<size-1; i++){
        stack.push(i+1);
    }
    stack.push(1);
    stack.clear();
}
}
