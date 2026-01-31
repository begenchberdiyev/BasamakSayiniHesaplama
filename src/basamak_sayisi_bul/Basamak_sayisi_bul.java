
package basamak_sayisi_bul;

import java.util.Scanner;


public class Basamak_sayisi_bul {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayi giriniz: ");
        int sayi = input.nextInt();
        int sayac=0;
        while(sayi !=0){
            sayi/=10;
            sayac++;
            
        }
        System.out.println("Basamak sayisi: "+sayac);
    }
    
}


   
    
     
    



