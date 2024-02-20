package hello.core.discount;

import hello.core.member.Member;
import hello.core.member.MemberService;

public interface DiscountPolicy {
    /**
     *
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
