package com.example.common;

/**
 * Created by sanandan on 4/7/18.
 */
public class Fruit {

	int id;

	String name;

	int appInstance;

	public Fruit() {
	}

	public Fruit(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Fruit(int id, String name, int appInstance) {
		this.id = id;
		this.name = name;
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
				", appInstance=" + appInstance +
				'}';
	}
}
