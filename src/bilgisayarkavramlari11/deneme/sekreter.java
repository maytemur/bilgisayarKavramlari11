/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bilgisayarkavramlari11.deneme;

/**
 *
 * @author maytemur
 */
//abstract class bulaşıcı gibi entends ettiğinde ya overwrite edicen ya abstract olacak class'ın
public class sekreter extends calisan {
    
    static int sayac=0;
    
    int ikincisayac=0;
    public int getSayac(){
        return ikincisayac;
    }
    public void setSayac(int s){
        ikincisayac = s;
    }
    
    public sekreter(){
        sayac++;
    }
    
    public void maas(){
        System.out.println("maas 100");
    }
    public final void yetki(){
        System.out.println("yetkimi kimseye devretmem");        
    }
    public static void main(String[] args) {
        sekreter ayse= new sekreter();
        sekreter ali= new sekreter();
        System.out.println(ali.sayac); //bu 2 değerini verir!
        //static int sayac=0 yerine sadece int sayac=0 dersek ali.sayac 1 değerini verir
        //burdaki static değişkeni özel bir hafızada durduğu için herkes ona erişiyor!
        //aynı singleton gibi bundan türetilenler vs hep aynı değişkene eriştiğinden 1 değil
        //2 defa obje yaratıldığı için değişken değeri ali.sayac dediğimizde 2 veriyor!
        //diğerleri için resim SinifElemanlariNiteleyicilerNonAccessModifiers.png incelenebilir
        System.out.println(ali.getSayac());
    }
}
