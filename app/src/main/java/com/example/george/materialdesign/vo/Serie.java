package com.example.george.materialdesign.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Serie {
	
	public Serie()
	{
		this.stories = new ArrayList<ResourceList>();
		this.characters = new ArrayList<ResourceList>();
		this.events = new ArrayList<ResourceList>();
		this.comics = new ArrayList<ResourceList>();
		this.urls = new ArrayList<Url>();
		this.next = new ArrayList<ItensURI>();
		this.previous = new ArrayList<ItensURI>();
		this.thumbnail = new ArrayList<Thumbnail>();
	}
	
	private int id;
	private String title;
	private String description;
	private String resourceURI;
	private int startYear;
	private int endYear;
	private String rating;
	private Date modified;
	private List<Url> urls;
	private List<Thumbnail> thumbnail;
	private List<ResourceList> comics;
	private List<ResourceList> stories;
	private List<ResourceList> events;
	private List<ResourceList> characters;
	private List<ResourceList> creators;
	private List<ItensURI> next;
	private List<ItensURI> previous;
	private String etag;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getResourceURI() {
		return resourceURI;
	}
	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	public int getEndYear() {
		return endYear;
	}
	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	public List<Url> getUrls() {
		return urls;
	}
	public void setUrls(List<Url> urls) {
		this.urls = urls;
	}
	public List<Thumbnail> getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(List<Thumbnail> thumbnail) {
		this.thumbnail = thumbnail;
	}
	public List<ResourceList> getComics() {
		return comics;
	}
	public void setComics(List<ResourceList> comics) {
		this.comics = comics;
	}
	public List<ResourceList> getStories() {
		return stories;
	}
	public void setStories(List<ResourceList> stories) {
		this.stories = stories;
	}
	public List<ResourceList> getEvents() {
		return events;
	}
	public void setEvents(List<ResourceList> events) {
		this.events = events;
	}
	public List<ResourceList> getCharacters() {
		return characters;
	}
	public void setCharacters(List<ResourceList> characters) {
		this.characters = characters;
	}
	public List<ResourceList> getCreators() {
		return creators;
	}
	public void setCreators(List<ResourceList> creators) {
		this.creators = creators;
	}
	public List<ItensURI> getNext() {
		return next;
	}
	public void setNext(List<ItensURI> next) {
		this.next = next;
	}
	public List<ItensURI> getPrevious() {
		return previous;
	}
	public void setPrevious(List<ItensURI> previous) {
		this.previous = previous;
	}
	public String getEtag() {
		return etag;
	}
	public void setEtag(String etag) {
		this.etag = etag;
	}
	
	

}
