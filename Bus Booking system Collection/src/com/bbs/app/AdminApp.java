package com.bbs.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import com.bbs.beans.Admin;
import com.bbs.beans.Booking;
import com.bbs.beans.Bus;
import com.bbs.beans.Ticket;
import com.bbs.services.AdminServices;
import com.bbs.services.AdminServicesImpl;
import com.bbs.services.UserServices;
import com.bbs.services.UserServicesImpl;

public class AdminApp {

	public static void main(String[] args) {
	
		AdminServices services  = new AdminServicesImpl();
		Scanner sc = new Scanner(System.in);
/*		Bus b = services.searchBus(101);
		System.out.println(b);
*/	
/*		Boolean a = services.adminLogin(1, "admin@123");
		System.out.println(a);
		
		Boolean b = services.updateBus("pune", "borivali",(double) 660l, 101);
		System.out.println(services.searchBus(101));
	System.out.println(b);
	Boolean c = services.deletebus(101);
	System.out.println(c);
	Admin a1 = services.searchAdmin(1);
	System.out.println(a1);
*/	
	/*Bus bus6 = new Bus();
	bus6.setBusId(106);
	bus6.setBusName("Volvo");
	bus6.setSource("Goa");
	bus6.setDestination("Pune");
	bus6.setPrice(450);
	bus6.setTotalSeats(50);
	boolean e = services.createBus(bus6);
	System.out.println(e);
	System.out.println(services.searchBus(106));
	
*/

		UserServices ser = new UserServicesImpl();
		/*int busId = sc.nextInt();
		String availdate = sc.nextLine();
		Integer b =ser.checkAvailability(busId, availdate);
		System.out.println(b);
		*/	
		/*Booking a = ser.getTicket(301);
		System.out.println(a);
		*/
		
	/*		String date1 = "2019-07-09";
		Date availdate;
		try {
			availdate = new SimpleDateFormat("yyyy-MM-dd").parse(date1);
			java.sql.Date date = new java.sql.Date(availdate.getTime());
			System.out.println(date);
			

			Integer a= ser.checkAvailability(101, date);
			System.out.println(a);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
*/	
		Ticket ticket5 = new Ticket();
		ticket5.setSource("Mumbai");
		ticket5.setDestination("Goa");
		ticket5.setUserId(1);
		ticket5.setBusId(101);
		ticket5.setAvailDate("2019-07-09");
		ticket5.setNumofSeats(4);
	 boolean b=	ser.bookTicket(ticket5);
	 System.out.println(b);
	}
}