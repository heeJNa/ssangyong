package sist.com.basic3.obj.action;

import sist.com.basic3.obj.Action;
import sist.com.basic3.obj.ActionForWard;
import sist.com.basic3.obj.Dao;

public class InfoAction extends Action{
	private String path;
	private boolean redirect;
	private Dao dao;
	
	public InfoAction(Dao dao,String path, boolean redirect) {
		super();
		this.dao = dao;
		this.path = path;
		this.redirect = redirect;
	}
	
	@Override
	public ActionForWard execute() {
		System.out.println("InfoAction Process");
		dao.connectProcess();
		dao.info();
		return new ActionForWard(path,redirect);
	}
}
