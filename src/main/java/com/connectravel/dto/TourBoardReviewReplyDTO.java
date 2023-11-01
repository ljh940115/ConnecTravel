package com.connectravel.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TourBoardReviewReplyDTO {

    private Long tbrrno;
    private String text;
    private String replyer;
    private Long tbrno;
    private LocalDateTime regDate, modDate;

}
