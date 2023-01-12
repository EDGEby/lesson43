package lesson43;

import lesson42.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {

        final int size =30;
        ArrayList<String> mas0= new ArrayList<>(List.of("Minsk","Dublin", "EKB","Bobryisk", "Lyxemburg","Berezino","Grodno","Gomel","Moskow","Tokyo"));
        List<String> mas= new ArrayList<>();
        Random gen = new Random();
        for (int i=0;i<size;i++){
            mas.add(mas0.get(gen.nextInt(mas0.size())));
        }
        Scanner sc = new Scanner(System.in);
        int temp=6;

        System.out.println(mas);
        System.out.println("");


        Stream<String> masStream = mas.stream();
        Stream<String> filtered = masStream.filter(x -> x.length()>temp);
        System.out.println("sity len> 6 : ");
        filtered.forEach(x -> System.out.println(x));
        System.out.println("");


        System.out.print("enter Name of city\n");
        String s = sc.next();
        System.out.println(" == " + s + " "+ mas.stream().filter(x->x.equals(s)).count());

        mas.stream().filter(x-> x.charAt(0)=='M').forEach(x->System.out.println(x+ " "));
        System.out.println();

    }
}
