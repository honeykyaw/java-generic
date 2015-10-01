package com.vios.test;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("you need to pass one IP ");
		} else {
			String ipAddress = args [0]	;
//			service.getCountryName(ipAddress);
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
			GeoIP ip = geoIPServiceSoap.getGeoIP(ipAddress);
			System.out.println(ip.getCountryCode() + "  " + ip.getCountryName());
		}
	}
}
