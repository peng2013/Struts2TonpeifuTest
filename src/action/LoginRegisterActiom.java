package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginRegisterActiom extends ActionSupport implements ServletRequestAware {
	private String username;
	private String password;
	private HttpServletRequest request;
	

	@Override
	public void setServletRequest(HttpServletRequest request) {
         this.request=request;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	//����ע������󷽷�
	public String register(){
		System.out.println("register����ִ�гɹ�");
		request.setAttribute("info","���Ѿ�ע��ɹ�");
		return SUCCESS;
	}
	//�����½����ķ���
	public String login(){
		System.out.println("login����ִ�гɹ�");
		if(getUsername().equals("bill")&&getPassword().equals("1234")){
			request.setAttribute("info","��½�ɹ�");
			return SUCCESS;
		}else{
			request.setAttribute("info", "��½ʧ��");
			return ERROR;
		}
	}

}
