public class Main {

    public static void main(String[] args) {
        String mesaj = "bugun hava cok guzel";
        String yeniMesaj = mesaj.substring(0, 2);
        System.out.println(yeniMesaj);
     int sayi=topla(5,7);
     System.out.println(sayi);

     int sayilar=topla2(2,3,4,5,6);
     System.out.println(sayilar);
    }

    public static void ekle() {
        System.out.println("eklendi");
    }

    public static void sil() {
        System.out.println(("silindi"));
    }

    public static void guncelle() {
        System.out.println("guncellendi");

    }
    //void operasyonu emir tipi gibidir
    //retun =>bitir demek
    //return 5=>5 donder demektir

    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
//birden fazla int gonderme yapicaksak int... seklinde yazmamiz lazim
public static int topla2(int... sayilar){
         int toplam=0;
         for(int sayi:sayilar){
             toplam +=sayi;
         }
         return toplam;
}

}
