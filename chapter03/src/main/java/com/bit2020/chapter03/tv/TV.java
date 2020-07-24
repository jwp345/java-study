package com.bit2020.chapter03.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int ch, int volume, boolean power) {
		this.channel = ch;
		this.volume = volume;
		this.power = power;
	}
	public void status() {
		System.out.println("TV[power=" + power + 
				",channel=" + channel + 
				",volume=" + volume + "]");
	}
	
	public void power(boolean power) {
		this.power = power;
	}
	
	public void channel(int channel) {
		this.channel = channel;
	}
	
	public void channel(boolean up) {
		if(up) {
			if(this.channel == 255)
				this.channel = 1;
			else
				this.channel++;
		}
		else {
			if(this.channel == 0)
				this.channel = 255;
			else
				this.channel--;
		}
	}
	
	public void volume(int volume) {
		this.volume = volume;
	}
	
	public void volume(boolean up) {
		if(up) {
			if(this.volume == 100)
				this.volume = 0;
			else
				this.volume++;
		}
		else {
			if(this.volume == 0)
				this.volume = 100;
			else
				this.volume--;
		}
	}

}
