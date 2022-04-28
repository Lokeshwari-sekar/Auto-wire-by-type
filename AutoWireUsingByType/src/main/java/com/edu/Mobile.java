package com.edu;

public class Mobile {
	public Battery battery;

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	
	public void mobileFunction()
	{
		if(battery!=null)
		{
			battery.batteryDisplay();
		}
		else
		{
			System.out.println("battery dead");
		}
	}

}
