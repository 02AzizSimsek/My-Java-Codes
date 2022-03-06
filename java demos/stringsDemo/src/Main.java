import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String mesaj = "Today weather is beaituful";
        //metinin icindeki belli bir indexe ulasmak istersek

        System.out.println(mesaj);

       

        System.out.println("Mesajdaki eleman sayisi:" + mesaj.length());
        System.out.println("5. eleman:" + mesaj.charAt(4));
        System.out.println("iki mesaj birlestirme:" + mesaj.concat((".i am happy")));
        // alttaki ikisi de bosluklara karsi duyarli unutma
        System.out.println("Kelime icinde istedigimiz harfi girip bu harfle " +
                "basliyor mu sorusunu sorar," + "cevap true-false:" + mesaj.startsWith("b"));
        System.out.println("Kelime icinde istedigimiz harfi girip bu harfle " +
                "bitiyor mu sorusunu sorar," + "cevap true-false:" + mesaj.endsWith("l"));

        char[] characters=new char[5];
        mesaj.getChars( 2 , 7,characters, 0);//void denilen bir operasyondur yani birse dondermez
        System.out.println(characters);

        System.out.println(mesaj.indexOf("e"));//kelime veya harf aratmasi yapariz bununla,aramaya en soldan baslar

        System.out.println(mesaj.lastIndexOf("e"));////kelime veya harf aratmasi yapariz bununla,aramaya en sagdan baslar


        String yeniMesaj=mesaj.replace(oldChar:'',newChar:'-');
        System.out.println(yeniMesaj);//karakter degistirmek istersek kullaniriz

        System.out.println();

        System.out.println(mesaj.substring(2));//mesajin girdigmiz yerden sonrasini yazdiriyor
        System.out.println(mesaj.substring(2, 10));//mesajin girdigmiz yerlerin arasini yazdiriyor

        for (String kelime : mesaj.split(regex:" ")){
            System.out.println(kelime); //metini kelime kelime yazmayi veren fonksiyondur
        }



        System.out.println(mesaj.toLowerCase());//tum kelimeleri kucuk harfe cevririr
        System.out.println(mesaj.toUpperCase());//tum kelimeleri buyuk harfe ceviri





    }
}
