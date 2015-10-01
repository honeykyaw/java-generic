package com.vios;

import java.util.List;

import javax.jws.WebService;

import com.vios.biz.ProductServiceImpl;
import com.vios.model.Product;

@WebService(endpointInterface = "com.vios.ProductCatalogInterface", portName = "TestMartCatelogPort", serviceName = "TestMartCatelogService")
public class ProductCatalog implements ProductCatalogInterface {

	ProductServiceImpl productServiceImpl = new ProductServiceImpl();

	@Override
	public List<String> getProductCatagories() {
		return productServiceImpl.getProductCatagories();
	}

	@Override
	public List<String> getProduct(String category) {
		return productServiceImpl.getProducts(category);
	}

	@Override
	public boolean addProduct(String category, String product) {
		return productServiceImpl.addProduct(category, product);
	}

	@Override
	public List<Product> getProduct2(String category) {
		return productServiceImpl.getProducts2(category);
	}

}
