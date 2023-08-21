package labwork;
public class Demo{
    public static void main(String[] args){
        Member member1=new Member("Ege",18,MembershipType.VIP,15);
        Member member2=new Member("Enes",36,MembershipType.PREMIUM,5);
        Member member3=new Member("Ayça",54,MembershipType.STANDARD,3);
        Member member4=new Member("Ali",72,MembershipType.VIP,36);
        Member member5=new Member("Eren",90,MembershipType.VIP,11);
        System.out.println("Membership's Monthly Fees:");
        System.out.println(member1.calculateMonthlyFee(member1.getAge(),member1.getMembershipType()));
        System.out.println(member2.calculateMonthlyFee(member2.getAge(),member2.getMembershipType()));
        System.out.println(member3.calculateMonthlyFee(member3.getAge(),member3.getMembershipType()));
        System.out.println(member4.calculateMonthlyFee(member4.getAge(),member4.getMembershipType()));
        System.out.println(member5.calculateMonthlyFee(member5.getAge(),member5.getMembershipType()));
        System.out.println(" ");
        System.out.println("Membership's Discounted Fees:");
        System.out.println(member1.calculateDiscountedFee(member1.calculateMonthlyFee(member1.getAge(),member1.getMembershipType()),member1.getVisits()));
        System.out.println(member2.calculateDiscountedFee(member2.calculateMonthlyFee(member2.getAge(),member2.getMembershipType()),member2.getVisits()));
        System.out.println(member3.calculateDiscountedFee(member3.calculateMonthlyFee(member3.getAge(),member3.getMembershipType()),member3.getVisits()));
        System.out.println(member4.calculateDiscountedFee(member4.calculateMonthlyFee(member4.getAge(),member4.getMembershipType()),member4.getVisits()));
        System.out.println(member5.calculateDiscountedFee(member5.calculateMonthlyFee(member5.getAge(),member5.getMembershipType()),member5.getVisits()));
        MembershipSystem system = new MembershipSystem();
        system.addMember(member1);
        system.addMember(member2);
        system.addMember(member3);
        system.addMember(member4);
        system.addMember(member5);
        system.removeMember(member4);
        System.out.println(" ");
        System.out.println("Member4 was removed");
        System.out.println(" ");
        System.out.println(system.getMember());
        System.out.println(system.getMonthlyMembershipRevenue());
    }
}