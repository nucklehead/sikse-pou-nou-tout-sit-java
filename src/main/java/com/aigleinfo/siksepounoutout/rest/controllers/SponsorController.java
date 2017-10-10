package com.aigleinfo.siksepounoutout.rest.controllers;

import com.aigleinfo.siksepounoutout.model.Sponsor;
import com.aigleinfo.siksepounoutout.repository.SponsorRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sponsor")
@Api
public class SponsorController {
  @Autowired
  SponsorRepository sponsorRepository;

  @RequestMapping(method = RequestMethod.GET, path = "/")
  public List<Sponsor> getSponsors() {
    return sponsorRepository.findAll();
  }

  @RequestMapping(method = RequestMethod.POST, path = "/")
  public Sponsor createSponsor(Sponsor sponsor) {
    return sponsorRepository.save(sponsor);
  }

  @RequestMapping(method = RequestMethod.GET, path = "/{sponsorID}")
  public Sponsor getSponsorById(String sponsorID) {
    return sponsorRepository.findOne(sponsorID);
  }


  @RequestMapping(method = RequestMethod.PUT, path = "/{sponsorID}")
  public Sponsor updateSponsor(String sponsorID, Sponsor sponsor) {
    sponsor.id = sponsorID;
    return sponsorRepository.save(sponsor);
  }

  @RequestMapping(method = RequestMethod.DELETE, path = "/{sponsorID}")
  public void deleteSponsorById(String sponsorID) {
    sponsorRepository.delete(sponsorID);
  }
}
