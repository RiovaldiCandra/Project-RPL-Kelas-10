/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author MOKLET-2
 */
import java.util.Scanner;
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int BungaMelati,BungaMawar,BungaMatahari;
        float Diskon,Harga,TotalHarga,HargaDiskon;
        String jawab;
        boolean Bunga = true;
        Scanner input = new Scanner (System.in);
        while (Bunga)  {
            System.out.println("TotalBungaMelati = ");
            BungaMelati = input.nextInt();
            System.out.println("TotalBungaMawar = ");
            BungaMawar = input.nextInt();
            System.out.println("TotalBungaMatahari = ");
            BungaMatahari = input.nextInt();
            Harga = (float) 5250.9;
            TotalHarga = (BungaMelati+BungaMawar+BungaMatahari)*Harga;
            if (TotalHarga>= 50000){
                Diskon = (float)  (0.2*TotalHarga);
                HargaDiskon = TotalHarga-Diskon;
                System.out.println(HargaDiskon);
                System.out.println("SELAMAT ANDA MENDAPATKAN DISKON");
            }
            else {
                System.out.println(TotalHarga);
                
            }
            System.out.println("APAKAH ANDA INGIN MENGULANG? YA ATAU TIDAK?");
            jawab = input.next();
        if (jawab.equalsIgnoreCase("ya")){
            Bunga = true;
        }
        if (jawab.equalsIgnoreCase("tidak")){
            Bunga = false;
        }
        }
    }
    
}
