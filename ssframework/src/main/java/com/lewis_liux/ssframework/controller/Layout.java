package com.lewis_liux.ssframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Layout {
	public ModelAndView view(String layout,String viewName,Model model){
		model.addAttribute("view", viewName + ".html");
		ModelAndView mv = new ModelAndView(layout);
		return mv;
	}
}
