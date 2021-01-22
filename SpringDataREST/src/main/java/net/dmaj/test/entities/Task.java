package net.dmaj.test.entities;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Task extends BaseEntity {
	
	private String name;
	
	private String description;
	
	private Boolean complete;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getComplete() {
		return complete;
	}

	public void setComplete(Boolean complete) {
		this.complete = complete;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Task [name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", complete=");
		builder.append(complete);
		builder.append(", user=");
		builder.append(user);
		builder.append("]");
		return builder.toString();
	}

	public Task() {
		super();
	}

}
