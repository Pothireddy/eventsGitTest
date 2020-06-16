package com.java.githubeventsextractions.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.java.githubeventsextractions.modal.Event;

@Service
public class ExtractionService {

	public List<Event> getEvents(String owner, String repo) {
		RestTemplate restTemplate = new RestTemplate();
		String resourceUrl = "https://api.github.com/repos/" + owner + "/" + repo + "/events";
		Event[] response = restTemplate.getForObject(resourceUrl, Event[].class);
		List<Event> res = Arrays.asList(response);
		return res;
	}

	public List<Event> getEvent(String owner, String repo, String eventType) {
		RestTemplate restTemplate = new RestTemplate();
		String resourceUrl = "https://api.github.com/repos/" + owner + "/" + repo + "/events";
		Event[] response = restTemplate.getForObject(resourceUrl, Event[].class);
		List<Event> res = Arrays.asList(response);
		List<Event> filteredEventList = res.stream().filter(event -> event.getType().contains(eventType))
				.collect(Collectors.toList());
		return filteredEventList;
	}
}
