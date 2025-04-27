package hello.cor;

import hello.cor.member.Grade;
import hello.cor.member.Member;
import hello.cor.member.MemberService;
import hello.cor.member.MemberServiceImpl;
import hello.cor.order.Order;
import hello.cor.order.OrderService;
import hello.cor.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = " + order);
        System.out.println("order.calculatePrice() = " + order.calculatePrice());

    }
}
