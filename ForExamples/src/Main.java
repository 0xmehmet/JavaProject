public class Main {
    public static void main(String[] args) {
       int number = 3;
       int remainder = number % 2; // mod2 gibi düşünülebilir
        //System.out.println(remainder);
        boolean isPrime = true;

        if (number==1)
            System.out.println("geçresiz");
            return;

        for(int i=2;i<number;i++){
            if (number % i == 0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("sayı asaldır");

        }else {
            System.out.println("Sayı asal değildir");
        }

    }
}