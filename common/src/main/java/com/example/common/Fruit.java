package com.example.common;

/**
 * Created by sanandan on 4/7/18.
 */
public class Fruit {

	int id;

	String name;

	int currentAppInstance;

	int totalInstanceCount;

	public Fruit() {
	}

	public Fruit(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Fruit(int id, String name, int totalInstanceCount) {
		this.id = id;
		this.name = name;
		this.totalInstanceCount = totalInstanceCount;
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

	public int getCurrentAppInstance() {
		return currentAppInstance;
	}

	public void setCurrentAppInstance(int currentAppInstance) {
		this.currentAppInstance = currentAppInstance;
	}

	public int getTotalInstanceCount() {
		return totalInstanceCount;
	}

	public void setTotalInstanceCount(int partitionCount) {
		this.totalInstanceCount = partitionCount;
	}

	@Override public String toString() {
		return "Fruit{" +
				"id=" + id +
				", name='" + name + '\'' +
				", currentAppInstance=" + currentAppInstance +
				", totalInstanceCount=" + totalInstanceCount +
				'}';
	}

}
