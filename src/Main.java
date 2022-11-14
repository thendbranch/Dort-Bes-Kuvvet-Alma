import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Ödev
            Java döngüler ile girilen sayıya kadar olan
            4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */


        // Kullanıcıdan değer alalım
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Değer Giriniz : ");
        int sayi = input.nextInt();

        for (int i = 1; i < sayi; i*=4) {
            if (i <= sayi && i >= 4){
                System.out.println("4'ün kuvveti : " + i);
            }
        }
        for (int j = 1; j < sayi; j*=5) {
            if (j <= sayi && j >= 5){
                System.out.println("5'in kuvveti : " + j);
            }
        }



    }
}