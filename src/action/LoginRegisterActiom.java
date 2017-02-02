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
	//处理注册的请求方法
	public String register(){
		System.out.println("register方法执行成功");
		request.setAttribute("info","您已经注册成功");
		return SUCCESS;
	}
	//处理登陆请求的方法
	public String login(){
		System.out.println("login方法执行成功");
		if(getUsername().equals("bill")&&getPassword().equals("1234")){
			request.setAttribute("info","登陆成功");
			return SUCCESS;
		}else{
			request.setAttribute("info", "登陆失败");
			return ERROR;
		}
	}

}
