/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisprak;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class KuisPrak {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Scanner instring = new Scanner(System.in);
         int pilih = 1;        
         int tt = 0, tc = 0 , ww = 0, nik = 0;
             String nama;
         
         
        while(pilih != 0){
        System.out.println("=============================");
        System.out.println("  FORM PENDAFTARAN PT UDIN");
        System.out.println("=============================");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.println("0. Exit");
        System.out.print("Pilih Jenis Form = ");
        pilih = input.nextInt();
        
         switch (pilih){
             case 1 :
            
            
            System.out.println("");
            System.out.println(" Form Pendaftaran ");
            System.out.println("");
            System.out.print("Input NIK : ");
            nik = input.nextInt();
            System.out.print("Input Nama : ");
            nama = instring.nextLine();
            System.out.print("Input Nilai Tes Tulis : "); 
            tt = input.nextInt();
            System.out.print("Input Nilai Tes Coding : ");
            tc = input.nextInt();
            System.out.print("Input Nilai Tes Wawancara : ");
            ww = input.nextInt();
            
            AndroidDev andro = new AndroidDev(tc, ww, tt, nik, nama);
            andro.andromenu();
            
             case 2 :
            
            System.out.println("");
            System.out.println(" Form Pendaftaran ");
            System.out.println("");
            System.out.print("Input NIK : ");
            nik = input.nextInt();
            System.out.print("Input Nama : ");
            nama = instring.nextLine();
            System.out.print("Input Nilai Tes Tulis : "); 
            tt = input.nextInt();
            System.out.print("Input Nilai Tes Coding : ");
            tc = input.nextInt();
            System.out.print("Input Nilai Tes Wawancara : ");
            ww = input.nextInt();
            
            WebDev web = new WebDev(tc, ww, tt, nik, nama);
            web.webmenu();
                 
             default :
             System.exit(0);
         
         
         }
         
         
         }
}
    
}
