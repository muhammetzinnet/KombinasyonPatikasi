package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nKumesi, rKumesi, kombinas;
        int nKumesiFak = 1, rKumesiFak = 1, nrKumesiFak = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz = ");
        nKumesi = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz = ");
        rKumesi = scanner.nextInt();

        for (int i=1;i<=nKumesi;i++){
            nKumesiFak *=i;
        }

        for (int i=1; i<=rKumesi; i++){
            rKumesiFak *= i;
        }

        for (int i=1; i<=(nKumesi - rKumesi); i++){
            nrKumesiFak *=i;
        }

        kombinas = nKumesiFak / (rKumesiFak*nrKumesiFak);
        System.out.println("Kombinasyon = "+ kombinas);

    }
}
