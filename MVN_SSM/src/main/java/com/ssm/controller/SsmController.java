package com.ssm.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.dao.ISsmUserDao;
import com.ssm.pojo.SsmUser;

@Controller
public class SsmController {
	@Resource
	ISsmUserDao dao;
	
	Logger log=Logger.getLogger(SsmController.class);
	
	@ResponseBody
	@RequestMapping("/testjson")
	public HashMap test(){
		HashMap m = new HashMap();
		m.put("key", "value");
		m.put("key1", "value");
		m.put("key2", "value");
        return m;    
    }
	
	@RequestMapping("/ssm")
	public String getone(Model model){
		log.info("log");
		List<SsmUser> su=(List<SsmUser>) dao.getUserByDId(1);
		SsmUser so=dao.getUserById(1);
		System.out.println(so.getName());
		System.out.println(so.getDpmt().size());
		System.out.println(su.size());
		model.addAttribute("so", so);
		return "ssm";
	}
}
