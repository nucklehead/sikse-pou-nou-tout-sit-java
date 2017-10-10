package com.aigleinfo.siksepounoutout.rest.controllers;

import com.aigleinfo.siksepounoutout.model.Event;
import com.aigleinfo.siksepounoutout.repository.EventRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/event")
@Api
public class EventController {
  @Autowired
  EventRepository eventRepository;

  @RequestMapping(method = RequestMethod.GET, path = "/")
  public List<Event> getEvents() {
    return eventRepository.findAll();
  }

  @RequestMapping(method = RequestMethod.POST, path = "/")
  public Event createEvent(Event event) {
    return eventRepository.save(event);
  }

  @RequestMapping(method = RequestMethod.GET, path = "/{eventID}")
  public Event getEventById(String eventID) {
    return eventRepository.findOne(eventID);
  }


  @RequestMapping(method = RequestMethod.PUT, path = "/{eventID}")
  public Event updateEvent(String eventID, Event event) {
    event.id = eventID;
    return eventRepository.save(event);
  }

  @RequestMapping(method = RequestMethod.DELETE, path = "/{eventID}")
  public void deleteEventById(String eventID) {
    eventRepository.delete(eventID);
  }
}
