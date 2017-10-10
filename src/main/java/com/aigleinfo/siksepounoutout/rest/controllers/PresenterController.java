package com.aigleinfo.siksepounoutout.rest.controllers;

import com.aigleinfo.siksepounoutout.model.Presenter;
import com.aigleinfo.siksepounoutout.repository.PresenterRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/presenter")
@Api
public class PresenterController {
  @Autowired
  PresenterRepository presenterRepository;

  @RequestMapping(method = RequestMethod.GET, path = "/")
  public List<Presenter> getPresenters() {
    return presenterRepository.findAll();
  }

  @RequestMapping(method = RequestMethod.POST, path = "/")
  public Presenter createPresenter(Presenter presenter) {
    return presenterRepository.save(presenter);
  }

  @RequestMapping(method = RequestMethod.GET, path = "/{presenterID}")
  public Presenter getPresenterById(String presenterID) {
    return presenterRepository.findOne(presenterID);
  }


  @RequestMapping(method = RequestMethod.PUT, path = "/{presenterID}")
  public Presenter updatePresenter(String presenterID, Presenter presenter) {
    presenter.id = presenterID;
    return presenterRepository.save(presenter);
  }

  @RequestMapping(method = RequestMethod.DELETE, path = "/{presenterID}")
  public void deletePresenterById(String presenterID) {
    presenterRepository.delete(presenterID);
  }
}
