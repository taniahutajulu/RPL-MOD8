package com.company;
import java.io.*;
import java.io.DataInputStream;
import java.util.Scanner;

public class Main {


        // write your code here
        public static void main (String[]args){
            System.out.println("Masukan Angka : ");
            Scanner sc = new Scanner(System.in);
            int i;
            int n = sc.nextInt();

            for (i = 0; i < (2 * n) + 1; i++) {

                for (int j = 0; j < (2 * n) + 1; j++) {

                    if (i < n) {
                        if ((j > n - i) && (j < n + i)) {
                            System.out.print("*");
                        } else {
                            System.out.print("0");
                        }
                    } else {

                        if ((j > i - n) && (j < 3 * n - i)) {
                            System.out.print("*");
                        } else {
                            System.out.print("0");
                        }

                    }
                }
                System.out.println();

            }
        }
    }

