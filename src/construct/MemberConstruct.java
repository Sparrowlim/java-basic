package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;
    //추가 생성자 오버로딩
    MemberConstruct(String name, int age) {
        this(name, age, 50); //변경
    }
    //생성자는 클래스 이름이 같아야 한다 반환타입은 없음
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출:" + name + " 나이:" + age + " 성적:" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
