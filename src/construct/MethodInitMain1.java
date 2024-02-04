package construct;
/**
 * 매번 초기화를 해야하는 번거로움이 존재
 * */
public class MethodInitMain1 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.name = "철수";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        member2.name = "진조";
        member2.age = 26;
        member2.grade = 80;

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름:" + member.name + " 나이:" + member.age + " 성적:" + member.grade);
        }
    }
}
