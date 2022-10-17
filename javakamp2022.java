public class javakamp2022 {

    public static void main(String[] args) {
        System.out.println("Hello world!");


        String ortaMetin = "ilginizi Cekebilir.";
        String altMetin = "Vade Suresi:";

        System.out.println(ortaMetin);

        System.out.println(altMetin);

        double dolarDun = 18.20;
        double dolarBugun = 18.20;

        boolean dolarDustuMu = false;

        String okYonu = "";

        if (dolarBugun<dolarDun) {

            okYonu = "down.svg";

            System.out.println(okYonu);
        }
        else if (dolarBugun>dolarDun) {

            okYonu = "up.svg";

            System.out.println(okYonu);
        }

        else {

            okYonu = "equal.svg";

            System.out.println(okYonu);
        }

        String [] krediler = {"Faizsiz Kredi,Faizli,Kredi,Vadeli Emekli Hesabı"}; // [] görürsen anlamı veri listesi demektir unutma ;)

        int i;
        for(i = 0; i <  krediler.length; i=i+1) {

            System.out.println(krediler[i]);
        }

    }
}