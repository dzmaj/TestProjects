package net.dmaj.test.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
public class User extends BaseEntity {

	
	public User() {
		super();
	}

	private String username;
	
	private String email;
	
	private String password;
	
	@OneToMany(mappedBy="user")
	@RestResource(path = "tasks", rel="tasks")
	private List<Task> tasks;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [username=");
		builder.append(username);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

}
