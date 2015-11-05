package com.example.george.materialdesign.model;

import java.util.ArrayList;
import java.util.List;

public class CharacterComics {
	
	public CharacterComics()
	{
		this.items = new ArrayList<ItensURI>();
	}
	
	private int available;
	private int returned;
	private String collectionURI;
	private List<ItensURI> items;
	
	
	public int getAvailable() {
		return available;
	}
	
	public void setAvailable(int available) {
		this.available = available;
	}

	public int getReturned() {
		return returned;
	}

	public void setReturned(int returned) {
		this.returned = returned;
	}

	public String getCollectionURI() {
		return collectionURI;
	}

	public void setCollectionURI(String collectionURI) {
		this.collectionURI = collectionURI;
	}

	public List<ItensURI> getItems() {
		return items;
	}

	public void setItems(List<ItensURI> items) {
		this.items = items;
	}
	
	
}
