package com.zhou.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhou.entity.Student;

@Controller
@RequestMapping("handler")
public class SpringmvcHandler{
	
	@RequestMapping("welcome")
	public String welcome(){
		return "index";
	}
	
	@RequestMapping(value="welcomepost",method=RequestMethod.POST)
	public String welcomePost(){
		return "index";
	}
	
	@RequestMapping(value="welcomeparam",method=RequestMethod.POST,params={"name"})
	public String welcomePostparam(){
		return "index";
	}
	@RequestMapping(value="welcomeparamis",method=RequestMethod.POST,params={"name=zs"})
	public String welcomePostparamis(){
		return "index";
	}
	@RequestMapping(value="welcomeparamisheader",headers={"Host=localhost:8888"})
	public String welcomePostparamisheader(){
		return "index";
	}
	@RequestMapping(value="/a?c/welcomewenhao")
	public String antwenhao(){
		return "index";
	}
	@RequestMapping(value="/*/welcomex")
	public String antxing(){
		return "index";
	}
	@RequestMapping(value="/**/welcomexx")
	public String  antxingxing(){
		return "index";
	}
	
	
	
	//**************************rest风格
	
	@RequestMapping(value="testPost/{name}")
	public String  textRESTpost(@PathVariable("name") String name){
		System.out.println("post请求：增"+name);
		return "index";
	}
	@RequestMapping(value="testGet/{name}")
	public String  textRESTget(@PathVariable("name") String name){
		System.out.println("get请求：查"+name);
		return "index";
	}
	@RequestMapping(value="testDelete/{name}",method=RequestMethod.DELETE)
	@ResponseBody
	public String  textRESTdelete(@PathVariable("name") String name){
		System.out.println("delete请求：删"+name);
		return "index";
	}
	@RequestMapping(value="testPut/{name}",method=RequestMethod.PUT)
	@ResponseBody
	public String  textRESTput(@PathVariable("name") String name,@RequestParam("username") String username,
			@RequestHeader("Host") String requestHost,@CookieValue("JSESSIONID") String jsessionId){
		System.out.println("put请求：改"+name+"携带参数："+username);
		System.out.println("请求端口号："+requestHost+"------jsessionid："+jsessionId);
		return "index";
	}
	@RequestMapping("testObject")
	public String textObject(Student student){
		//student属性必须和form表单中的属性Name值一致（支持级联属性）
		System.out.println(student);
		return "index";
	}
}
