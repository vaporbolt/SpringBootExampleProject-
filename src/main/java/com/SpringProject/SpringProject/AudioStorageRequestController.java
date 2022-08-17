package com.SpringProject.SpringProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AudioStorageRequestController {

  @GetMapping("/AudioStorage")
  public String index() {
    
    String jsonTxt = "no audio command json file found.";
    
    JSONParser parser = new JSONParser();

    try {
      File file = new File("VoiceCommands.json");
      InputStream is = new FileInputStream(file);
      jsonTxt = IOUtils.toString( is );
      //Object obj = parser.parse(new FileReader("DiscordAudioStreamer/config.json"));
    }

    catch (Exception e) {
      e.printStackTrace();
    }

    return jsonTxt;
    
 
  }
  

  
}
