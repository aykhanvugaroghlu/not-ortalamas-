import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                int mat,fizik,kimya,tarih,muzik;

                Scanner inp = new Scanner(System.in);
                //
                System.out.println("Matematik Notunuz: ");
                mat = inp.nextInt();

                System.out.println("Fizik Notunuz: ");
                fizik = inp.nextInt();

                System.out.println("Kimya Notunuz: ");
                kimya = inp.nextInt();

                System.out.println("Tarih Notunuz: ");
                tarih = inp.nextInt();

                System.out.println("Mzik Notunuz: ");
                muzik = inp.nextInt();

                int toplam = (mat+fizik+kimya+tarih+muzik );
                double sonuc = toplam / 6;
                boolean a = toplam > 60;
                String str = a? "imtahandan kecdiniz" : "imtahandan kaldınız";

                System.out.println(str);



        }
}

