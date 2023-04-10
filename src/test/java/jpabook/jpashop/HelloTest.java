package jpabook.jpashop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloTest {

    @Test
    void lombokTest() {
        //given
        String data = "data";
        Hello hello = new Hello();

        //when
        hello.setData(data);

        //then
        assertThat(hello.getData()).isEqualTo(data);
    }
}