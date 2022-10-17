public class Producter {


    public static void main(String[] args) {

        Product product = new Product(6652,"Enes","Zülal",999999999,1,"Siyah");




        productManager productManager = new productManager();

        productManager.Add(product);

        System.out.println(product.getKod());

    }
}
