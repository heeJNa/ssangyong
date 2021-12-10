package sist.com.basic3.obj;

import sist.com.basic3.obj.action.DeleteAction;
import sist.com.basic3.obj.action.InfoAction;
import sist.com.basic3.obj.action.LoginAction;
import sist.com.basic3.obj.action.UpdateAction;
import sist.com.basic3.obj.dao.MsSqlDao;
import sist.com.basic3.obj.dao.MySqlDao;
import sist.com.basic3.obj.dao.OracleDao;

public class ActionFactory {	//ΩÃ±€≈Ê
	
	static final ActionFactory ACTION_FACTORY;
	static {
		ACTION_FACTORY = new ActionFactory();
	}
	
	public static ActionFactory getInstacne() {
		return ACTION_FACTORY;
	}
	
	public Action getAction(String command) {
		if (command.equalsIgnoreCase("login")) {
			return new LoginAction(new OracleDao(),"loginView", false);
		} else if (command.equalsIgnoreCase("delete")) {
			return new DeleteAction(new MySqlDao(),"listView", true);
		} else if (command.equalsIgnoreCase("update")) {
			return new UpdateAction(new MsSqlDao(),"updateView", false);
		} else if (command.equalsIgnoreCase("info")) {
			return new InfoAction(new OracleDao(),"infoView", false);
		}
		return null;
	}
}
