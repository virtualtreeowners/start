package com.vto.Models;

public class Person {

	private String lastName;
	private String firstName;
	private String location;
	private boolean isFarmer;
	private boolean isSponsor;
	private boolean isStaff;
	private int treesSponsored;
	private int treesPlanted;
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isFarmer() {
		return isFarmer;
	}
	public void setFarmer(boolean isFarmer) {
		this.isFarmer = isFarmer;
	}
	public boolean isSponsor() {
		return isSponsor;
	}
	public void setSponsor(boolean isSponsor) {
		this.isSponsor = isSponsor;
	}
	public boolean isStaff() {
		return isStaff;
	}
	public void setStaff(boolean isStaff) {
		this.isStaff = isStaff;
	}
	public int getTreesSponsored() {
		return treesSponsored;
	}
	public void setTreesSponsored(int treesSponsored) {
		this.treesSponsored = treesSponsored;
	}
	public int getTreesPlanted() {
		return treesPlanted;
	}
	public void setTreesPlanted(int treesPlanted) {
		this.treesPlanted = treesPlanted;
	}
	
}
