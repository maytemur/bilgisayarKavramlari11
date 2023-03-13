/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bilgisayarkavramlari11;

/**
 *
 * @author maytemur
 * değişkenlerin başındaki public,private protected erişim kavramların access modifiers denir
 * javada boş olduğunda sadece paket içinden erişilebilir 
 * private olsa sadece class'ın içindekiler erişebilir extend inheritance etsende erişemezsin
 * protected olursa paket içinden ve sub class lardan erişilebilir ve inheritance ilişkisi içinde
 * olan extend edenlerde erişebilir
 * public olursa bütün sınıflar erişebilir
 */
public class insan {
    public int yas; //paketinden dışındanda erişilebilir oldu
    protected int boy;
    //private int boy; //bu extends edilsede hata verir!
    
    //bu fonksiyon bir şey yapmıyor sadece yas'a bu class içinden erişilebildiğini gösterdi
    int yasinkac(){
        return yas;
    }
}
