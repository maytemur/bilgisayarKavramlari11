/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bilgisayarkavramlari11.deneme;

/**
 *
 * @author maytemur
 */
public class genelsekreter extends sekreter{
    public void yetki(String oyetkidegil){ //bu şu hatayı verir
        //yetki() in genelsekreter cannot override yetki() in sekreter overridden method is final
        //yeni diyorki üstüne yazdığın final yazamassın ama mesela yetki(int x) diye değiştirsen
        //o zaman polymorphs'ime giriyor o zaman başka bir obje olduğundan hata vermez
        System.out.println("en yetkili benim");
    }
}
