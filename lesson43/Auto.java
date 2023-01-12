package lesson43;

public class Auto {

    private String name ;
    private int age;
    private int price;
    private String color;
    private int VEngine;

    public Auto(String name, int age, int price, String color, int VEngine) {
        this.name = name;
        this.age = age;
        this.price = price;
        this.color = color;
        this.VEngine = VEngine;
    }

    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }



    public double getPrice() {
        return price;
    }



    public String getColor() {
        return color;
    }



    public int getVEngine() {
        return VEngine;
    }


    @Override
    public String toString() {
        return "Auto " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                "$ , color='" + color + '\'' +
                ", VEngine=" + VEngine ;

    }
}
