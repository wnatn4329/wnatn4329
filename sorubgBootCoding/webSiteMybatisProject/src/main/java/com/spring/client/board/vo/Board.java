package com.spring.client.board.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                       // 클래스들에 필요한 어노테이션 자동생성
@AllArgsConstructor         // 클래스에 있는 모든 필드를 순서대로 매개변수로 받는 생성자를 생성
@NoArgsConstructor          // 개변수를 받지 않는 빈 생성자를 자동 생성
public class Board {
    private int boardNumber;
    private String boardName;
    private String boardTitle;
    private String boardContent;
    private String boardDate;
    private String boardPasswd;
    private int boardReadcnt;
}
