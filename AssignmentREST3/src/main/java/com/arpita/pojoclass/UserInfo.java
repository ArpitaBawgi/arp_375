package com.arpita.pojoclass;

public class UserInfo {

	private String state;
	private String city;
	private String country;

	public UserInfo() {
		super();

	}

	public UserInfo(String state, String city, String country) {
		super();
		this.state = state;
		this.city = city;
		this.country = country;

	}

	public String getState() {
		return state;
	}

	@Override
	public String toString() {
		return "UserInfo [state=" + state + ", city=" + city + ", country=" + country + "]";
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
