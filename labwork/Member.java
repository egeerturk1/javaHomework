package labwork;
public class Member implements Membership {
    private String name;
    private int age;
    private MembershipType membershipType;
    private int visits;

    public Member(String name, int age, MembershipType membershipType, int visits) {
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
        this.visits = visits;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public MembershipType getMembershipType() {
        return membershipType;
    }

    public int getVisits() {
        return visits;
    }

    @Override
    public double calculateMonthlyFee(int age, MembershipType membershipType) {
        if (membershipType == MembershipType.STANDARD) {
            if (age < 60)
                return 50;
            if (age >= 60)
                return 30;
        } else if (membershipType == MembershipType.PREMIUM) {
            if (age < 60)
                return 80;
            if (age >= 60)
                return 60;
        }
        return 150;
    }

    @Override
    public double calculateDiscountedFee(double baseFee, int visits){
        if(visits<=4&visits>=0)
            return baseFee;
        else if(visits<=9&visits>=5){
            baseFee-=(baseFee*5)/100;
            return baseFee;
        }
        else if(visits<=14&visits>=10){
            baseFee-=(baseFee*10)/100;
            return baseFee;
        }
        baseFee-=(baseFee*15)/100;
        return baseFee;
    }
    @Override
    public String toString() {
        return "\n"+ "Member:" + "\n" +
                "Name of member=" + name + "\n" +
                "Age of member=" + age + "\n" +
                "Type of membership=" + membershipType + "\n" +
                "Visits for month=" + visits +"\n"+
                "===============";
    }
}


