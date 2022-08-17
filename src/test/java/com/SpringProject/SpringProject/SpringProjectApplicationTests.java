package com.SpringProject.SpringProject;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class SpringProjectApplicationTests {
  
  @Autowired
  private MockMvc mvc;
  
  @Autowired
  private TestRestTemplate template;


	
    @Test
    public void getAudioJSON() throws Exception {
      mvc.perform(MockMvcRequestBuilders.get("/AudioStorage").accept(MediaType.APPLICATION_JSON))
          .andExpect(status().isOk())
          .andExpect(content().string(equalTo("no audio command json file found.")));
    }

}
