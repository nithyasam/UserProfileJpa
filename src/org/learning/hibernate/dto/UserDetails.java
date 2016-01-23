package org.learning.hibernate.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="USER_DETAILS")
public class UserDetails {
	
	@Id
	@Column (name= "USER_ID")
	private int userId;
	@Column (name = "USER_NAME")
	private String userName;
	@Column (name= "CURRENTLY_EMPLOYED")
	private Boolean current;
	
	/*@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street", column=@Column(name="HOME_STREET_NAME")),
	@AttributeOverride(name="city", column=@Column(name="HOME_CITY_NAME")),
	@AttributeOverride(name="state", column=@Column(name="HOME_STATE_NAME")),
	@AttributeOverride(name="pincode", column=@Column(name="HOME_PIN_CODE"))})
	private Address homeAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street", column=@Column(name="OFFICE_STREET_NAME")),
		@AttributeOverride(name="city", column=@Column(name="OFFICE_CITY_NAME")),
		@AttributeOverride(name="state", column=@Column(name="OFFICE_STATE_NAME")),
		@AttributeOverride(name="pincode", column=@Column(name="OFFICE_PIN_CODE"))})
	private Address officeAddress;*/
	
	@ElementCollection
	private Set<Address> listOfAddresses = new HashSet();
	
	
	/*@Temporal (TemporalType.DATE)
	private Date joinedDate;
	private String address;
	private String description;*/
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name= "USER_ID")
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/*@Column (name = "USER_NAME")*/
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/*public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}*/
	public Boolean getCurrent() {
		return current;
	}
	public void setCurrent(Boolean current) {
		this.current = current;
	}
	public Set<Address> getListOfAddresses() {
		return listOfAddresses;
	}
	public void setListOfAddresses() {
		this.listOfAddresses = listOfAddresses;
	}
	
	
	/*public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
*/	
	
}
