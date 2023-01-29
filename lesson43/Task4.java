package lesson43;


import java.util.*;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {

        ArrayList<TV> tvs=  new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        tvs.add(new TV("G28RS",2018,800,25,"Samsung"));
        tvs.add(new TV("YanTV2.0",2022,500,35,"Yandex"));
        tvs.add(new TV("G28RV",2018,600,15,"Samsung"));
        tvs.add(new TV("EX12WS",2020,550,20,"Horizont"));
        tvs.add(new TV("TRBFe2",2002,200,20,"Samsung"));

        Stream<TV> masStream = tvs.stream();
        masStream.forEach(x-> System.out.println(x));



        System.out.println("enter diagonal:");
        int si = sc.nextInt();
        tvs.stream().filter(x -> x.getDiagonal()==si).forEach(x-> System.out.println(x));

        System.out.println("enter maker:");
        String s = sc.next();
        tvs.stream().filter(x -> x.getMaker().equals(s)).forEach(x-> System.out.println(x));

        System.out.println("enter age:");
        int sia = sc.nextInt();
        tvs.stream().filter(x -> x.getAge()==sia).forEach(x-> System.out.println(x));

        System.out.println("enter Price:");
        int sp = sc.nextInt();
        tvs.stream().filter(x -> x.getPrice()>=sp).forEach(x-> System.out.println(x));

        System.out.println("sort by Price up:");
        tvs.stream().sorted(Comparator.comparingInt(TV::getPrice)).forEach(x->System.out.println(x));
        System.out.println("sort by Price down:");
        tvs.stream().sorted(Comparator.comparingInt(TV::getPrice).reversed()).forEach(x->System.out.println(x));

        System.out.println("sort by Diagonal up:");
        tvs.stream().sorted(Comparator.comparingInt(TV::getDiagonal)).forEach(x->System.out.println(x));
        System.out.println("sort by Diagonal down:");
        tvs.stream().sorted(Comparator.comparingInt(TV::getDiagonal).reversed()).forEach(x->System.out.println(x));



    }
}
