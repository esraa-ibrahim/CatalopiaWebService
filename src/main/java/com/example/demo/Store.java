package com.example.demo;

public class Store {
	private String id;
	private String name;
	private String description;
	
	public Store(String id, String name, String desciption) {
        this.id = id;
        this.name = name;
        this.description = desciption;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String getDescription() {
    	return description;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if (obj != null && obj instanceof Store) {
    		return this.id.equals(((Store)obj).id);
    	}
    	return false;
    }
}
