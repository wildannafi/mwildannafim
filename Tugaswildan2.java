/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaswildan2;

/**
 *
 * @author ohank
 */
public class Tugaswildan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int nilai = 90;
        String paras    = "cantik" ;
        String asal     = "malang" ;
    
        char nilaihuruf;
            if (nilai >= 85 ){
            nilaihuruf = 'A' ;
            System.out.println("Nilai = "+nilaihuruf);
            }
            else if (nilai < 85 && nilai >= 75){
            nilaihuruf = 'B' ;
            System.out.println("Nilai = "+nilaihuruf);
            }
            else if (nilai < 75 && nilai >= 65){
            nilaihuruf = 'C' ;
            System.out.println("Nilai = "+nilaihuruf);
            }
            else if (nilai < 65 && nilai >= 55){
            nilaihuruf = 'D' ;
            System.out.println("Nilai = "+nilaihuruf);
            }
            else {nilaihuruf = 'E' ;
            System.out.println("Nilai = "+nilaihuruf);
            }
     
            System.out.println("apakah mau menikah ?");
     
            if (nilaihuruf == 'A' && paras == "cantik" && asal == "malang" ){
            System.out.println("Mau Lah");
            }
            else if (nilaihuruf == 'A' || nilaihuruf == 'C' && paras == "cantik" && asal == "malang" ){
            System.out.println("Boleh Lah");
            }
            else if (asal == "malang" ){
            System.out.println("Saya Pikir-pikir dulu");
            }
            else {
            System.out.println("Absolutly No!");
            }
    }
    
}
