package com.example.george.materialdesign.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comics {

	
	public Comics()
	{
		this.characters = new ArrayList<ResourceList>();
		this.creators = new ArrayList<ResourceList>();
		this.stories = new ArrayList<ResourceList>();
		this.events = new ArrayList<ResourceList>();
		this.series = new ArrayList<ItensURI>();
		this.textObjects = new ArrayList<TextObject>();
		this.urls = new ArrayList<Url>();
		this.variants = new ArrayList<ItensURI>();
		this.collections = new ArrayList<ItensURI>();
		this.collectedIssues = new ArrayList<ItensURI>();
		this.dates = new ArrayList<Dates>();
		this.prices = new ArrayList<Price>();
		this.thumbnail = new ArrayList<Thumbnail>();
		this.images = new ArrayList<Image>();
		
	}
	
	private int id;
	private int digitalId;
	private String title;
	private double issueNumber;
	private String variantDescription;
	private String description;
	private Date modified;
	private String isbn;
	private String upc;
	private String diamondCode;
	private String ean;
	private String issn;
	private String format;
	private int pageCount;
	private List<TextObject> textObjects;
	private String resourceURI;
	private List<Url> urls;
	private List<ItensURI> series;
	private List<ItensURI> variants;
	private List<ItensURI> collections;
	private List<ItensURI> collectedIssues;
	private List<Dates> dates;
	private List<Price> prices;
	private List<Thumbnail> thumbnail;
	private List<Image> images;
	private List<ResourceList> creators;
	private List<ResourceList> characters;
	private List<ResourceList> stories;
	private List<ResourceList> events;
	private String etag;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDigitalId() {
		return digitalId;
	}
	public void setDigitalId(int digitalId) {
		this.digitalId = digitalId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getIssueNumber() {
		return issueNumber;
	}
	public void setIssueNumber(double issueNumber) {
		this.issueNumber = issueNumber;
	}
	public String getVariantDescription() {
		return variantDescription;
	}
	public void setVariantDescription(String variantDescription) {
		this.variantDescription = variantDescription;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getDiamondCode() {
		return diamondCode;
	}
	public void setDiamondCode(String diamondCode) {
		this.diamondCode = diamondCode;
	}
	public String getEan() {
		return ean;
	}
	public void setEan(String ean) {
		this.ean = ean;
	}
	public String getIssn() {
		return issn;
	}
	public void setIssn(String issn) {
		this.issn = issn;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public List<TextObject> getTextObjects() {
		return textObjects;
	}
	public void setTextObjects(List<TextObject> textObjects) {
		this.textObjects = textObjects;
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
	public List<ItensURI> getSeries() {
		return series;
	}
	public void setSeries(List<ItensURI> series) {
		this.series = series;
	}
	public List<ItensURI> getVariants() {
		return variants;
	}
	public void setVariants(List<ItensURI> variants) {
		this.variants = variants;
	}
	public List<ItensURI> getCollections() {
		return collections;
	}
	public void setCollections(List<ItensURI> collections) {
		this.collections = collections;
	}
	public List<ItensURI> getCollectedIssues() {
		return collectedIssues;
	}
	public void setCollectedIssues(List<ItensURI> collectedIssues) {
		this.collectedIssues = collectedIssues;
	}
	public List<Dates> getDates() {
		return dates;
	}
	public void setDates(List<Dates> dates) {
		this.dates = dates;
	}
	public List<Price> getPrices() {
		return prices;
	}
	public void setPrices(List<Price> prices) {
		this.prices = prices;
	}
	public List<Thumbnail> getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(List<Thumbnail> thumbnail) {
		this.thumbnail = thumbnail;
	}
	public List<Image> getImages() {
		return images;
	}
	public void setImages(List<Image> images) {
		this.images = images;
	}
	public List<ResourceList> getCreators() {
		return creators;
	}
	public void setCreators(List<ResourceList> creators) {
		this.creators = creators;
	}
	public List<ResourceList> getCharacters() {
		return characters;
	}
	public void setCharacters(List<ResourceList> characters) {
		this.characters = characters;
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
	public String getEtag() {
		return etag;
	}
	public void setEtag(String etag) {
		this.etag = etag;
	}
	
	
}
