package com.mvc.upgrade;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.upgrade.model.biz.BoardBiz;
import com.mvc.upgrade.model.biz.BoardBizImpl;
import com.mvc.upgrade.model.dto.BoardDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private BoardBizImpl biz;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		logger.info("SELECT LIST");
		model.addAttribute("list", biz.selectList());
		return "mvclist";
	
	}
	
	@RequestMapping("/insertform.do")
	public String insertForm() {
		logger.info("INSERT FORM");
		return "mvcinsert";
	}
	
	@RequestMapping("/insertres.do")
	public String insertRes(BoardDto dto) {
		logger.info("INSERT RES");
		int res=biz.insert(dto);
		if(res>0) {
			return "redirect:list.do";
		}else {
			return "redirect:insertform.do";
		}
	}
	
	@RequestMapping("/detail.do")
	public String detail(Model model, int  myno) {
		logger.info("SELECT ONE");
		model.addAttribute("dto", biz.selectOne(myno));
		
		return "mvcdetail";
	}
	
	@RequestMapping("/updateform.do")
	public String updateForm(Model model, int myno) {
		logger.info("UPDATE");
		
		model.addAttribute("dto", biz.selectOne(myno));
		
		return "mvcupdate";
	}
	
	@RequestMapping("/updateres.do")
	public String updateRes(BoardDto dto) {
		logger.info("UPDATE RES");
		int res=biz.update(dto);
		
		if(res>0) {
			return "redirect:detail.do?myno="+dto.getMyno();
		}else {
			return "redirect:updateform.do?myno=" +dto.getMyno();
		}
	}
	
	@RequestMapping("/delete.do")
	public String delete(BoardDto dto, int myno) {
		logger.info("DELETE");
		
		int res=biz.delete(myno);
		
		if(res>0) {
			return "redirect:list.do";
		}else {
			return "redirect:detail.do?myno="+dto.getMyno();
		}
		
	}
	
}
