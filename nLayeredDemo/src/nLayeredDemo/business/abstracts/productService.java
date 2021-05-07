package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface productService {
	void add(Product product);
	List<Product> getall();
	
}
