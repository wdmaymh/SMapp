package com.sm.work.sutffSize;

import lombok.*;

@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor @EqualsAndHashCode(of="id")
public class StuffSize {
    private Integer id;
    private float waist;
    private float length;
}
