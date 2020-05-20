
 
package mayın.tarlası;

import java.util.Random;
import java.util.Scanner;


public class MayınTarlası {

   public static int [][] mayinTarlası (int satir , int sutun){
       
    
 Random rnd =new Random ();
 int [][] matris=new int [satir][sutun];
 int i=0;
 while(i<satir){
     
    int j=0;
    while(j<sutun){
        
        matris[i][j]=rnd.nextInt(2);
        j=j+1;
    }
    i=i+1;
 }
 for(int k=0;k<satir;k++){ 
     for(int l=0;l<sutun;l++)
         System.out.println(matris[k][l]+" ");
     System.out.println();
 }
        return matris;
   }
   
public static void main (String [] args) {
    Scanner klavye=new  Scanner (System.in);
    
    System.out.println("Oyunun Satır Boyutunu Giriniz:");
    int a=klavye.nextInt();
    System.out.println("Oyunun Sutun Boyutunu Giriniz:");
    int b=klavye.nextInt();
    int [][] oyunMatrisi=mayinTarlası (a,b);
    int puan=0;
    boolean kontrol=true;
    while (kontrol)
    {
       System.out.println("Seçtiğiniz konumun satır değerini giriniz:");
       int x=klavye.nextInt();
       System.out.println("Seçtiğiniz konumun sütun değerini giriniz:");
       int y=klavye.nextInt();
       if(oyunMatrisi[x][y]==1)
       {
           kontrol=false;
           }
       else
       {
           puan=puan+10;
           System.out.println("Devam et :)");
           
       }
           
       }
    System.out.println("Kaybettin :( Puanınız:"+puan);
    }
         
    

        
}  
    

