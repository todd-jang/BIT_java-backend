package tv;

public class Tv {
	private int channel;//1-255
	private int volume;//0-100
	private boolean power;
	
	public Tv (int channel,int voliume,boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	
	public void power (boolean on) {
		power=on;
	}
	public void volume (int volume) {
		if(!power) {
			return;
		}
		
		if(volume < 0) {
			volume = 100;
		} else if(volume > 100){
			volume = 0;
		}
		
		this.volume = volume;
	}
	public void volume (boolean up) {
		volume(volume + (up ? 1 : -1));
	}
	public void channel (int channel) {
		if(!power) {
			return;
		}
		
		if(channel < 1) {
			channel = 255;
		} else if(channel > 255){
			channel = 1;
		}
		
		this.channel = channel;
	}
	public void channel (boolean up) {
		channel(channel +(up ? 1 :_-1));
	}
	public void status() {
		
		String s= (power ? "on" : "off");
		System.out.println("Tv[power=" + s
		",channel=" +channel +
		",volume="+ volume + "]");
	}
}	
	
