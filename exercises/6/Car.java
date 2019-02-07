public class Car {
    int weight;
    String color;
    String name;

    public Car()
    {
        this.name = "Fride";
        this.color = "White";
        this.weight = 500;
    }

    public Car(String name)
    {
        this.name = name;
        this.color = "White";
        this.weight = 500;
    }

    public Car(String name, String color)
    {
        this.name = name;
        this.color = color;
        this.weight = 500;
    }

    public Car(String name, String color, int weight)
    {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Saland");
        Car c3 = new Car("Saland", "Black");
    }

}
