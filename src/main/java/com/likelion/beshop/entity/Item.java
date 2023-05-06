package com.likelion.beshop.entity;

import com.likelion.beshop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="item")
@Getter
@Setter
public class Item {
    @Id
    @Column(name = "item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;//상품 코드
    @Column(unique = true)
    private String name;
    private int num;
    private String detail;
    @Enumerated(EnumType.STRING)
    private ItemSellStatus sellStatus;

    private int price;

    private LocalDateTime registerTime;
    private LocalDateTime updateTime;


}
