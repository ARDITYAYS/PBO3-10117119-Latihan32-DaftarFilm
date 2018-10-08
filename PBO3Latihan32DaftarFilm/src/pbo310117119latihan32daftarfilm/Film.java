/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan32daftarfilm;

/**
 *
 * @author Yogaputra
 */
public class Film {
    public String Name;
    public String Genre;
    public double Rating;
    public int Duration;
    
    public void nowPlaying(String Name, String Genre, double Rating, int Duration){
    
        System.out.println("Judul Film\t: "+Name);
        System.out.println("Genre Film\t: "+Genre);
        System.out.println("Reting Film\t: "+Rating);
        System.out.println("Duration Film\t: "+Duration+" Menit\n");
    
    }
    
}
