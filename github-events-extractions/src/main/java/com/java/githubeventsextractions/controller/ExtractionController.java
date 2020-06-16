package com.java.githubeventsextractions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.githubeventsextractions.modal.Event;
import com.java.githubeventsextractions.service.ExtractionService;

@RestController
@CrossOrigin
@RequestMapping(value = "/")
public class ExtractionController {
	@Autowired
	ExtractionService service;

	@GetMapping(value = "/{owner}/{repo}/events", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Event> getEvents(@PathVariable("owner") String owner, @PathVariable("repo") String repo) {
		return service.getEvents(owner, repo);
	}

	@GetMapping(value = "/{owner}/{repo}/{eventType}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Event> getEvents(@PathVariable("owner") String owner, @PathVariable("repo") String repo,
			@PathVariable("eventType") String eventType) {
		return service.getEvent(owner, repo, eventType);
	}
}
