/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilgisayarkavramlari11;

/**
 *
 * @author maytemur
 * Java'da Encapsulation ve Soyutlama (Abstraction) Java Eğitim 7-
 * Nesne Yönelimli Programlama (Java ile) 9ncu video
 * Soyutlama yani bir nevi dışlama en çok korunması gereken diğerlerinden soyutlanması gereken
 * değerler değişkenler fonksiyonlar için gerekli olur
 */
public class Bilgisayarkavramlari11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        insan ali = new insan();
        ali.yas = 36;
        System.out.println(ali.yas);
        //eğer yukarıdaki package olmasaydı bu class'ı bulamazdı public olmasına rağmen
        //veya package'ı yukarıda yazmayıp satırda da bildirebilirdik
        //bilgisayarkavramlari11.insan ali = new bilgisayarkavramlari11.insan(); şeklinde
        
                                                                                    
    }
    
}
