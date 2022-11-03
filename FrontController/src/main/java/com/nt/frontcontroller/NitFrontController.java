package com.nt.frontcontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.controller.LinkHandler;
@WebServlet("/")
public class NitFrontController extends HttpServlet {
 private LinkHandler handler=null;

 @Override
	public void init() throws ServletException {
		handler=new LinkHandler();
	}
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	//nevigation managment
		String lvn=null;
		if(req.getServletPath().equalsIgnoreCase("/wish"))
			lvn=handler.shoeWishMessage(req);
		else if(req.getServletPath().equalsIgnoreCase("/lang"))
			lvn=handler.showAllLanguages(req);
		else
			throw new IllegalArgumentException("not found");
		
		//view management
		String desgPage=null;
		if(lvn.equalsIgnoreCase("wish_msg"))
			desgPage="show_msg.jsp";
		else if(lvn.equalsIgnoreCase("langs"))
			desgPage="show_lang.jsp";
		else
			throw new IllegalArgumentException("LVN not found");
		//forword request to dest comp
		RequestDispatcher rd=req.getRequestDispatcher(desgPage);
		rd.forward(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
