package com.visa.training.jpa.app;

import java.util.List;

import com.visa.training.jpa.dal.JpaProductDAO;
import com.visa.training.jpa.domain.Product;

public class ProductJpaApp {

    public static void main(String[] args) {
		
		JpaProductDAO dao = new JpaProductDAO(); /*
													 * Product test = new Product("ll", 999, 10); Product saved =
													 * dao.save(test); System.out.println(saved); Product updateProduct
													 * = dao.findById(3); updateProduct.setPrice(70);
													 * dao.update(updateProduct); dao.remove(5);
													 */
		 
    	
    	List<Product> all = dao.findAll();
    	all.forEach(System.out::println);
        System.exit(0);
        
    }

}