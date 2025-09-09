package com.spring.client.board.controller;

import com.spring.client.board.service.BoardService;
import com.spring.client.board.vo.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")       //기본 URL
@RequiredArgsConstructor        //final 키워드와  @NonNull 필드에 대한 생성자를 자동 생성
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/boardList")       //실제 URL
    public String boardList(@ModelAttribue Board board, Model model) {  //검색조건->데이터처리->Model에 담기->화면 출력
        List<Board> boardList = boardService.boardList(board);
        //결과저장      변수이름     서비스요청      검색조건
        model.addAttribute("boardList", boardList);
        return "client/board/boardList";
    }
}