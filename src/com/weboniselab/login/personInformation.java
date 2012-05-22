package com.weboniselab.login;

import android.os.Parcel;
import android.os.Parcelable;

public class personInformation implements Parcelable{
	
	String name;
	String address;
	String gender;
	String maritalstatus;
	String hobbies;
	float rating;
	
	public personInformation()
	{
		super();
		
	}
	public personInformation(String name, String address, String gender,
			String maritalstatus, String hobbies,float rating) {
		super();
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.maritalstatus = maritalstatus;
		this.hobbies = hobbies;
		this.rating=rating;
	}
	
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalstatus() {
		return maritalstatus;
	}
	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	
	
	@Override
	public String toString() {
		return "personInformation [name=" + name + ", address=" + address
				+ ", gender=" + gender + ", maritalstatus=" + maritalstatus
				+ ", hobbies=" + hobbies + ", rating=" + rating + "]";
	}
	
	
	@Override
	public int describeContents() {
		
		return 0;
	}
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		
		dest.writeString(name);
		dest.writeString(address);
		dest.writeString(gender);
		dest.writeString(maritalstatus);
		dest.writeString(hobbies);
		dest.writeFloat(rating);
	}
	
	
	public static Parcelable.Creator<personInformation> CREATOR=new Parcelable.Creator<personInformation>() {

		@Override
		public personInformation createFromParcel(Parcel source) {
		
			personInformation person=new personInformation();
			
			person.setName(source.readString());
			person.setAddress(source.readString());
			person.setGender(source.readString());
		    person.setMaritalstatus(source.readString());
		    person.setHobbies(source.readString());
		    person.setRating(source.readFloat());
		   return person;
		   
		}

		@Override
		public personInformation[] newArray(int size) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	
	

}
