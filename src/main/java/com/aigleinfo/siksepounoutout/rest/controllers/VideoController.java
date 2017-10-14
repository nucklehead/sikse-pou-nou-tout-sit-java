package com.aigleinfo.siksepounoutout.rest.controllers;

import com.aigleinfo.siksepounoutout.model.Video;
import com.aigleinfo.siksepounoutout.repository.VideoRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/video")
@Api
public class VideoController {
  @Autowired
  VideoRepository videoRepository;

  @RequestMapping(method = RequestMethod.GET, path = "")
  public List<Video> getVideos() {
    return videoRepository.findAll();
  }

  @RequestMapping(method = RequestMethod.POST, path = "")
  public Video createVideo(@RequestBody Video video) {
    return videoRepository.save(video);
  }

  @RequestMapping(method = RequestMethod.GET, path = "/{videoID}")
  public Video getVideoById(@PathVariable String videoID) {
    return videoRepository.findOne(videoID);
  }


  @RequestMapping(method = RequestMethod.PUT, path = "/{videoID}")
  public Video updateVideo(@PathVariable String videoID, @RequestBody Video video) {
    video.id = videoID;
    return videoRepository.save(video);
  }

  @RequestMapping(method = RequestMethod.DELETE, path = "/{videoID}")
  public void deleteVideoById(@PathVariable String videoID) {
    videoRepository.delete(videoID);
  }
}
