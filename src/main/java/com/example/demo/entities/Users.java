package com.example.demo.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String email;
	String password;
	String gender;
	String role;
	String address;
	boolean isPremium;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int id, String name, String email, String password, String gender, String role, String address,
			boolean isPremium) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.role = role;
		this.address = address;
		this.isPremium = isPremium;
	}
	public boolean isPremium() {
		return isPremium;
	}
	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", role=" + role + ", address=" + address + ", isPremium=" + isPremium + "]";
	}
	
}
