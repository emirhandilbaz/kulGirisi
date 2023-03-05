/*
Java koşullu ifadelerle kullanıcı adı ve şifreyi kontrol eden program yapımı.

ÖDEV
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, 
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , 
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

String sınıfları için eşitlik = .equals("") <----|

*/

package Java.ikinciKonu.egzersizler;

import java.util.Scanner;

public class kulGiris {
    public static void main(String[] args){
        String kulAdi, sifre, ySifre;
        int secim;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        kulAdi = scan.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        sifre = scan.nextLine();

        if (kulAdi.equals("emirhan") && sifre.equals("deneme123") ){

            System.out.print("Giriş başarılı.");

        }

        else if (kulAdi.equals("emirhan") && !sifre.equals("deneme123")){
            System.out.print("Şifre hatalı..\nŞifreyi değiştirme işlemi için 1, programdan çıkmak için 0'a basın: ");
            
            secim = scan.nextInt();

            switch(secim){
                case 0:
                    System.out.print("Programdan çıkılıyor.");
                    break;

                case 1:
                    System.out.print("Yeni şifrenizi giriniz: ");
                    ySifre = scan.nextLine();

                    if(ySifre.equals(sifre) || ySifre.equals("deneme123")){

                        System.out.println("Şifreniz oluşturulamadı lütfen tekrar deneyiniz..");
                    
                    }

                    else {

                        System.out.println("Şifrenizi başarıyla değiştirdiniz.");
                        break;
                    }

            }

        }    

        else {

            System.out.println("Kulllanıcı adı ve şifre hatalı..");

        }            
        
    }

}    