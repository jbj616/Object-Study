package Chapter2;

import java.time.Duration;

public class Movie {
    private String title; //제목
    private Duration runningTime; //상영시간
    private Money fee;
    private DiscountPolicy discountPolicy; //할인 정책

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee(){
        return fee;
    }

    public void changeDiscountPolicy(DiscountPolicy discountPolicy){
        this.discountPolicy = discountPolicy;
    }

    public Money calculateMovieFee(Screening screening){
        if(discountPolicy == null){
            return fee;
        }

        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
