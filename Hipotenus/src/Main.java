import java.util.Scanner;
        public class Main {
        public static void main(String[] args) {

            int a,b ;
            double c ;

            Scanner giris = new Scanner(System.in);
            System.out.println("1. KENARI GİRİNİZ;");
            a = giris.nextInt();

            System.out.println("2. KENARI GİRİNİZ;");
            b = giris.nextInt();

            c = Math.sqrt((a*a+b*b));


            System.out.println("HİPOTENÜS;" + c);


    }
}