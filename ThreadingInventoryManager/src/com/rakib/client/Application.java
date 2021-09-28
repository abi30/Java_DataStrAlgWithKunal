package com.rakib.client;

import com.rakib.inventory.InventoryManager;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		InventoryManager manager= new InventoryManager();
		
		Thread InventoryTask=new Thread (new Runnable() {

		
			public void run() {
				manager.populateSoldProducts();
				
			}

			
			
		});
		Thread DisplayTask=new Thread (new Runnable() {

			
			public void run() {
				manager.DisplaySoldProducts();
				
			}

			
			
		});
		
		InventoryTask.start();
		Thread.sleep(2000);
		DisplayTask.start();

	}

}
