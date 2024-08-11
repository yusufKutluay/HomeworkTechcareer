package com.yusufkutluay.kotlindersleri.odevler

class Odev2 {

    // 1. Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayıp sonucu geri gönderen
    //metod yazınız.

    fun icAciToplam(kenarSayisi : Int) : Int {

        val toplam = (kenarSayisi - 2) * 180
        return toplam

    }

    // 2. Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren
    //metod yazınız.

    fun maasHesabi(gunSayisi : Int) : Int{

        val toplamSaat = gunSayisi * 8
        var toplamMaas = 0

        if (toplamSaat >= 160){
            toplamMaas = 160 * 10 + (toplamSaat - 160) * 20
        }else {
            toplamMaas = toplamSaat * 10
        }
        return toplamMaas
    }

    //3. Parametre olarak girilen kota miktarına göre ücreti hesaplayarak geri döndüren metodu yazınız.

    fun kotaUcret(kotaMiktari : Int) : Int {

        var kotaUcreti = 0
        if (kotaMiktari > 50){
            kotaUcreti = 50 * 2 + (kotaMiktari - 50) * 4
        }else{
            kotaUcreti = kotaMiktari * 2
        }

        return kotaUcreti
    }

    //1. Parametre olarak girilen dereceyi fahrenhiet'a dönüştürdükten sonra
    //geri döndüren bir metod yazınız. F = C x 1.8 + 32

    fun fahrenheitHesap (fahrenheit : Double) : Double {

        val fahrenheitHesap = fahrenheit * 1.8 + 32
        return fahrenheitHesap

    }

    //2. Kenarları parametre olarak girilen ve dikdörtgenin çevresini
    //hesaplayan bir metod yazınız.

    fun dikdortgenCevre (kisaKenar : Int,uzunKenar : Int) {

        val cevreHesap = kisaKenar * 2 + uzunKenar * 2
        println("5. Dikdörtgenin çevre uzunluğu : $cevreHesap")

    }

    //3. Parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri
    //döndüren metodu yazınız.

    fun faktorHesap (sayi : Long) : Long {

        var faktorHesapla : Long = 1
        for (i in sayi downTo 1 step 1){
            faktorHesapla = faktorHesapla * i
        }

        return faktorHesapla
    }

    //4. Parametre olarak girilen kelime içinde kaç adet a harfi olduğunu
    //gösteren bir metod yazınız.

    fun kelimeUzunlukHesap(kelime : String) {

        val yeniKelime = kelime.lowercase()
        var aSayisi = 0

        for (i in 0 until kelime.length){
            if (yeniKelime[i] == 'a'){
                aSayisi++
            }
        }
        println("7. Kelimedeki a harfi sayısı : $aSayisi")
    }

}