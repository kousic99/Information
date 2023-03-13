package org.network;

public class Wifi {
	private void wiWifiName() {
		System.out.println("Wifi name: Villa 1");
	}
	public static void main(String[]args) {
		Wifi wi =new Wifi();
		MobileData md =new MobileData();
		Lan l =new Lan();
		Wireless wl =new Wireless();
		wi.wiWifiName();
		md.mdName();
		l.lanName();
		wl.wlModamName();
	}

}
