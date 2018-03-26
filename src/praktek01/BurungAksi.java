/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author proWindows8.1
 */
public class BurungAksi {
    public static void main(String[] args) {
        Burung Elang = new Burung ();
        Burung Merak = new Burung ();
        Burung Gagak = new Burung ();
        
        Elang.nama="Elang";
        Elang.warna_burung="Coklat Emas";
        Elang.makanan="Daging/tikus,ikan";
        Elang.panjang_burung="70-80cm";
        Elang.bentuk_ekor="Panjang kerucut";
        Elang.tinggi_burung="90cm";
        
        Gagak.nama="Gagak";
        Gagak.warna_burung="Hitam pekat";
        Gagak.makanan="Sejenis bangkai daging";
        Gagak.panjang_burung="56-78cm";
        Gagak.bentuk_ekor="Lebar mengembang";
        Gagak.tinggi_burung="50cm";
        
        Merak.nama="Merak";
        Merak.warna_burung="Hijau kebiru-biruan";
        Merak.makanan="Biji-bijian/serangga";
        Merak.panjang_burung="100-120cm";
        Merak.bentuk_ekor="Mengembang sangat lebar";
        Merak.tinggi_burung="70cm";
    }
}
