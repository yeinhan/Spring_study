package com.hello.mvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloBiz {
	
	//TODO: 06. Dao(@Repository)
	@Autowired
	private HelloDao dao;
	
	public String getHello() {
		//TODO: 08. Biz에서 return
		return "Hello, "+dao.getHello();
	}
}
