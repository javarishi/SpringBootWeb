package com.h2kinfosys.learn;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.h2kinfosys.learn.dao.ActorDAO;
import com.h2kinfosys.learn.dto.Actor;

@Controller
public class ActorRestController {

	@Autowired
	ActorDAO actorDAO;
	
	@RequestMapping("actors")
	@ResponseBody
	public List<Actor> getActors() {
		return actorDAO.findAll();
	}
	
	@RequestMapping("/actor/{id}")
	@ResponseBody
	public Optional<Actor> getActorsById(@PathVariable("id") String actorId) {
		System.out.println("Check ID :: " + actorId);
		return actorDAO.findById(Integer.parseInt(actorId));
	}
	
	
	
	
}
