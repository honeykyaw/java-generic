package com.vios;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.vios.model.Product;

@WebService(name = "TestMartCatalog", targetNamespace = "http://vios.ws.com")
public interface ProductCatalogInterface {

	// this annotation is optional
	// when a class is annotated as webservice all public methods are assumed to
	// be webmethod
	@WebMethod(action = "fetch_categories", operationName = "fetchCategories")
	public abstract List<String> getProductCatagories();

	// (exclude = true) This will avoid publishing this method
	@WebMethod
	public abstract List<String> getProduct(String category);

	@WebMethod
	public abstract boolean addProduct(String category, String product);

	@WebMethod
	@WebResult(name = "Product")
	public abstract List<Product> getProduct2(String category);

}