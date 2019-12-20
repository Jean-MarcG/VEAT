package fr.dawan.veat.form;

import javax.validation.constraints.NotNull;

public class SearchForm {
	
	@NotNull
	private String search;
	
	public String getSearch() {
		return this.search;
	}
	
	public void setSearch(String value) {
		this.search = value;
	}
}