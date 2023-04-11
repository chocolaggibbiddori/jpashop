package jpabook.jpashop.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
//@Entity
public class Member {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
}
