package lesson43;

import lesson42.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<Auto> autos=  new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        autos.add(new Auto("Toyota mark 2",2002,15000,"Gray",240));
        autos.add(new Auto("BMW e46",2009,4000,"Black",200));
        autos.add(new Auto("Nissan gtr34",1998,20000,"Black",450));
        autos.add(new Auto("Jaguar",2008,10000,"Red",260));
        autos.add(new Auto("Nissan juk",2015,8000,"White",120));

        Stream<Auto> masStream = autos.stream();
        masStream.forEach(x-> System.out.println(x));


        System.out.println("enter color:");
        String s = sc.next();
        autos.stream().filter(x -> x.getColor().equals(s)).forEach(x-> System.out.println(x));

        System.out.println("enter VEngine:");
        int si = sc.nextInt();
        autos.stream().filter(x -> x.getVEngine()==si).forEach(x-> System.out.println(x));

        System.out.println("enter Price:");
        int sp = sc.nextInt();
        autos.stream().filter(x -> x.getPrice()>sp).forEach(x-> System.out.println(x));

        System.out.println("enter fAge:");
        int sfa = sc.nextInt();
        System.out.println("enter lAge:");
        int sla = sc.nextInt();
        autos.stream().filter(x -> x.getAge()<sla && x.getAge()>sfa).forEach(x-> System.out.println(x));



    }
}
