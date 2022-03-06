public class Main {

    public static void main(String[] args) {
        //Project 1:  sayi asal mi degil mi onun kontrolunu yapicaz

        int num = 1;
        if (num <= 1) {
            System.out.println(num + " number isn't prime number");
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + " number isn't prime number ");
            } else {
                System.out.println(num + " number is prime number");
            }
            break;
        }

        //Project 2: sesli harf var mi yok mu

        char harf = 'A';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            case 'E':
                System.out.println("kalin sesli harf");
                break;
            default:
                System.out.println("ince sesli harf");

        }

        //project 3:mukemmel sayi

        //6->1,2,3
        //28-->1,2,4,7,14
        int numbers = 3;
        int totals = 0;
        for (int j = 1; j < numbers; j++) {
            if (numbers % j == 0) {
                totals = totals + j;
            }
        }
        if (totals == numbers) {
            System.out.println("sayi mukemmel sayidir");
        } else {
            System.out.println("sayi mukemmel sayi degildir");
        }

        //project 4:arkadas sayilar

        //220 -284

        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;
        for (int a = 1; a < sayi1; a++) {
            if (sayi1 % a == 0) {
                toplam1 = toplam1 + a;
            }
        }
        for (int b = 1; b < sayi1; b++) {
            if (sayi2 % b == 0) {
                toplam2 = toplam2 + b;
            }
        }
        if (sayi1 == toplam2 || sayi2 == toplam2) {
            System.out.println("bu iki sayi arkadastir");

        } else {
            System.out.println("bu iki sayi arkadas degil");
        }


        //project 5: sayi bulma islemi yapicaz

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 11;
        boolean varMI = false;
        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMI = true;
                break;
            }
        }
        if (varMI) {
            System.out.println("sayi mevcuttur");
        } else {
            System.out.println("sayi mevcut degil ");
        }


    }
}
