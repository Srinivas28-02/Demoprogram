package com.nit.constant;

public class Constant {
	public static final String GET_ALL="select * from employee";
	public static final String DELETE="delete from employee where id=?";
	public static final String INSERT="insert into employee(name,address,salary,email) values(?,?,?,?)";
	public static final String GET_ONE="select * from employee where id=?";
	public static final String UPDATE="update employee set name=?, address=?, salary=? ,email=? where id=?";

}