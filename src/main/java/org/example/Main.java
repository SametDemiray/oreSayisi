package org.example;
/*
Ore sayıları, aynı zamanda harmonik bölücüler olarak da bilinir. Bir sayının harmonik bölücü olması için, o sayının tüm bölenlerinin
harmonik serisinin bir elemanı olması gerekir. Harmonik seri, terimlerinin tersinin toplamının olduğu bir seridir.Bu durumda, bir
sayının harmonik bölücü veya Ore sayısı olup olmadığını kontrol etmek için, sayının tüm bölenlerinin toplamının kendisine eşit olup
olmadığını kontrol etmek yeterlidir.
Örneğin, 28 sayısını ele alalım:

Bölenleri: 1, 2, 4, 7, 14, 28
Bu durumda, 28'in bölenlerinin toplamı: 1 + 2 + 4 + 7 + 14 + 28 = 56, ve 56, 28'in kendisine eşittir. Bu yüzden 28 bir Ore sayısıdır ve
aynı zamanda harmonik bölücüdür.Yazdığımız program zaten bu mantığa dayanarak çalışıyor. Verilen bir sayının harmonik bölücü veya
Ore sayısı olup olmadığını kontrol ediyor ve sonucunu ekrana yazdırıyor.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir pozitif tamsayı girin: ");
        sayi = scanner.nextInt();

        if (isOreSayisi(sayi)) {
            System.out.println(sayi + " bir Ore sayısıdır ve aynı zamanda Harmonik Bölücüdür.");
        } else {
            System.out.println(sayi + " bir Ore sayısı ve Harmonik Bölücü değildir.");
        }
    }

    // Bir sayının Ore sayısı olup olmadığını kontrol eden metod
    public static boolean isOreSayisi(int n) {
        int bolenToplami = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                bolenToplami += i;
            }
        }
        return bolenToplami == n;
    }
}