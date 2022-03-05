public class Main {

    public static void main(String[] args) {

        String[] student = new String[4];//4 buradaki eleman sayisini verir
        student[0] = "aziz";
        student[1] = "ali";
        student[2] = "kudret";
        student[3] = "mehmet";
        for (int i = 0; i < student.length; i++)//length student eleman sayisinin miktaridir
        {
            System.out.println(student[i]);
        }

        System.out.println("====================");

        // diger bir yazim seklidir

        for (String studentsss : student)//ifadesi=>student icindeki her bir elemani gez demek ve onlara takma isim olarak studentsss ver
        {
            System.out.println(studentsss);
        }

        System.out.println("--------------------------------");


        //recap demo yapalim yukaridaki ogrendiklerimizi kullanarak
        // bu sayilari tek tek ekrana yazdiricaz

        double[] myList = {1.2, 2.7, 4.3, 5.6};
        for (double number : myList) {
            System.out.println(number);
        }

        System.out.println("--------------------------------");
        // yukaridaki listedeki sayilarin toplamini versin bu sefer
        double total = 0;
        for (double number : myList) {
            total += number;
        }
        System.out.println("total:" + total);
        System.out.println("--------------------------------");
        // yukaridaki listedeki sayilarin icinden en buyuk olani versin bize
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
        }
        System.out.println("max number:" + max);

        System.out.println("--------------------------------");
        // Cok Boyutlu Diziler
        String[][] cities = new String[3][3];
        cities[0][0] = "";
        cities[0][0] = "istanbul";
        cities[0][1] = "bursa";
        cities[0][2] = "eskisehir";
        cities[1][0] = "ankara";
        cities[1][1] = "konya";
        cities[1][2] = "kayseri";
        cities[2][0] = "diyarbakir";
        cities[2][1] = "adiyaman";
        cities[2][2] = "elbistan";

        for (int i = 0; i <= 2; i++) {
            System.out.println("***************");
            for (int j = 0; j <= 2; j++) {
                System.out.println(cities[i][j]);
            }
        }


    }
}
