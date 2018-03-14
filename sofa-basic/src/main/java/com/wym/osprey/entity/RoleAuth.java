package com.wym.osprey.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleAuth {

	@JsonProperty("MENU")
	private List<String> menu;

	public List<String> getMenu() {
		return menu;
	}

	public void setMenu(List<String> menu) {
		this.menu = menu;
	}
	
}
