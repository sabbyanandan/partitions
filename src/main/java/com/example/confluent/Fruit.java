package com.example.confluent;

/**
 * Created by sanandan on 4/7/18.
 */
public class Fruit {

	int id;

	String name;

	String description;

	int appInstance;

	public Fruit(int id, String name, String description, int appInstance) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.appInstance = appInstance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public int getAppInstance() {
		return appInstance;
	}

	public void setAppInstance(int appInstance) {
		this.appInstance = appInstance;
	}

	@Override public String toString() {
		return "Fruit{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", appInstance=" + appInstance +
				'}';
	}
}
