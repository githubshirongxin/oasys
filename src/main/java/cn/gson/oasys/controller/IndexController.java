package cn.gson.oasys.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gson.oasys.services.system.MenuSysService;


@Controller
@RequestMapping("/")
public class IndexController {
		
	Logger log=LoggerFactory.getLogger(getClass());
	
	@Autowired
	private MenuSysService menuService;
	
	@RequestMapping("index")
	public String index(HttpServletRequest req){
		menuService.findMenuSys(req);
		HttpSession session=req.getSession();
		session.setAttribute("userId", "1");
		return "index/index";
	}
	
	@RequestMapping("test2")
	public String test2(){
		return "systemcontrol/control";
	}
	@RequestMapping("test3")
	public String test3(){
		return "note/noteview";
	}
	@RequestMapping("test4")
	public String test4(){
		return "mail/editaccount";
	}
	
	@RequestMapping("notlimit")
	public String notLimit(){
		return "common/notlimit";
	}
//	测试系统管理
	
	@RequestMapping("one")
	public String witeMail(){
		return "mail/wirtemail";
	}
	
	@RequestMapping("two")
	public String witeMail2(){
		return "mail/seemail";
	}
	
	@RequestMapping("three")
	public String witeMail3(){
		return "mail/allmail";
	}
	@RequestMapping("mmm")
	public String witeMail4(){
		return "mail/mail";
	}
	
	
	
	
	
	

}
