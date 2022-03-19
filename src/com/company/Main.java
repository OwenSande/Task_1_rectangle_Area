package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        RectangleArea obj = new RectangleArea();
        obj.getData();
        obj.computeField();
        obj.fieldDisplay();
    }

}

class RectangleArea {
    double a, b, area;
    void getData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program will calculate area of a rectangle");
        System.out.println("Enter the length of side a ");
        a = Double.parseDouble(br.readLine());
        System.out.println("Enter the length of side b");
        b = Double.parseDouble(br.readLine());

    }
    void computeField(){area = a * b;}

    void fieldDisplay(){
        System.out.println("The area of the rectangle with the side a is ");
        System.out.printf("%2.2f", a);
        System.out.println(" and side b is ");
        System.out.printf("%2.2f",b);
        System.out.print(" is = ");
        System.out.printf("%2.2f.", area);

    }

}
