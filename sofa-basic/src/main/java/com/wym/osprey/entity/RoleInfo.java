package com.wym.osprey.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleInfo {

	private Integer id;
	private String roleName;
	private RoleAuth roleAuth;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public RoleAuth getRoleAuth() {
		return roleAuth;
	}
	public void setRoleAuth(RoleAuth roleAuth) {
		this.roleAuth = roleAuth;
	}
	
	
}
