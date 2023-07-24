package productcrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import productcrudapp.model.Product;

@Component
public class productDao {

	@Autowired
 private HibernateTemplate hibernateTemplate;
	
	//create Product
	@Transactional
	public void create(Product product) {
		
		this.hibernateTemplate.save(product);
	}
	
	//get all
	public List<Product> getAllProducts(){
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	//getById
	public Product getProduct(int id) {
		Product product = this.hibernateTemplate.get(Product.class,id);
		return product;
	}
	
	//delete product
	@Transactional
	public void deleteProduct(int id) {
		Product product = this.hibernateTemplate.get(Product.class, id);
		this.hibernateTemplate.delete(product);
	}
} 
