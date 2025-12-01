package com.kodewala.myntra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.myntra.bean.ProductBean;
import com.kodewala.myntra.dao.ProductDao;
import com.kodewala.myntra.entities.Product;

@Service
public class ProductService {

	@Autowired
	ProductDao productDao;
	
	public void addProduct(ProductBean productBean) {
		System.out.println("inside service");
		Product product = new Product();
		product.setItmName(productBean.getItmName());
		product.setQty(productBean.getQty());
		product.setPrice(productBean.getPrice());
		product.setDescription(productBean.getDescription());
		
		productDao.saveProduct(product);
		
	}

	public List<Product> searchProductService(String searchString) {
		List<Product> products  = productDao.searchProduct(searchString);
		return products;
	}
}
