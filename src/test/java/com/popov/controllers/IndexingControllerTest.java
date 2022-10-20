package com.popov.controllers;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class IndexingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private IndexingController indexingController;

    @Test
    void startIndexingAll() {
        try {
            this.mockMvc.perform(get("/api/startIndexing").header("Authorization", "Basic YWRtaW46UXdlcnR5MjI="))
                    .andDo(print())
                    .andExpect(content().string(containsString("")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void stopIndexingAll() {
        try {
            this.mockMvc.perform(get("/api/stopIndexing").header("Authorization", "Basic YWRtaW46UXdlcnR5MjI="))
                    .andDo(print())
                    .andExpect(content().string(containsString("")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void startIndexingOne() {
        try {
            this.mockMvc.perform(post("/api/indexPage")
                            .param("url", "http://localhost:8080/test")
                            .header("Authorization", "Basic YWRtaW46UXdlcnR5MjI="))
                    .andDo(print())
                    .andExpect(content().string(containsString("")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}