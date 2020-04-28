package br.com.cauezito.store.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cauezito.daos.ProductDAO;
import br.com.cauezito.store.models.Product;

@Transactional
@Controller
public class ProductsController {
	//injection
	@Autowired
	ProductDAO productDAO = new ProductDAO();
	
	@RequestMapping("/products")
	public String save(Product product) {
		productDAO.save(product);
		System.out.println("Save");
		return "products/ok";
	}
	
	@RequestMapping("/products/form")
	public String form() {
		System.out.println("Products");
		return "form";
	}

}
