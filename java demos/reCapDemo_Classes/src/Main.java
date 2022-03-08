public class Main {

    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.topla(3, 4);
        System.out.println("1:" + sonuc);
        int sonuc2 = dortIslem.cikar(3, 4);
        System.out.println("2:" + sonuc2);
        int sonuc3 = dortIslem.carp(3, 4);
        System.out.println("3:" + sonuc3);
        int sonuc4 = dortIslem.bol(3, 4);
        System.out.println("4:" + sonuc4);

    }
}
