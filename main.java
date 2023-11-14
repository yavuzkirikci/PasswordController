import java.util.Scanner;

// Uygulamayı yazarken araştırma yaptığımda regex yapısını kullanmam önerildi. Regex yapısını kullandım. Kullanıcının girdiği parolayı kontrol edebiliyorum programda yazmayı başardım.
// Otomatik güçlü parola oluşturmaya zamanım yetmedi.


public class main {
    

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean gucluParola = false;
        String parola;
        String kriter;

        while(!gucluParola) {
            System.out.println("Kullanıcın girdiği parola: ");
            parola = scanner.nextLine();
            kriter = "";

            if(!uzunluk(parola)) {
                kriter += "Parola 8 karakter uzunluğunda olmalıdır. \n ";
            }
            if(!sayi(parola)) {
                kriter += "Parolaya Rakam girmelisiniz. \n ";
            }
            if(!buyukHarf(parola)) {
                kriter += "Parolaya Büyük Harf girmelisiniz. \n ";
            }
            if(!kucukHarf(parola)) {
                kriter += "Parolaya Küçük Harf girmelisiniz. \n ";
            }
            if(!ozelKarakter(parola)) {
                kriter += "Parolaya Özel Karakter girmelisiniz(!,@,#,$,%,^,&,*,(,),-,+). \n ";
            }
            
            if(parolaGucluMu(parola)) {
                gucluParola = true;
                System.out.println("Parola güçlü.");
            }
            else{
                System.out.println("Parola kriterleri karşılamıyor. Aşağıdaki kriterlere uygun yeni parola giriniz: \n" + kriter);
            }



      
        }
        

    }
        public static boolean parolaGucluMu(String parola) {
        return uzunluk(parola) &&
        sayi(parola) &&
        buyukHarf(parola) &&
        kucukHarf(parola) &&
        ozelKarakter(parola);
    }

    public static boolean uzunluk(String parola) {
        return parola.length() >=0;
    }

    public static boolean sayi(String parola) {
        return parola.matches(".*[0-9].");
    }

    public static boolean buyukHarf(String parola) {
        return parola.matches(".*[A-Z].*");
    }

    public static boolean kucukHarf(String parola) {
        return parola.matches(".*[a-z].*");
    }
    public static boolean ozelKarakter(String parola) {
        return parola.matches(".*[!@#$%^&*()-+].*");
    }

    



}
