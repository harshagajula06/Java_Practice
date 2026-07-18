class Bike
{
    private int speed;
    private boolean helmet;
    
    public Bike(String kA011234, String pulsar, String bajaj, String black, String string, int par, int par1, boolean par2){}
    public Bike(String vehicleno, String name, String brand, String color, String model, double price, int speed, boolean helmet)
    {
        super(vehicleno, name, brand, color, model, price);
        this.speed = speed;
        this.helmet = helmet;
    }

    public void display(){
        super.display();
        System.out.println(speed+"\n"+helmet);
    }
}