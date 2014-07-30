package Implementation;

public class Car {
    private String brand;
    public String toString(){
        return this.brand+"@" + super.toString(); // sys super vikame funk ot super(bashtiniya) klas
    }
    public Car(String brand)
    {
        this.brand=brand;
    }
    
    public static void main(String[] args) {
        Car car= new Car("Audi");
        System.out.println(car.toString());
    }
}
