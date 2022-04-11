package com.casestudy.profilemanagementmicroservice.model;

import javax.annotation.processing.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import io.swagger.annotations.ApiModelProperty;

@Document(collection="user")
public class User {

	  @Id
	  @ApiModelProperty(notes="User Id",  name = "id", required = true)
	    private String id;
	  
	  @ApiModelProperty(notes="userName",  name = "userName", required = true)
	  @Field
	    private String userName;
	  
	  @ApiModelProperty(notes="password",  name = "password", required = true)
	    private String password;
	  
	  @ApiModelProperty(notes="user status",  name = "active", required = true)
	    private boolean active;
	  
	  @ApiModelProperty(notes="role user or admin",  name = "roles", required = true)
	    private String roles;//ROLE_USER,ROLE_ADMIN
	  
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		public String getRoles() {
			return roles;
		}
		public void setRoles(String roles) {
			this.roles = roles;
		}
		public User(String id, String userName, String password, boolean active, String roles) {
			super();
			this.id = id;
			this.userName = userName;
			this.password = password;
			this.active = active;
			this.roles = roles;
		}
		
		
		@Override
		public String toString() {
			return "Profile [Id=" + id + ", UserName=" + userName + ", status=" + active + ", role=" + roles + "]";
		}
	    
}
