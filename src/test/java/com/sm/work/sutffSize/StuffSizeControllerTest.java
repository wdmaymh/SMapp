package com.sm.work.sutffSize;


import com.sm.work.common.BaseControllerTest;
import org.junit.jupiter.api.Test;
import org.springframework.hateoas.MediaTypes;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class StuffSizeControllerTest extends BaseControllerTest {

    @Test
    public void createStuffSize() throws Exception {
        mockMvc.perform(get("/api/stuffSize/")
                                //.contentType(MediaType.APPLICATION_JSON)
                                //.accept(MediaTypes.HAL_JSON)
                        //.content(objectMapper.writeValueAsString(billMaster))
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("hello"))
        ;
    }




}