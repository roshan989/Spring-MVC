 package com.rk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.rk.service.AddService;
@Controller
public class ControllerA {
@RequestMapping("/add")
  public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
  int i=Integer.parseInt(request.getParameter("t1"));
  int j=Integer.parseInt(request.getParameter("t2"));
 
  AddService as=new AddService();
   int k=as.add(i, j);
  
  ModelAndView mv=new ModelAndView();
  mv.setViewName("display.jsp");
  mv.addObject("result",k);
  return mv;
  }
}
