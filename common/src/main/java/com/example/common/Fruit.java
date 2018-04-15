package com.example.common;

/**
 * Created by sanandan on 4/7/18.
 */
public class Fruit {

	int id;

	String name;

	int appInstance;

	int instanceCount;

	public Fruit() {
	}

	public Fruit(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Fruit(int id, String name, int instanceCount) {
		this.id = id;
		this.name = name;
		this.instanceCount = instanceCount;
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

	public int getInstanceCount() {
		return instanceCount;
	}

	public void setInstanceCount(int partitionCount) {
		this.instanceCount = partitionCount;
	}

	@Override public String toString() {
		return "Fruit{" +
				"id=" + id +
				", name='" + name + '\'' +
				", appInstance=" + appInstance +
				", instanceCount=" + instanceCount +
				'}';
	}

}
