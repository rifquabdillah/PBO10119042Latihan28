/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;
import java.util.Scanner;


/**
 * Nama : Muhammad Rifqu Abdillah
 * Kelas: Pbo-IF1
 * Nim : 10119042 
 * 
 */
public class PBO10119042Latihan28 {
       public static void main (String[] args) {
        String hasil = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Mengganti Kata====\n");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        String kata_lama = scanner.nextLine();
        System.out.print("Menjadi Kata : ");
        String kata_baru = scanner.nextLine();
        String[] perkata = kalimat.split(" ");
        for (String kata : perkata) {
            if (kata.equalsIgnoreCase(kata_lama)) {
                hasil += kata_baru + " ";
            }
            else {
                hasil += kata + " ";
            }
        }
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : "+kalimat);
        System.out.println("Kalimat baru : "+hasil.trim());
    }
}
