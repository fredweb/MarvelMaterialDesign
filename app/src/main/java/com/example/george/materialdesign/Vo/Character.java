package com.example.george.materialdesign.Vo;

import java.util.ArrayList;
import java.util.List;

public class Character {
	
	public Character()
	{
		this.comics = new ArrayList<CharacterComics>();
		this.stories = new ArrayList<CharacterStories>();
		this.series = new ArrayList<CharacterSeries>();
		this.events = new ArrayList<CharacterEvents>();
	}

	private int id;
	private String name;
	private String description;
	private String modified;
	private String resourceURI;
	private List<Url> urls;
	private List<Thumbnail> tumbnail;
	private List<CharacterComics> comics;
	private List<CharacterStories> stories;
	private List<CharacterSeries> series;
	private List<CharacterEvents> events;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public String getResourceURI() {
		return resourceURI;
	}
	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}
	public List<Url> getUrls() {
		return urls;
	}
	public void setUrls(List<Url> urls) {
		this.urls = urls;
	}
	public List<Thumbnail> getTumbnail() {
		return tumbnail;
	}
	public void setTumbnail(List<Thumbnail> tumbnail) {
		this.tumbnail = tumbnail;
	}
	public List<CharacterComics> getComics() {
		return comics;
	}
	public void setComics(List<CharacterComics> comics) {
		this.comics = comics;
	}
	public List<CharacterStories> getStories() {
		return stories;
	}
	public void setStories(List<CharacterStories> stories) {
		this.stories = stories;
	}
	public List<CharacterSeries> getSeries() {
		return series;
	}
	public void setSeries(List<CharacterSeries> series) {
		this.series = series;
	}
	public List<CharacterEvents> getEvents() {
		return events;
	}
	public void setEvents(List<CharacterEvents> events) {
		this.events = events;
	}
	
	
}
