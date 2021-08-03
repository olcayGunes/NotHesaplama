import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float matematikNot, fizikNot, kimyaNot, turkceNot, tarihNot, muzikNot, ortalamaNot;
        String gecmeDurumu;

        System.out.print("Matematik Notunuzu Giriniz: ");
        matematikNot = input.nextFloat();
        System.out.println("Matematik Notunuz Alınmıştır. ("+matematikNot+")");

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizikNot = input.nextFloat();
        System.out.println("Fizik Notunuz Alınmıştır. ("+fizikNot+")");

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimyaNot = input.nextFloat();
        System.out.println("Kimya Notunuz Alınmıştır. ("+kimyaNot+")");

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkceNot = input.nextFloat();
        System.out.println("Türkçe Notunuz Alınmıştır. ("+turkceNot+")");

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarihNot = input.nextFloat();
        System.out.println("Tarih Notunuz Alınmıştır. ("+tarihNot+")");

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzikNot = input.nextFloat();
        System.out.println("Müzik Notunuz Alınmıştır. ("+muzikNot+")");

        ortalamaNot=(matematikNot+fizikNot+kimyaNot+turkceNot+tarihNot+muzikNot)/6;
        gecmeDurumu = ortalamaNot>60 ? "Tebrikler! Sınıfı Geçtiniz. Ortalamanız: "+ortalamaNot : "Maalesef Sınıfı Geçemediniz. Ortalamanız: "+ortalamaNot;
        System.out.println(gecmeDurumu);


    }
}
