package com.nt.interceptor;

import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class TimeCheckingInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
		System.out.println("TimeCheckingHandlerInterceptor.preHandle()");
//Get System  Date Time
		LocalDateTime ldt = LocalDateTime.now();
//get current hour of the day
		int hour = ldt.getHour();
		if (hour < 9 || hour > 17) {
			RequestDispatcher rd = req.getRequestDispatcher("/timeout.jsp");
			rd.forward(req, res);
			return false;
		}
		return true;
	}
}
