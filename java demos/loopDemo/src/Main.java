public class Main {

    public static void main(String[] args) {
	//for donguleri saglar ayni seyi tekrar yazmaktan kurtarir
        /*
        //1 den 10 a kadar olan sayilari yazdirma
        for(int i=1;i<10;i++)
        {
            System.out.println(i);//1 den 9 a kadar yazma islemi yapacaktir
        }
        System.out.println("loop is finis");

        // 1 den baslayip tek sayilar yazdirmak istersek
        for(int i=1;i<10;i +=2){
            System.out.println(i);
        }
        System.out.println("loop is finis");
        // 0 dan baslayip cift sayilari yazdirmak istersek

        for(int i=0;i<10;i +=2)
        {
            System.out.println(i);
        }

        */

        //while=>belli bir sart saglanana kadar islem devam eder,while ile for un hepsini yazabilirken for ile yazilan hepsini while ile yazabiliriz
        int i=1;
        while(i<10)
        {
            i++;
            System.out.println(i);
        }
        System.out.println("while dongusu bitti");

        // Do-while Dongu tipi
        //cok fazla kullanilmiyor
        //whildan farki sart saglanmazsa bile donguye girmeye devam ediyor

        int j=1;
        do
        {
                System.out.println(j);
                 j++;
        }while(j<10);
        System.out.println("do-while dongusu bitti");

    }
}
