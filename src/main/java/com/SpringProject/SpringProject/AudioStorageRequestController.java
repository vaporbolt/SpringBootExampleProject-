package com.SpringProject.SpringProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AudioStorageRequestController {

  @GetMapping("/AudioStorage")
  public String index() {
      return "audio storage json!";
  }

  
}
