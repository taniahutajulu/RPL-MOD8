package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner (System.in);
        int n;
        System.out.print("Jumlah deret fibonacci yang diinginkan: ");
        n = s.nextInt();
        for (int i = 1; i<=n; i++){
            int x = cari(i);
            System.out.print(x + " ");

        }
    }
    public static int cari(int n){
        if (n == 1 || n ==2){
            return 1;
        }else {
            return cari(n-1) + cari(n-2);

        }
    }
}
