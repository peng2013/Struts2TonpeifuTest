package action;

import com.opensymphony.xwork2.Action;

public class ForwardAction implements Action {
	private String forward;
	

	public String getForward() {
		return forward;
	}


	public void setForward(String forward) {
		this.forward = forward;
	}


	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
