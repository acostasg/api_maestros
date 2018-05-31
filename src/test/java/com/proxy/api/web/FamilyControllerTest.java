package com.proxy.api.web;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
public class FamilyControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void familiaAction() throws Exception {
        this.mvc.perform(get("/familia/")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
