package com.example.george.materialdesign.vo;

import java.util.ArrayList;
import java.util.List;

public class CharacterStories {
	
	public CharacterStories()
	{
		this.itens = new ArrayList<ItensURI>();
	}
	
	private int available;
	private int returned;
	private int collectionURI;
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
	
	public int getCollectionURI() {
		return collectionURI;
	}
	public void setCollectionURI(int collectionURI) {
		this.collectionURI = collectionURI;
	}
	
	public List<ItensURI> getItens() {
		return itens;
	}
	public void setItens(List<ItensURI> itens) {
		this.itens = itens;
	}
	
	
	

}
