public class Main {
    public static void main(String[] args) {
       //multi dimensional arrays

        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "ankara";
        sehirler[0][2] = "adana";
        sehirler[1][0] = "mersin";
        sehirler[1][1] = "konya";
        sehirler[1][2] = "diyarbakır";
        sehirler[2][0] = "çorum";
        sehirler[2][1] = "muğla";
        sehirler[2][2] = "antalya";

        for (int i = 0; i<3;i++){
            System.out.println("------------");
            for (int j = 0; j<3;j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}