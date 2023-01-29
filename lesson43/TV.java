package lesson43;

public class TV {

    private String name ;
    private int age;
    private int price;
    private int diagonal;
    private String maker;


    public TV(String name, int age, int price, int diagonal, String maker) {
        this.name = name;
        this.age = age;
        this.price = price;
        this.diagonal = diagonal;
        this.maker = maker;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getMaker() {
        return maker;
    }

    @Override
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", diagonal=" + diagonal +
                ", maker='" + maker + '\'' +
                '}';
    }
}
