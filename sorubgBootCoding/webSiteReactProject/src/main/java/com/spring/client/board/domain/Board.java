package com.spring.client.board.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
@Entity
@Table(name="boot_board")
@SequenceGenerator(
        name = "boot_board_generator",
        sequernceName = "boot_board_seq",
        initialValue = 1,
        allocationSize = 1)

public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "boot_board_generator")
    private Long no;

    @Column(length = 15, nullable = false)
    private String name;

    @Column(numllable = false)
    private String title;

    @Lob
    @Column(nullable = false)
    private String content;

    @CreationTimestamp
    @ColumnDefault(value = "sysdate")
    private LocalDateTime regDate;

    @ColumnDefault(value = "0")
    private Integer hit = 0;
}
