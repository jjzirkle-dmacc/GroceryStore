package com.cis175.finalProject.grocerystore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ItemController {
	
	@Autowired ItemDao dao;

	@RequestMapping(value = "/viewAllItems")
	public ModelAndView viewAllItems( ){
		ModelAndView modelAndView = new ModelAndView();
		List<Item> allItems = dao.getAllItems();
		modelAndView.setViewName("viewAllItems");
		modelAndView.addObject("all", allItems);
		return modelAndView;
		
	}
}
