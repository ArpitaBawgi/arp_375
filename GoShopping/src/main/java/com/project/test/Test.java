package com.project.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.dao.UserDAO;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("springjdbc.xml");
		UserDAO dao=context.getBean(UserDAO.class);
		//System.out.println(dao.addUser(101, "mallika", "ykunta"));
		
		//System.out.println(dao.addUser(102, "santhi", "abcd"));
		System.out.println(dao.addUser(103, "arpita", "malli"));
		System.out.println(dao.remove(102));
		System.out.println(dao.update(101, "sindhu"));
		//System.out.println(dao.getUser(103));
		System.out.println(dao.getAllUsers());
}

}
