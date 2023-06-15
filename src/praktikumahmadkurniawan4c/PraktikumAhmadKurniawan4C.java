/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumahmadkurniawan4c;

import java.util.HashSet;
import salary.*;

/**
 *
 * @author ASUS
 */
public class PraktikumAhmadKurniawan4C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        penggajian praktik = new penggajian();
        
        praktik.setStatus("Belum");
        System.out.println(praktik.getTunjStatus());
        
        praktik.setjumlahAnak(0);
        System.out.println(praktik.getTunjAnak());
        
        praktik.setMasaKerja(2);
        System.out.println(praktik.getTunjMasaKerja());
        
        praktik.setGolongan("Gol 1");
        System.out.println(praktik.getTunjGolongan());
        
    }
    
}
