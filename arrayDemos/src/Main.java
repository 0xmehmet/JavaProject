public class Main {
    public static void main(String[] args) {
        String ogrenci1="mehmet";
        String ogrenci2="deren";
        String ogrenci3="selen";
        String ogrenci4="ceren";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----ilk kod sonu----------");
        //[] array demek oluyor bu
        String[] ogrenciler = new String[4];
        ogrenciler[0]="mehmet";
        ogrenciler[1]="deren";
        ogrenciler[2]="selen";
        ogrenciler[3]="ceren";

        for (int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);

        //alttaki ve yukarıdaki for döngüsü aynı şeydir

        }

        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}