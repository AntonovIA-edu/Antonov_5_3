package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter height: ");
        int h = console.nextInt();
        System.out.println("Enter weight: ");
        int m = console.nextInt();

        PotentialEnergy energy = new PotentialEnergy(h,m);
        System.out.println(energy.CountEnergy());
    }
}
