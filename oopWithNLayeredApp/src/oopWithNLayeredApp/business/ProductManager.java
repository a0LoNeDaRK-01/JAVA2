package oopWithNLayeredApp.business;

import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	
	public void add(Product product) throws Exception  {
		
		if(product.getUnitPrice()<50) {
			
			throw new Exception("ÜRÜN FİYATI 50'DEN KÜÇÜK OLAMAZ.");
			
		}
		
		JbdcProductDao productDao = new JbdcProductDao();
		
		productDao.add(product);
	}

}
