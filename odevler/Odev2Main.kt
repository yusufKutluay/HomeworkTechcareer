package com.yusufkutluay.kotlindersleri.odevler

fun main() {

    val odev2 = Odev2()

    println("1. İç açılar toplamı : ${odev2.icAciToplam(4)}")

    println("2. Maaş Toplamı : ${odev2.maasHesabi(50)}")

    println("3. Kota ÜCreti : ${odev2.kotaUcret(100)}")

    println("4. Fahrenheit Hesaplama : ${odev2.fahrenheitHesap(22.0)}")

    odev2.dikdortgenCevre(10,20)

    println("6. Faktöriyel : ${odev2.faktorHesap(7)}")

    odev2.kelimeUzunlukHesap("Techcareer")

}