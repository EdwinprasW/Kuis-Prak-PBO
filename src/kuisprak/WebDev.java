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
public class WebDev extends Menu implements HitungNilai{
    private float tc, ww, tt, nik;
    private String nama;
    Scanner input = new Scanner(System.in);

    public WebDev(float tc, float ww, float tt, float nik, String nama) {
        this.tc = tc;
        this.ww = ww;
        this.tt = tt;
        this.nik = nik;
        this.nama = nama;
    }
    
     public void webmenu(){
        int pilih = 0;
        System.out.println("");
        System.out.println("Menu");
        System.out.println("1. Edit");
        System.out.println("2. Tampil");
        System.out.println("3. Exit");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        
        switch (pilih) {
        
            case 1 : 
                EditNilai();
            
            case 2 :
                TampilkanNilai();
                
            case 3 :
                System.exit(0);
        }
        
        
    }
     
    @Override
      public void EditNilai(){
    System.out.println("Form Edit");
    System.out.println("");
    System.out.print("Input Nilai Tes Tulis : "); 
    tt = input.nextFloat();
    setTt(tt);
    System.out.print("Input Nilai Tes Coding : ");
    tc = input.nextFloat();
    setTc(tc);
    System.out.print("Input Nilai Tes Wawancara : ");
    ww = input.nextFloat();
    setWw(ww);
    webmenu();
    }
    
    public void TampilkanNilai(){

        System.out.println("Nilai akhir : " + Nilai());
        if(Nilai() >= 85){
            System.out.println("Keterangan : LOLOS");
            System.out.println("Selamat kepada " + nama + " telah diterima sebagai web" );  
        }else{
            System.out.println("Keterangan : GAGAL");
            System.out.println("Mohon maaf kepada " + nama + " telah ditolak sebagai web" ); 
        }
        System.out.println("");
        webmenu();
    }
    

    public void setTc(float tc) {
        this.tc = tc;
    }

    public void setWw(float ww) {
        this.ww = ww;
    }

    public void setTt(float tt) {
        this.tt = tt;
    } 

    @Override
    public float Nilai() {
    float nilai = (ww * 25/100) + (tc * 35/100) + (tt * 40/100);
    return nilai; 
}
     
    
}
