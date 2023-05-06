package com.likelion.beshop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="cart")
@Getter @Setter
@ToString
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cart_id")
    private  Long id;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "member_id")//외래키명 member_id
    private  Member member;



}



