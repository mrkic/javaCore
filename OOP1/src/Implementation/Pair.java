package Implementation;

public final class Pair {
    private Object first;
    private Object second;
    public Pair(Object first, Object second){
        this.first=first;
        this.second=second;
    }
    public Object getFirst(){
        return this.first;
    }
    public Object getSecond(){
        return this.second;
    }

    @Override
    public boolean equals(Object pair2)
    {
        return (this.getFirst().equals(((Pair) pair2).getFirst()) && this.getSecond().equals(((Pair) pair2).getSecond()));
    }
   
    public String toString(){
        return "Pair: { First :  " + this.getFirst().toString() + " Second :" + this.getSecond().toString() + " }";
    }
    public static void main(String[] args) {
        Object ob1 = new Object();
        Object ob2 = new Object();
        ob1.equals(ob2);
        Pair pair = new Pair(ob1, ob2);
        System.out.println(pair.toString());
    }
}
