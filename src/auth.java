import java.util.Scanner;

public class auth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username,password,newpassword;
        int select;
        System.out.println("Kullanıcı Adı :");
        username= input.nextLine();
        System.out.println("Şifre :");
        password= input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı..");
        }else {
            System.out.println("Giriş Başarısız Sifrenizi sıfırlamak ister misiniz? \n 1-Evet \n 2-Hayır");
            select= input.nextInt();
            if (select ==1) {
                System.out.print("Yeni Şifreyi giriniz : ");
                newpassword = input.nextLine();
                if (newpassword == password) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                    System.out.println("Sifre Olusturuldu");
                }
            } else if (select==2) {
                System.out.println("Tekrar deneyiniz..");
            }else {
                System.out.println(" Tanımsız Giriş yaptınız..");
            }
        }
    }
}
