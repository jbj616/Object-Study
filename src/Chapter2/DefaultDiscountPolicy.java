package Chapter2;

public abstract class DefaultDiscountPolicy implements DiscountPolicy{

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return null;
    }
}
