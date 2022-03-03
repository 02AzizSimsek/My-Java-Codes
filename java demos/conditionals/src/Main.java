public class Main {

    public static void main(String[] args) {
	   /*
	    int sayi=24;

        if(sayi<20)
        {
            System.out.println("number<20");
        }
        else if (20 == sayi)
        {
            System.out.println("number=20");
        }
        else
        {
            System.out.println("number>20");
        }
        */

        //RecapDemo
        // elimizde 3 sayi var arasindaki en buyuk olani bulmamiz gerek

        //my code
        /*
        int num1=30;
        int num2=5;
        int num3=22;

        if(num1>num2 & num1>num3)
        {
            System.out.println("num1 bigger than others ");
            if(num2>num3)
            {
               System.out.println("num3 lower than other");
            }
            else
            {
                System.out.println("num2 lower than others");
            }
        }
        else if(num2>num3 & num2>1)
        {
            System.out.println("num2 bigger than others");
            if(num3>num1)
            {
                System.out.println("num1 lower than other");
            }
            else
            {
                System.out.println("num3 lower than others");
            }
        }
        else
        {
            System.out.println("num3 bigger than others");
            if(num1>num2)
            {
                System.out.println("num2 lower than other");
            }
            else
            {
                System.out.println("num1 lower than others");
            }
        }

                         // teacher's code

        int num1=110;
        int num2=22;
        int num3=21;

        int bigNumber=num1;

        if(bigNumber<num2)
        {
            bigNumber=num2;

        }
        if(bigNumber<num3)
        {
            bigNumber=num3;

        }
        System.out.println(bigNumber+" bigger than other");

        */

        //SWITCH Bloklari,if'e gore daha az kullanilir
        //switch ile dallandirma yapiyoruz

        //ogrencinin basarili olup olmadigi tespiti gorevini yapalim

        char grade = 'D';

        switch (grade) {
            case 'A':
                System.out.println("gecti");
                break;
            case 'B':  //case b ve c yi bu sekilde yazinca bize ayni ciktiyi verir yani ortak yazma sekli bu sekildedir
            case 'C':
                System.out.println("sartli gecti");
                break;
            case 'D':
                System.out.println("sinirda");
                break;
            case 'E':
                System.out.println("aldin");
                break;
            default:
                System.out.println("gecersiz not girdiniz");
        }


    }
}
