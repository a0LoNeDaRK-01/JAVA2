public class arrays {

    public static void main(String[] args) {

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "ENES";
        ogrenciler[1] = "EMİR";
        ogrenciler[2] = "METE";
        ogrenciler[3] = "İSMAİL";

        int i;

        for(i = 0;i <ogrenciler.length;i++) {

            System.out.println(ogrenciler[i]);

            }
 System.out.println("    " +
         "    ");
            for(String ogrenci:ogrenciler) {

                System.out.println(ogrenci);

            }
        }
    }
