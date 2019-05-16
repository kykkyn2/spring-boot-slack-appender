package com.qkrwjdgus.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sample {

    private Long messageQueueId;

    private String titleText;

    private String contentText;

    private String dataMap;
    private String sendStatus;
    private String receivers;


}
