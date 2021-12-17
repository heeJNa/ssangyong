package sist.com.basic3.obj.dao;

import sist.com.basic3.obj.Dao;

public class MySqlDao extends Dao{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("MySql select");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("MySql update");
		
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		System.out.println("MySql info");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("MySql delete");
	}

}
