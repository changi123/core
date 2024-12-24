package hello.core.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberServiceTest {



    MemberService memberService = new MemberServiceImpl();
    @Test
    void join(){
        // given

        Member member = new Member(1L, "memberA",Grade.VIP);

        // when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);


        // then
        System.out.println(findMember.toString());
        
    }
}