package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;

@Transactional
@SpringBootTest
class MemberServiceTest {

    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;

    @Test
    void 회원가입() {
        //g
        Member member = new Member();
        member.setName("kim");

        //w
        Long savedId = memberService.join(member);

        //t
        assertThat(memberService.findOne(savedId)).isEqualTo(member);
    }

    @Test
    void 중복_회원_예외() {
        //g
        Member member1 = new Member();
        member1.setName("kim");

        Member member2 = new Member();
        member2.setName("kim");

        //w
        memberService.join(member1);

        //t
        assertThatThrownBy(() -> memberService.join(member2));
    }
}