package nLayeredDemo;

import nLayeredDemo.business.abstracts.productService;
import nLayeredDemo.business.concretes.AbcProductDao;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
			
		//ToDo : Spring IoC ile çözülecek...
		productService productService = new ProductManager(new AbcProductDao(),new jLoggerManagerAdapter());
	
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
	
	}

}
