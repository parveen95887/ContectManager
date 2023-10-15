package com.smart.contact.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class user {
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String name;
   @Override
public String toString() {
	return "user [id=" + id + ", name=" + name + ", email=" + email + ", pass=" + pass + ", about=" + about
			+ ", enabaled=" + enabaled + ", imgurl=" + imgurl + "]";
}
public user() {
	super();
	// TODO Auto-generated constructor stub
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getAbout() {
	return about;
}
public void setAbout(String about) {
	this.about = about;
}
public boolean isEnabaled() {
	return enabaled;
}
public void setEnabaled(boolean enabaled) {
	this.enabaled = enabaled;
}
public String getImgurl() {
	return imgurl;
}
public void setImgurl(String imgurl) {
	this.imgurl = imgurl;
}
@Column(unique = true)
   private String email;
   public user(int id, String name, String email, String pass, String about, boolean enabaled, String imgurl) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.pass = pass;
	this.about = about;
	this.enabaled = enabaled;
	this.imgurl = imgurl;
}
@Column(length =10)
   private String pass;
   @Column(length =100)
   private String about;
   private boolean enabaled;
   private String imgurl;
   @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY ,mappedBy = "user")
   private List<contact> contact=new ArrayList<contact>();
public List<contact> getContact() {
	return contact;
}
public void setContact(List<contact> contact) {
	this.contact = contact;
}
}
