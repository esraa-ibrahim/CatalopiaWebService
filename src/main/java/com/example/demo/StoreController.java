package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {
	@RequestMapping("/getStores")
    public List<Store> getStores(){
    	Store s1 = new Store("1", "Store 1", "Store 1 Desc");
    	Store s2 = new Store("2", "Store 2", "Store 2 Desc");
    	Store s3 = new Store("3", "Store 3", "Store 3 Desc");
    	Store s4 = new Store("4", "Store 4", "Store 4 Desc");
    	
    	List<Store> storesList = new ArrayList<>();
    	storesList.add(s1);
    	storesList.add(s2);
    	storesList.add(s3);
    	storesList.add(s4);
    	
    	return storesList;
    }
}
