package com.springboot.demoBoot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.demoBoot.Dao.HomeRepository;
import com.springboot.demoBoot.Model.Alien;

@Controller

public class HomeController {
	
	@Autowired
	HomeRepository repo;
	
	@RequestMapping("/")
	public String show()
	{
		return "login.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "login.jsp";
	}

}
