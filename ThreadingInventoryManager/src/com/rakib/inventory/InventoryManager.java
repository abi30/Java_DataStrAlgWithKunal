package com.rakib.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

	List<Product> soldProductsList = new CopyOnWriteArrayList<>();
	List<Product> purchesedProductsList = new ArrayList<>();

	public void populateSoldProducts() {
		for (int i = 0; i <= 1000; i++) {
			Product prod = new Product(i, " test_Products_ " + i);
			soldProductsList.add(prod);
			System.out.println("Added : " + prod);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

	public void DisplaySoldProducts() {
		for (Product product : soldProductsList) {
			System.out.println("Printed the soldProduct " + product);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
