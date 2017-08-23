package com.ssm.controller.common;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GloableExceptionHandler {
	
	@ExceptionHandler
	@ResponseBody
	public HashMap doexp(HttpServletRequest request, Exception ex){
		ex.printStackTrace();
//		request.setAttribute("msg", ex);		
//		return "error/gloableError";
		
		HashMap re = new HashMap();
		re.put("errorMsg", ex.getMessage());
		return re;		
	}
}
