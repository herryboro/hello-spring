package practice;

import hello.hellospring.domain.Member;

import java.util.HashMap;
import java.util.Map;

public class practice {
    public static void main(String[] args) {
        Member member1 = new Member();
        member1.setId(1L);
        member1.setName("이순신");

        Map<Long, Member> map = new HashMap<>();
        map.put(1L, member1);
        System.out.println(map.get(1L));
    }
}
