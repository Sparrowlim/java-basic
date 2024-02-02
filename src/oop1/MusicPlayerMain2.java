package oop1;
// 절차 지향과 객체 지향의 차이
//ToDO 음악플레이어 만들기 (음악플레이어를 만들어 보자)

/**
 * 요구사항:
 * 1.음악 플레이어를 켜고 끌 수 있어야 한다.
 * 2.음악 플레이어의 볼륨을 증가, 감소할 수 있어야 한다.
 * 3.음악 플레이어의 상태를 확인할 수 있어야 한다.
 *
 * 예시출력:
 * 음악 플레이어를 시작합니다
 * 음악 플레이어 볼륨:1
 * 음악 플레이어 볼륨:2
 * 음악 플레이어 볼륨:1
 * 음악 플레이어 상태 확인
 * 음악 플레이어 ON, 볼륨:1
 * 음악 플레이어를 종료합니다
 * */

//MusicPalyerData라는 객체를 만들어 객체지향으로 점차 바꿔보자
public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
        //볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
        //볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
        //볼륨 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else{
            System.out.println("음악 플레이어 OFF");
        }
        //음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
}
