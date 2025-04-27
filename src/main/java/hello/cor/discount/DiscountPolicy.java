package hello.cor.discount;

import hello.cor.member.Member;
import org.springframework.core.annotation.Order;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
