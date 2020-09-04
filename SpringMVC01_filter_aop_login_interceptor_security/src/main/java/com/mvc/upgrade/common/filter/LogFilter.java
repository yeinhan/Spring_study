package com.mvc.upgrade.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFilter implements Filter {
	//로거객체
	private Logger logger = LoggerFactory.getLogger(LogFilter.class);

	/*
	 * init: 필터 초기화
	 * doFilter: 전/후처리
	 * destroy: 필터 종료
	 * 
	 * */
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		String remoteAddr = req.getRemoteAddr();
		String url = req.getRequestURL().toString();
		String queryString = req.getQueryString();
		
		String referer = req.getHeader("referer");	//이전페이지 정보
		String agent = req.getHeader("User-Agent");	//사용자 정보
		
		StringBuffer sb = new StringBuffer();
		sb.append("remonteAddr: "+remoteAddr+"\n")			//ip주소
			.append("url:"+url+"\n")						//url
			.append("queryString: "+queryString+"\n")		//쿼리스트링
			.append("referer: "+referer+"\n")				//이전 페이지 url
			.append("agent: "+agent);						//사용자정보
		
		logger.info("Log FILTER\n"+sb);
		chain.doFilter(req, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
