package hello.cor.order;

import hello.cor.discount.DiscountPolicy;
import hello.cor.discount.FixDiscountPolicy;
import hello.cor.member.Member;
import hello.cor.member.MemberRepository;
import hello.cor.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
