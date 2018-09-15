package ru.geekbrains.Lesson1;
import java.util.*;
//import java.lang.String;
//import java.lang.Object;
import java.io.DataInputStream;
public class AlexandreFilimonovJava1Lesson1 {

    public static void main(String[] args) {
        /////////////////////// Lesson 1 //////////////////////////////
        byte i1 = 16;
        short i2 = 10;
        int i3=2;
        long i4= 15675757;
        boolean boo6 = false;
        char c = 'c';
        float f = 277;
        double d = 14646.22;
        //метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        method1();
        Scanner sc = new Scanner(System.in);

        //метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        System.out.println("\na: enter an integer:");
        int a = sc.nextInt();

        System.out.println("\nb: enter an integer:");
        int b = sc.nextInt();
        System.out.println("\nSum of a and b is between 10 and 20: "+method2(a,b));

        System.out.println("\n: enter an integer:");
        b = sc.nextInt();
        System.out.println("\nThe number was positive: "+method3(b));

        System.out.println("\n: enter an integer:");
        b = sc.nextInt();
        System.out.println("\nThe number was negative: "+method4(b));

        System.out.println("\n: enter your name:");
        String s = sc.next();
        method5(s);
        /////////////////////// Lesson 2 //////////////////////////////

    }
    private static void method1() {

            Scanner sc = new Scanner(System.in);

            //метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
            System.out.println("\na: enter an integer:");
            int a = sc.nextInt();

            System.out.println("\nb: enter an integer:");
            int b = sc.nextInt();

            System.out.println("\nc: enter an integer:");
            int c = sc.nextInt();

            System.out.println("\nd: enter an integer:");
            int d = sc.nextInt();
            float r= a*(b+(c/d));
            System.out.println("\nThe result a*(b+(c/d))="+r);
    }
    private static boolean method2(int a, int b) {

        boolean c = false;
        if ((a+b)>=10 && (a+b)<=20) c = true;
        return c;
    }
    private static boolean method3(int a) {

        boolean c = false;
        if (a>=0) c = true;
        return c;
    }
    private static boolean method4(int a) {

        boolean c = false;
        if (a<0) c = true;
        return c;
    }
    private static void method5(String s) {
        System.out.println("\nПривет, "+s+"!");
		System.out.println("\nПожалуйста, прочтите ReadMe_Serguei.txt файл!");
        return;
    }
}
