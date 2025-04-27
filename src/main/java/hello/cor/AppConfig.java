package hello.cor;

import hello.cor.discount.DiscountPolicy;
import hello.cor.discount.FixDiscountPolicy;
import hello.cor.discount.RateDiscountPolicy;
import hello.cor.member.MemberService;
import hello.cor.member.MemberServiceImpl;
import hello.cor.member.MemoryMemberRepository;
import hello.cor.order.OrderService;
import hello.cor.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public static MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}
