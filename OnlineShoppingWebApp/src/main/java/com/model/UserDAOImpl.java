package com.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("select i from Product i");
		List<User> Userlist=query.list();
		return Userlist;
	}

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.save(user);
		session.flush();
		session.close();
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		User user=findUser(id);
		Session session=sessionFactory.openSession();
		session.delete(user);
		session.flush();
		session.close();
		return true;
	}

	@Override
	public User findUser(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		User user=session.get(User.class, id);
		return user;
	}

}
