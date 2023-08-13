import java.util.Scanner;

public class sinifgecme{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double mat, fiz, türk, kim, mzk;

        System.out.print("Lütfen matematik notunuzu giriniz: ");
        mat=input.nextDouble();
        System.out.print("Lütfen türkçe notunuzu giriniz: ");
        türk=input.nextDouble();
        System.out.print("Lütfen fizik notunuzu giriniz: ");
        fiz=input.nextDouble();
        System.out.print("Lütfen kimya notunuzu giriniz: ");
        kim=input.nextDouble();
        System.out.print("Lütfen müzik notunuzu giriniz: ");
        mzk=input.nextDouble();

        double avr= (mat+fiz+türk+kim+mzk)/5;

        if(avr>=55){
            System.out.println("Geçtiniz !");
        }else{
            System.out.println("Başarılı olamadınız, seneye tekrar aynı sınıf düzeyinde eğitim alacaksınız ");
        }
        
    }
}