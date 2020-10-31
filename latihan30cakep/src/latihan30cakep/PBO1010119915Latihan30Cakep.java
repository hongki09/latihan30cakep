/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan30cakep;

import java.util.Scanner;

/**
 *
 * @author M Hongki Alfikram
 * Kelas : IF10-K
 * NIM :10119915
 */
public class PBO1010119915Latihan30Cakep {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String jawab;
        String normal = "\u001b[0m";
        String merah = "\u001b[31m";
        String hijau = "\u001b[32m";
        String kuning = "\u001b[33m";
        String biru = "\u001b[34m";
        String ungu = "\u001b[35m";
        String birumuda = "\u001b[36m";
        String putih = "\u001b[37m";
        
        System.out.print(merah + "Kamu " + hijau + "ngerjain sendiri " + kuning + "latihan 17 sampe " + biru + "latihan 30 ini? \nJawab " + merah + "(Yoi/Enggak) : " + normal);
        jawab = input.next();
        jawab = jawab.toUpperCase();
        System.out.println("\n");
        if(jawab.equals("YOI"))
            {
            System.out.println(merah + "Cakep bener. " + ungu + "Good Job" + normal);
            }
        else if(jawab.equals("ENGGAK"))
            {
            System.out.println(merah + "Tetep cakep sih.\n" + birumuda + "Sing penting paham konsep nya yee.\n" + normal + "Keep the code works dude");
            }
        else
            System.out.println(" ");
    }
        
}
