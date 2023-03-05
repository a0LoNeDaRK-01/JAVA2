package javakamp2022;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello world!");
		
	}

};

String ortaMetin = "ilginizi Cekebilir.";
    String altMetin = "Vade Suresi:";

    System.out.println(ortaMetin);

    System.out.println(altMetin);

    double dolarDun = 18.31;
    double dolarBugun = 18.45;

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

    for(i = 0; i <  krediler.length; i=i+1) {

        System.out.prinln(krediler[i]);
            };