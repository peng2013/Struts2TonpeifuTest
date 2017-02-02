<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
  <head>
    
    <title>成功登陆</title>
  </head>
   <body>
    <!-- 通过EL访问ServletContext对象，并显示计数器的值 -->
    本站访问次数:${applicationScope.counter }</p>
    <!-- 通过EL访问HttpSession对象并显示登陆用户名 -->
    用户名：${sessionScope.username}</p>
    <!-- 通过EL访问HttpServletRequest对象，并显示处理结果信息 -->
    ${requestScope.info }
  </body>
</html>
