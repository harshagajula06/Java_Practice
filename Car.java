class Car extends Vehicle
{
    private int speed;
    private boolean acAvailable;
    
    public Car(){}
    public Car(String vehicleno, String name, String brand, String color, String model, double price, int speed, boolean acAvailable)
    {
        super(vehicleno, name, brand, color, model, price);
        this.speed = speed;
        this.acAvailable = acAvailable;
    }

    public void display(){
        super.display();
        System.out.println(speed+"\n"+acAvailable);
    }
}