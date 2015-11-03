package com.example.george.materialdesign.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event {
	
	public Event()
	{
		this.stories = new ArrayList<ResourceList>();
		this.characters = new ArrayList<ResourceList>();
		this.series = new ArrayList<ResourceList>();
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
	private Date modified;
	private Date start;
	private Date end;
	private String etag;
	private List<Url> urls;
	private List<Thumbnail> thumbnail;
	private List<ResourceList> comics;
	private List<ResourceList> stories;
	private List<ResourceList> series;
	private List<ResourceList> characters;
	private List<ResourceList> creators;
	private List<ItensURI> next;
	private List<ItensURI> previous;
	
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
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public String getEtag() {
		return etag;
	}
	public void setEtag(String etag) {
		this.etag = etag;
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
	public List<ResourceList> getSeries() {
		return series;
	}
	public void setSeries(List<ResourceList> series) {
		this.series = series;
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
	
	

}
