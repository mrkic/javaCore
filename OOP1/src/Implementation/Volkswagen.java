package Implementation;

public class Volkswagen extends Car {
    
    public Volkswagen(String brand){
        super(brand);
    }
    public static void main(String[] args) {
        Volkswagen volks=new Volkswagen("Volkswagen");
        System.out.println(volks.toString());
    }
}
