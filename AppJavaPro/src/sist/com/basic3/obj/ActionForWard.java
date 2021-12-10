package sist.com.basic3.obj;

public class ActionForWard {
	private String path;
	private boolean redirect;	//true면 직접 false는 간접
	
	public ActionForWard() {
		super();
	}

	public ActionForWard(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isRedirect() {
		return redirect;
	}

	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	
}
