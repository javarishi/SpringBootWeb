package com.h2kinfosys.learn;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.h2kinfosys.learn.dao.ActorDAO;
import com.h2kinfosys.learn.dto.Actor;

@Controller
public class ActorController {
	
	@Autowired
	ActorDAO actorDAO;

	@RequestMapping("/getActor")
	public String getActor() {
		return "actor";
	}
	
	@RequestMapping("/addActor")
	public ModelAndView addActor(Actor actor) {
		ModelAndView mv = new ModelAndView();
		Actor savedActor = null;
		if(actor != null) {
			actor.setLastUpdate(new Date());
			savedActor = actorDAO.save(actor);
			System.out.println(savedActor);
		}
		mv.addObject("actor", savedActor);
		mv.setViewName("hello");
		return mv;
	}
}
