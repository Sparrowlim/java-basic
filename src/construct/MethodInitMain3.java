package construct;
/**
 * 초기화는 간단해 졌으나 속성과 기능이 분리되어 있음
 */
public class MethodInitMain3 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("철수", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("진조", 26, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit member : members) {
            System.out.println("이름:" + member.name + " 나이:" + member.age + " 성적:" + member.grade);
        }
    }

}
