package com.telusko;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.HttpConstraintElement;.

@Controller


public class AddController extends HttpServlet {
	
@RequestMapping("/add")
	public ModelAndViieew add(HttpServeletRequest request,HttpServletResponse response )
	{
	  int i=Integer.parseInt(request.getParameter("t1"));	
	  int j=Integer.parseInt(request.getParameter("t1"));	
      int k =i+j;
      
      ModelAndView mv = new ModelAndView();
      mv.setViewName("Display.jsp");
      mv.addObject("result",k);
      
	return mv;
		
	}
}  
