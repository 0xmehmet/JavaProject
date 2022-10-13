public class Main {
    public static void main(String[] args) {
        //for example
        String[] arkadaslar = new String[8];

        arkadaslar[0] = "a";
        arkadaslar[1] = "s";
        arkadaslar[2] = "d";
        arkadaslar[3] = "f";
        arkadaslar[4] = "g";
        arkadaslar[5] = "h";
        arkadaslar[6] = "j";
        arkadaslar[7] = "k";

        for (String arkadas : arkadaslar) {
            System.out.println(arkadas);
        }
        System.out.println("......................................");
        for (int i = 0; i < arkadaslar.length; i++) {
            System.out.println(arkadaslar[i]);
        }
        System.out.println("................RECAP DEMO......................");
        //Recap demo
        double[] myList = {1.2, 7.3, 3.4, 5.9};
        double toplam = 0;
        double enBuyuk = myList[0];

        for (double number : myList) {

            if (enBuyuk < number) {
                enBuyuk = number;
            }

            toplam = toplam + number;
            System.out.println(number);

        }
        System.out.println("sonuç" + toplam);
        System.out.println("en büyük: " + enBuyuk);

    }
}