package lesson43;

import lesson42.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        final int size =10;
        List<Integer> mas=  new ArrayList<>(size);
        Random gen = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<size;i++){
            mas.add(gen.nextInt(3)+1);
        }
        System.out.println(mas);

        System.out.println("/2 = " + mas.stream().filter(x-> x%2 == 0 ).count());
        System.out.println("!/2 = " + mas.stream().filter(x-> x%2 != 0 ).count());
        System.out.println("null  " + mas.stream().filter(x-> x == 0 ).count());
        System.out.print("enter num");
        int n = sc.nextInt();
        System.out.println(" == " + n + " "+ mas.stream().filter(x->x==n).count());
    }


}
