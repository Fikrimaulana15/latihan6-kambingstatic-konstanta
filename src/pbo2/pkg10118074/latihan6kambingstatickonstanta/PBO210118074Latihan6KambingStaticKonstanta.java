/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan6kambingstatickonstanta;

/**
 *
 * @author 
 * NAMA : FikriMulana
 * KELAS : IF-2
 * NIM : 10118074
 */
public class PBO210118074Latihan6KambingStaticKonstanta {
    //Variabel jumlahKambing dideklarasikan sebagai statik
    public static int jumlahKambing;

    

    public class KambingStatic {
        
      //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING ="MIDUN";
    }
    
    
    public static void main(String[] args) {
        PBO210118074Latihan6KambingStaticKonstanta.jumlahKambing = 485000;
        String NAMA_KAMBING ="MIDUN";
        System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak " 
                +PBO210118074Latihan6KambingStaticKonstanta.jumlahKambing);
    }
    
}
