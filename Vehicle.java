class Vehicle
{
    private String vehicleno;
    private String name;
    private String brand;
    private String color;
    private String model;
    private double price;

    public Vehicle(){}
    public Vehicle(String vehicleno, String name, String brand, String color, String model, double price)
    {
        this.vehicleno = vehicleno;
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.price = price;
    }

    public void display(){
        System.out.println();
        System.out.println("Vehicle Details:");
        System.out.println(vehicleno+"\n "+name+"\n "+brand+"\n "+color+"\n "+model+"\n "+price);
    }
}