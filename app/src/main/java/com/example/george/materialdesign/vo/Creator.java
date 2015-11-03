package com.example.george.materialdesign.vo;

import java.util.ArrayList;
import java.util.List;

public class Creator {
	
	public Creator()
	{
		this.stories = new ArrayList<ResourceList>();
		this.events = new ArrayList<ResourceList>();
		this.series = new ArrayList<ResourceList>();
		this.comics = new ArrayList<ResourceList>();
		this.urls = new ArrayList<Url>();
		this.thumbnail = new ArrayList<Thumbnail>();
	}
	
	private int id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String suffix;
	private String fullName;
	private String modified;
	private String resourceURI;
	private String etag;
	private List<Url> urls;
	private List<Thumbnail> thumbnail;
	private List<ResourceList> series;
	private List<ResourceList> stories;
	private List<ResourceList> comics;
	private List<ResourceList> events;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
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
	public List<ResourceList> getSeries() {
		return series;
	}
	public void setSeries(List<ResourceList> series) {
		this.series = series;
	}
	public List<ResourceList> getStories() {
		return stories;
	}
	public void setStories(List<ResourceList> stories) {
		this.stories = stories;
	}
	public List<ResourceList> getComics() {
		return comics;
	}
	public void setComics(List<ResourceList> comics) {
		this.comics = comics;
	}
	public List<ResourceList> getEvents() {
		return events;
	}
	public void setEvents(List<ResourceList> events) {
		this.events = events;
	}
	
	
}
