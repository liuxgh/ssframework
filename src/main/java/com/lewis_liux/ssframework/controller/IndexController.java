package com.lewis_liux.ssframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController extends Layout{
	private String layoutName = "layout/~layout";
	
	@RequestMapping("")
	public ModelAndView Index(Model model){
		model.addAttribute("str", "Hi girls!");
		return view(layoutName, "index/index", model);
	}
}
