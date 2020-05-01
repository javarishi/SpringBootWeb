package com.h2kinfosys.learn;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		mv.setViewName("actor");
		return mv;
	}
	
	@RequestMapping("/searchActor")
	public ModelAndView searchActor(@RequestParam("actorId") int actorId) {
		ModelAndView mv = new ModelAndView();
		Actor actor = null;
		actor = actorDAO.findById(actorId).orElse(null);
		System.out.println(actor);
		
		mv.addObject("actor", actor);
		mv.setViewName("actor");
		return mv;
	}
	
	@RequestMapping("/searchActorByFirstName")
	public ModelAndView searchActorByFirstName(@RequestParam("firstName") String firstName) {
		ModelAndView mv = new ModelAndView();
		Actor actor = null;
		List<Actor> actors = actorDAO.findByFirstName(firstName);
		System.out.println(actors);
		
		mv.addObject("actor", actors);
		mv.setViewName("actor");
		return mv;
	}
	
	
	
}
