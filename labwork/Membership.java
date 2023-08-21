package labwork;
public interface Membership {
    public double calculateMonthlyFee(int age, MembershipType membershipType);

    public double calculateDiscountedFee(double baseFee, int visits);
}
