package com.rohan.restapis.pojo;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@Builder
public class CustomObject {
    private Orders[] orders;

    public CustomObject(Orders[] orders) {
        this.orders = orders;
    }
}
