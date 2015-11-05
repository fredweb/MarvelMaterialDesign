package com.example.george.materialdesign.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Storie {
	
	
	public Storie()
	{
		this.series = new ArrayList<ResourceList>();
		this.characters = new ArrayList<ResourceList>();
		this.events = new ArrayList<ResourceList>();
		this.comics = new ArrayList<ResourceList>();
		this.thumbnail = new ArrayList<Thumbnail>();
		this.originalissue = new ArrayList<ItensURI>();
	}
	
	private int id;
	private String title;
	private String description;
	private String resourceURI;
	private String type;
	private String etag;
	private Date modified;
	private List<Thumbnail> thumbnail;
	private List<ResourceList> comics;
	private List<ResourceList> series;
	private List<ResourceList> events;
	private List<ResourceList> characters;
	private List<ResourceList> creators;
	private List<ItensURI> originalissue;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEtag() {
		return etag;
	}
	public void setEtag(String etag) {
		this.etag = etag;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
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
	public List<ResourceList> getSeries() {
		return series;
	}
	public void setSeries(List<ResourceList> series) {
		this.series = series;
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
	public List<ItensURI> getOriginalissue() {
		return originalissue;
	}
	public void setOriginalissue(List<ItensURI> originalissue) {
		this.originalissue = originalissue;
	}
	
}
