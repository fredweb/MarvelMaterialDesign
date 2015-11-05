package com.example.george.materialdesign.model;

public class Thumbnail {

	protected String path;
	protected String extension;
	
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	

	public String getPortrait(EnumPortrait tamanho)
	{
       StringBuilder retorno = new StringBuilder();
		switch (tamanho) {
			case SMALL:
				retorno.append(this.path + "/portrait_small."+this.extension);
				break;
			case MEDIUM:
				retorno.append(this.path + "/portrait_medium."+this.extension);
				break;
			case XLARGE:
				retorno.append(this.path + "/portrait_xlarge."+this.extension);
				break;
			case FANTASTIC:
				retorno.append(this.path + "/portrait_fantastic."+this.extension);
				break;
			case UNCANNY:
				retorno.append(this.path + "/portrait_uncanny."+this.extension);
				break;
			case INCREBILE:
				retorno.append(this.path + "/portrait_incredible."+this.extension);
				break;
		}
		return retorno.toString();
	}

	public String getStandard(EnumStandard tamanho)
	{
		StringBuilder retorno = new StringBuilder();
		switch (tamanho) {
			case SMALL:
				retorno.append(this.path + "/standard_small."+this.extension);
				break;
			case MEDIUM:
				retorno.append(this.path + "/standard_medium."+this.extension);
				break;
			case LARGE:
				retorno.append(this.path + "/standard_large."+this.extension);
				break;
			case XLARGE:
				retorno.append(this.path + "/standard_xlarge."+this.extension);
				break;
			case FANTASTIC:
				retorno.append(this.path + "/standard_fantastic."+this.extension);
				break;
			case AMAZING:
				retorno.append(this.path + "/standard_fantastic."+this.extension);
				break;
		}
		return retorno.toString();
	}

	public String getLandScape(EnumLandScape tamanho)
	{
		StringBuilder retorno = new StringBuilder();
		switch (tamanho) {
			case SMALL:
				retorno.append(this.path + "/landscape_small."+this.extension);
				break;
			case MEDIUM:
				retorno.append(this.path + "/landscape_medium."+this.extension);
				break;
			case LARGE:
				retorno.append(this.path + "/landscape_large."+this.extension);
				break;
			case XLARGE:
				retorno.append(this.path + "/landscape_xlarge."+this.extension);
				break;
			case AMAZING:
				retorno.append(this.path + "/landscape_amazing."+this.extension);
				break;
			case INCREDIBLE:
				retorno.append(this.path + "/landscape_incredible."+this.extension);
				break;
		}
		return retorno.toString();
	}

}
