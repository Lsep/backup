package com.ssm.interceptor;

import java.io.Writer;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class BaseInterceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
//		System.out.println("afterCompletion");
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
//		System.out.println("postHandle");
	}

	public boolean preHandle(
			HttpServletRequest request,
			HttpServletResponse response,
			Object obj) throws Exception {
		System.out.println("##############拦截器#################");
			return true;
//		Object flag = request.getSession().getAttribute(BaseController.SESSION_LOGIN_FLAG);
//		if(flag==null||!"success".equals(flag)){
//			//用户没有登录,跳转至登陆
//			request.getRequestDispatcher("/login.html").forward(request, response);
//			return false;
//		}else{
//			//用户已经登录.可以继续访问			
//			if (request.getHeader("X-Requested-With") != null
//					&& request.getHeader("X-Requested-With").equalsIgnoreCase("XMLHttpRequest")) {
//				//若果需要根据权限拦截
//				//......
//				//以后再说
////				System.out.println("exit , because this is ajax.");
//				return true;
//			}
//			//权限
//			//如果没权限就拦截此请求
//			String url=request.getRequestURI();
//			String re=url.substring(url.lastIndexOf("/")+1);
//			Set<String> set=(Set) request.getSession().getAttribute(BaseController.SESSION_USER_MENUURLSET);
//			if(!set.contains(re)){
////				String result = "没有权限";
////				response.setCharacterEncoding("utf-8");
////				response.setContentType("application/json");
////				Writer writer = response.getWriter();
////				writer.write(result);
////				writer.close();
//				request.getRequestDispatcher("/error.html").forward(request, response);
//				return false;
//			}
//			
//			return true;
//		}
	}

}
