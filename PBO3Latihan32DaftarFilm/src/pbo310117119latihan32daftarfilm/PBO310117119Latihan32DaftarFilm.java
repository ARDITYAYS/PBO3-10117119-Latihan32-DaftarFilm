/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan32daftarfilm;

import java.util.jar.Attributes.Name;

/**
 *
 * @author Yogaputra
 * NAMA : ARDITYA YOGAPUTRA S
 * NIM : 10117119
 * KELAS : PBO3 / IF-3
 * Deskripsi Program : Menampilkan Jadwal film
 */
public class PBO310117119Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Film fl1 = new Film();
        fl1.Name ="Venom";
        fl1.Genre="Action, Horor, Scifi";
        fl1.Rating= 8.5;
        fl1.Duration= 120;        
        fl1.nowPlaying(fl1.Name,fl1.Genre,fl1.Rating,fl1.Duration);
        
        Film fl2 = new Film();
        fl2.Name ="Small Foot";
        fl2.Genre="Animation";
        fl2.Rating= 9.0;
        fl2.Duration= 96;        
        fl2.nowPlaying(fl2.Name,fl2.Genre,fl2.Rating,fl2.Duration);
        
        Film fl3 = new Film();
        fl3.Name ="Crazy Rich Asian";
        fl3.Genre="Comedy";
        fl3.Rating= 7.8;
        fl3.Duration= 119;        
        fl3.nowPlaying(fl3.Name,fl3.Genre,fl3.Rating,fl3.Duration);
        
        Film fl4 = new Film();
        fl4.Name ="Asih";
        fl4.Genre="Horor";
        fl4.Rating= 6.0;
        fl4.Duration= 100;        
        fl4.nowPlaying(fl4.Name,fl4.Genre,fl4.Rating,fl4.Duration);
    }
    
}
