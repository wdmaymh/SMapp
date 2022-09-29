package com.sm.work.sutffSize;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StuffSizeTest {

    @Test
    public void builer(){
        StuffSize size = StuffSize.builder().length(80).waist(50).build();

        assertThat(size).isNotNull();


    }


}