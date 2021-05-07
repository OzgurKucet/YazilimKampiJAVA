package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.productService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.HybernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements productService{

	private ProductDao productDao;
	private LoggerService loggerService;
	
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {		
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor.");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi " + product.getName());
	}

	@Override
	public List<Product> getall() {
		// TODO Auto-generated method stub
		return null;
	}

}
