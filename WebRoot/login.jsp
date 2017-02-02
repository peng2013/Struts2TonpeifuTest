<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
	function login(){
	    form.action="loginAction.action";
	    form.submit();
	}
	//提交注册信息
	function register(){
	    form.action="registerAction.action";
	    form.submit();
	}
	</script>

  </head>
  
  <body>
      <s:form name="form" theme="simple">
                              用户:<s:textfield name="username"/><p/>
                              密码:<s:textfield name="password"/><p/>
         <s:submit value="登录" onclick="login()"/>
         <s:submit value="注册" onclick="register()"/>
      </s:form>
  </body>
</html>
