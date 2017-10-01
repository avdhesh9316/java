package com.automobile.TwoWheeler;
import com.automobile.Vehicle;
class Hero extends Vehicle {
	int heroSpeed = 1000;
	String modelname = "Hero";
	String Rno = "10012535";
	String owner = "Avdhesh Kumar Sharma";
	public int getSpeed() {
		return heroSpeed;
	}
	public void radio() {
		System.out.println("You can play radio in your car using radio plugins");
	}
	public String getModelName() {
		return modelname;
	}
	public String getRegistrationNumber() {
		return Rno;
	}
	public String getOwnerName() {
		return owner;
	}
}
class Honda extends Vehicle {
	int hondaSpeed = 2000;
	String modelname = "Honda";
	String Rno = "12112535";
	String owner = "Rakesh Sharma";
	public int getSpeed() {
		return hondaSpeed;
	}
	public void cdplayer() {
		System.out.println("The CD Player is at middle of your car Dashbord. You can play any song from there");
	}
	public String getModelName() {
		return modelname;
	}
	public String getRegistrationNumber() {
		return Rno;
	}
	public String getOwnerName() {
		return owner;
	}
}
public class Test {
	public static void main (String args []) {
		Hero he = new Hero();
		Honda ho = new Honda();
		System.out.println("Hero car has following specifications : ");
		System.out.println("Speed : " + he.getSpeed() + ", ModelName : " + he.getModelName() + ", Registration Number : " + he.getRegistrationNumber());
		System.out.println(", and Owner Name : " + he.getOwnerName());
		he.radio();
		System.out.println("");
		System.out.println("Honda car has following specifications : ");
		System.out.println("Speed : " + ho.getSpeed() + ", ModelName : " + ho.getModelName() + ", Registration Number : " + ho.getRegistrationNumber());
		System.out.println(", and Owner Name : " + ho.getOwnerName());
		ho.cdplayer();
	}
}