public class Main {
    public static void main(String[] args) {

        laptopSell product = new laptopSell();
        product.setName("nasılsın");
        product.setGetId(3);
        product.setSellingPrice(321);

        phoneSell product1 = new phoneSell();
        product1.setGetId(12);
        product1.setName("napıyon");
        product1.setSellingPrice(213);

        product[] urun = {product1,product};
        System.out.println(urun);



    }
}