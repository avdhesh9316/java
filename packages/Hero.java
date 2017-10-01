package package com.automobile.TwoWheeler;
import com.automobile.Vehicle;
public class Hero extends Vehicle {
	int heroSpeed = 1000;
	public int getSpeed() {
		return heroSpeed;
	}
	public void radio() {
		System.out.prinln("You can play radio in your car using radio plugins");
	}
}
public class Honda extends Vehicle {
	int hondaSpeed = 2000;
	public int getSpeed() {
		return hondaSpeed;
	}
	public void cdplayer() {
		System.out.println("The CD Player is at middle of your car Dashbord. You can play any song from there");
	}
}