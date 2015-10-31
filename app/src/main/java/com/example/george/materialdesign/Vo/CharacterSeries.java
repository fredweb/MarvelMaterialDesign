package com.example.george.materialdesign.Vo;

import java.util.ArrayList;
import java.util.List;

public class CharacterSeries {
	
	public CharacterSeries()
	{
		this.itens = new ArrayList<ItensURI>();
	}
	
	private int available;
	private int returned;
	private String collectionURI;
	private List<ItensURI> itens;
	
	
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

	public List<ItensURI> getItens() {
		return itens;
	}

	public void setItens(List<ItensURI> items) {
		this.itens = items;
	}
	
	
}
