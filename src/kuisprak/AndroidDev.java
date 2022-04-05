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
public class AndroidDev implements HitungNilai{
    private int tc, ww, tt, nik;
    private String nama;
    Scanner input = new Scanner(System.in);
    
    public AndroidDev(int tc, int ww, int tt, int nik, String nama) {
        this.tc = tc;
        this.ww = ww;
        this.tt = tt;
        this.nik = nik;
        this.nama = nama;
    }
    
    
    public void andromenu(){
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
                androedit();
            
            case 2 :
                androtampil();
                
            case 3 :
                System.exit(0);
        }
        
        
    }
    
    public void androedit(){
    System.out.println("Form Edit");
    System.out.println("");
    System.out.print("Input Nilai Tes Tulis : "); 
    tt = input.nextInt();
    setTt(tt);
    System.out.print("Input Nilai Tes Coding : ");
    tc = input.nextInt();
    setTc(tc);
    System.out.print("Input Nilai Tes Wawancara : ");
    ww = input.nextInt();
    setWw(ww);
    andromenu();
    }
    
    public void androtampil(){

        System.out.println("Nilai akhir : " + Nilai());
        if(Nilai() >= 85){
            System.out.println("Keterangan : LOLOS");
            System.out.println("Selamat kepada " + nama + " telah diterima sebagai android" );  
        }else{
            System.out.println("Keterangan : GAGAL");
            System.out.println("Mohon maaf kepada " + nama + " telah ditolak sebagai android" ); 
        }
        System.out.println("");
        andromenu();
    }
    

    public void setTc(int tc) {
        this.tc = tc;
    }

    public void setWw(int ww) {
        this.ww = ww;
    }

    public void setTt(int tt) {
        this.tt = tt;
    } 

    @Override
    public float Nilai() {
    float nilai = (ww * 30/100) + (tc * 50/100) + (tt * 20/100);
    return nilai; 
}

}

