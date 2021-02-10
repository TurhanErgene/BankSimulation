package banka1;

import java.util.Locale;
import java.util.Scanner;

public class Banka1
{
   
 public static void main(String[] args)
    {
  String kart_no1= "1";
    String kart_sifre1 ="1234";
    String kul_adı1 = "Turhan Ergene" ;
    int kul_nakit1 = 1000 ;
    String kart_no2 = "2" ;
  String kart_sifre2 ="4321" ;
  String kul_adı2 = "Enes Ertem" ;
  int kul_nakit2 = 900 ;
  int para ;
     int cıkıs;
     int deneme = 0;
  Scanner scan = new Scanner(System.in);
  scan.useLocale(Locale.US);

  System.out.println("atm v1.00"); 
  System.out.println("-------------------------------");
  
  while(deneme < 3)
  
  {
  System.out.print("kart numarasını giriniz : ");
  String gir_kart_no = scan.nextLine();
  System.out.print("şifreyi giriniz : ");
  String gir_kart_sifre = scan.nextLine();
  
  if(  (kart_no1.equals(gir_kart_no)) &&  (kart_sifre1.equals(gir_kart_sifre))   )
  {
    System.out.println("-------------------------------");
    System.out.println("-------------------------------");
    System.out.println("başarılı giriş ...");
    System.out.println("merhaba " + kul_adı1  );
    System.out.println("-------------------------------");
    System.out.println("1-bakiye sorgulama");
    System.out.println("2-para çekme");
    System.out.println("3-para yatırma");
    System.out.println("4-çıkış yapma");
       int islem=scan.nextInt();
        switch (islem)
            {
            case 1:
             System.out.println("-------------------------------");
             System.out.println("bakiyeniz = " +kul_nakit1);
             System.out.print("çıkış için 1 e basın");
             cıkıs=scan.nextInt();
             System.out.println("çıkış yapılıyor...");
             
             break;
            case 2:
             System.out.println("-------------------------------");
             System.out.print("çekmek istediğiniz tutarı giriniz : ");
             para =scan.nextInt();
             if (kul_nakit1 >= para)
             {
             kul_nakit1 -= para;
             System.out.println("kalan bakiyeniz " + kul_nakit1);
             System.out.print("çıkış için 1 e basın");
             cıkıs=scan.nextInt();
              System.out.println("çıkış yapılıyor...");
                }
                else
             {
             System.out.println("başarısız işlem ..."); 
             System.out.println("çıkış yapılıyor...");
             
             }
             break;
            case 3:
             System.out.println("-------------------------------");
             System.out.print("yatırmak istediğiniz tutarı giriniz : ");
             para =scan.nextInt();
             kul_nakit1 += para;
             System.out.println("son bakiyeniz " + kul_nakit1);
             System.out.print("çıkış için 1 e basın");
             cıkıs=scan.nextInt();
             System.out.println("çıkış yapılıyor...");
                break;
            case 4:
             System.out.println("-------------------------------");
             System.out.println("çıkış yapılıyor...");
             break;
            default:
             System.out.println("-------------------------------");
             System.out.println("işlem anlaşılmadı");
                System.out.println("çıkış yapılıyor...");
                break; 
            
            }
  } 
  else if(  (kart_no2.equals(gir_kart_no)) &&  (kart_sifre2.equals(gir_kart_sifre))   )
  {
       
    System.out.println("başarılı giriş ...");
    System.out.println("merhaba " + kul_adı2  );
                System.out.println("-----------------------------");
    System.out.println("1-bakiye sorgulama");
       System.out.println("2-para çekme");
       System.out.println("3-para yatırma");
       System.out.println("4-çıkış yapma");
       int islem=scan.nextInt();
       switch (islem)
           {
           case 1:
            System.out.println("-------------------------------");
            System.out.println("bakiyeniz = " +kul_nakit2);
            System.out.print("çıkış için 1 e basın");
            cıkıs=scan.nextInt();
            System.out.println("çıkış yapılıyor...");
            break;
           case 2:
            System.out.println("-------------------------------");
            System.out.print("çekmek istediğiniz tutarı giriniz : ");
            para =scan.nextInt();
            if (kul_nakit2 >= para)
            {
            kul_nakit2 -= para;
            System.out.println("kalan bakiyeniz " + kul_nakit2);
            System.out.print("çıkış için 1 e basın");
            cıkıs=scan.nextInt();
            System.out.println("çıkış yapılıyor...");
               }
               else
            {
            System.out.println("başarısız işlem ..."); 
            System.out.println("çıkış yapılıyor...");
            System.out.println("-------------------------------");
            }
            break;
           case 3:
            System.out.println("-------------------------------");
            System.out.print("yatırmak istediğiniz tutarı giriniz : ");
            para =scan.nextInt();
            kul_nakit2 += para;
            System.out.println("son bakiyeniz " + kul_nakit2);
            System.out.print("çıkış için 1 e basın");
            cıkıs=scan.nextInt();
               System.out.println("çıkış yapılıyor...");
               break;
           case 4:
            System.out.println("-------------------------------");
            System.out.println("çıkış yapılıyor...");
            break;
           default:
            System.out.println("-------------------------------");
            System.out.println("işlem anlaşılmadı");
               System.out.println("çıkış yapılıyor...");
               break; 
           
           }
  } 
        else 
  { 
   System.out.println("başarısız tekrar deneyin");   
  }
  System.out.println("----------------------------------------------");
  System.out.println("çıkış yapıldı...");
  deneme ++;
  
  }
  if (deneme>2)
  {
   
   System.out.println("3 den fazla yanlış girdiniz sistem kilitlendi");
  }
    
  }
    
    

}