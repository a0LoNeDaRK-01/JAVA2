public class Methods {

public static void main(String[] args) {


    sayiBulmaca();
    sayiBulmaca();
    sayiBulmaca();
    sayiBulmaca();

}

  public static void sayiBulmaca() {


     int[] sayilar = new int[]{0,1,2,3,4,5,6,7,8,9};

    int aranacak = 5;

    boolean varMi = false;

        for(int sayi : sayilar) {

        if(sayi==aranacak) {
            varMi = true;

            break;
        }
    }
    if(varMi) {

        System.out.println("SAYI MEVCUTTUR: "+aranacak);
    }
else {

        System.out.println("SAYI MEVCUT DEĞİLDİR: "+aranacak);
    }
  }
    }