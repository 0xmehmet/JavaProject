public class Main {
    public static void main(String[] args) {
        char grade = 'Z';

        switch (grade) {
            case 'A':

                System.out.println("ÇOK İYİ");
                break;

            case 'B':

                System.out.println("İYİ");
                break;
            case 'C':

                System.out.println("ORTA");   //istersek bu kısımı kaldırıp c ve d kısmını tek okutabiliriz.
                break; 
            case 'D':

                System.out.println("KÖTÜ");
                break;
            case 'F':

                System.out.println("KALDI");
                break;
            default: //yukarıdaki sayılardan başka tuşlama yapılırsa diye bir nevi else gibi
                System.out.println("geçersiz harf kullanımı");


                // kullandığım ide + format code
                //ctr+shift+alt+l  intellij için geçerlidir.

        }

    }
}
