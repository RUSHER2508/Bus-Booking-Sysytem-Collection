package com.bbs.services;

import java.sql.Date;

import com.bbs.beans.Booking;
import com.bbs.beans.Ticket;
import com.bbs.beans.User;
import com.bbs.dao.DAOUser;
import com.bbs.dao.UserDaoImpl;

public class UserServicesImpl implements UserServices{

	DAOUser db = new UserDaoImpl();
	@Override
	public Boolean createUser(User user) {
		return db.createUser(user);
	}
	@Override
	public Boolean loginUser(Integer user_id, String password) {
		return db.loginUser(user_id, password);
	}

	@Override
	public Boolean bookTicket(Ticket ticket) {
		return db.bookTicket(ticket);
	}
	@Override
	public Boolean updateUser(Integer userId, String password, String username, String email, Long contact) {
		return db.updateUser(userId, password, username, email, contact);
	}

	@Override
	public Boolean deleteUser(Integer userId) {
		return db.deleteUser(userId);
	}

	@Override
	public User searchUser(Integer userId) {
		return db.searchUser(userId);
	}

	@Override
	public Boolean cancelTicket(Integer bookingId) {
		return db.cancelTicket(bookingId);
	}

	@Override
	public Booking getTicket(Integer bookingId) {
		return db.getTicket(bookingId);
	}
	@Override
	public Integer checkAvailability(int busId, java.util.Date availdate) {
	 return db.checkAvailability(busId, availdate);
	}



}
