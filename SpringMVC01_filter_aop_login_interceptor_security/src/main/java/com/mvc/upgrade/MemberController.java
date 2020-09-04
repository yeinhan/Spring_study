package com.mvc.upgrade;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvc.upgrade.model.biz.MemberBiz;
import com.mvc.upgrade.model.dto.MemberDto;

@Controller
public class MemberController {
	private Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberBiz biz;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	@RequestMapping("/loginform.do")
	public String loginForm() {
		logger.info("LOGIN FORM");
		return "mvclogin";
	}

	@RequestMapping(value="/ajaxlogin.do", method=RequestMethod.POST)
	@ResponseBody
	public Map<String,Boolean> ajaxLogin(HttpSession session,@RequestBody MemberDto dto){
		/*
		 * @RequestBody: request객체로 넘어오는 데이터를 java 객체로
		 * @ResponseBody: java 객체를 response객체에 binding시 json으로
		 * */
		logger.info("LOGIN");
		MemberDto res= biz.login(dto);
		boolean check = false;
		if(res != null) {
			//database에 저장되어있는 password와 화면에서 넘어온 password가일치하는지 확인
			if(passwordEncoder.matches(dto.getMemberpw(), res.getMemberpw())) {
				session.setAttribute("login", res);
				check=true;		
			}
		
		}
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("check", check);
		
		return map;
	}
	
	@RequestMapping("/registerform.do")
	public String memberInsertForm() {
		return "mvcregister";
	}
	
	@RequestMapping("/register.do")
	public String memberInsert(MemberDto dto) {
		System.out.println(dto.getMemberpw());
		dto.setMemberpw(passwordEncoder.encode(dto.getMemberpw()));
		System.out.println(dto.getMemberpw());
		
		if(biz.insert(dto)>0) {
			return "redirect:loginform.do";
		}else {
			return "redirect:registerform.do";
		}
	}
}
