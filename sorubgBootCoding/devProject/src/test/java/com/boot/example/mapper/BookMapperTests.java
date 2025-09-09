package com.boot.example.mapper;

import com.boot.example.domain.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class BookMapperTests {
    @Autowired
    private BookMapper bookMapper;

    @Test
    public void bookListTest(){
        bookMapper.bookList().stream().forEach((book -> log.info(book.toString())));
    }

    @Test
    public void testBookInsert() {
        Book book = Book.builder()
                .title("1")
                .author("1")
                .publishDate("1")
                .price(19500).build();
        int result = bookMapper.bookInsert(book);
        log.info("적용된 행의 수: {}", result);
    }

    @Test
    public void testBookDelete() {
        Book book = Book.builder().bookId(26).build();
        int result = bookMapper.bookDelete(book);
        log.info("삭제된 행의 수: {}", result);
    }
}
