package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasın
      hesaplayan programı yazınız.*/
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number= scan.nextInt();
        System.out.println("3 ve 4'e bölünen sayılar: ");
        int total=0,avarege=0,j=0;


        for(int i=0; i<=number; i++){
            if(i%12==0){
                System.out.println(i);
                total=total+i;
                j++;
                avarege=total/j;
                }
            }
        System.out.println("Sayıların toplamı: "+total);
        System.out.println("Sayıların ortalaması: "+avarege);
        }
    }

