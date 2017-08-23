<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>   
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"
	+request.getServerPort()+path+"/";
%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">    
<html>    
  <head>    
    <base href="<%=basePath%>">
        
    <title>My JSP 'userinfo.jsp' starting page</title>    
        
    <meta http-equiv="pragma" content="no-cache">    
    <meta http-equiv="cache-control" content="no-cache">    
    <meta http-equiv="expires" content="0">        
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">    
    <meta http-equiv="description" content="This is my page">    
    <!--  
    <link rel="stylesheet" type="text/css" href="styles.css">  
    -->    
    
  </head>    
      
  <body>
  <p><%=basePath%></p>
  <p>name:${so.name}</p>
  <p>ctime:${so.ctime}</p>
  <p>timestamp:${so.timestamp}</p>
  <p>
  <c:forEach items="${so.dpmt}" var="d">
  	${d.name} 
  </c:forEach>
  </p>
  <a href="user/userList">aa</a>
  <button onclick="cc()">bb</button>
  <script type="text/javascript">
  function cc(){
	  window.location="user/addUserUI"
  }
  </script>
  </body>    
</html>