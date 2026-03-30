/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.beecrowd_1041;

import java.util.Scanner;

/**
 *
 * @author maria elizabeth
 */
public class Beecrowd_1041 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double x = 0, y = 0;
        x = leitor.nextDouble();
        y = leitor.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("origem");
        } else {
            if (x == 0.0) {
                System.out.println("eixo y");
            } else {
                if (y == 0.0) {
                    System.out.println("eixo x");
                } else {
                    if (x > 0 && y > 0) {
                        System.out.println("Q1");
                    } else {
                        if (x < 0 && y > 0) {
                            System.out.println("Q2");
                        } else {
                            if (x < 0 && y < 0) {
                                System.out.println("Q3");
                            } else {
                                if (x > 0 && y < 0) {
                                    System.out.println("Q4");

                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
