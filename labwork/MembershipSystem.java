package labwork;
import java.util.ArrayList;
public class MembershipSystem{
    private ArrayList<Member> members=new ArrayList<>();
    public void addMember(Member member){
        members.add(member);
    }
    public void removeMember(Member member){
        members.remove(member);
    }
    public ArrayList<Member> getMember(){
        return members;
    }
    public double getMonthlyMembershipRevenue(){
        double sum=0;
        int i=0;
        while(i<members.size()){
            sum+=members.get(i).calculateDiscountedFee(members.get(i).calculateMonthlyFee(members.get(i).getAge(),members.get(i).getMembershipType()),members.get(i).getVisits());
            i++;
        }
        System.out.println("Total monthly revenue:");
        return sum;
    }
}
