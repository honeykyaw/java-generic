package com.vios.biz;

import java.util.ArrayList;
import java.util.List;

import com.vios.model.Product;

public class ProductServiceImpl {

	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();

	public ProductServiceImpl() {
		bookList.add("Time flies");
		bookList.add("Gone with the wind");
		bookList.add("Twilight");

		musicList.add("Heal the world");
		musicList.add("World of our own");
		musicList.add("Raise me up");

		movieList.add("John cater");
		movieList.add("King kong");
		movieList.add("Avatar");
	}

	public List<String> getProductCatagories() {
		List<String> catagories = new ArrayList<>();
		catagories.add("books");
		catagories.add("movies");
		catagories.add("music");
		return catagories;
	}

	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}

	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}

	public List<Product> getProducts2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Java se 8", "232", 1010.00));
		productList.add(new Product("Java ee 7", "3453", 210.00));
		productList.add(new Product("Java ee 6", "232", 90.00));
		return productList;
	}
}
