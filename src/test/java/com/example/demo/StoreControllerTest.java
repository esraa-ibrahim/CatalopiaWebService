package com.example.demo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class StoreControllerTest {
	StoreController storeController;
	
	@Test
	public void getStoresTest() {
		storeController = new StoreController();
		List<Store> listOfStores = new ArrayList<Store>();
		Store s1 = new Store("1", "Store 1", "Store 1 Desc");
    	Store s2 = new Store("2", "Store 2", "Store 2 Desc");
    	Store s3 = new Store("3", "Store 3", "Store 3 Desc");
    	Store s4 = new Store("4", "Store 4", "Store 4 Desc");
		listOfStores.add(s1);
		listOfStores.add(s2);
		listOfStores.add(s3);
		listOfStores.add(s4);
		
		List<Store> apiStores = storeController.getStores();
		assertArrayEquals(apiStores.toArray(), listOfStores.toArray());
	}
}
