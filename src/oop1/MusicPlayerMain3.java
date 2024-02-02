package oop1;
// 절차 지향과 객체 지향의 차이
//음악플레이어 만들기 (음악플레이어를 만들어 보자)

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
//현재 중복되는 코드가 많음 - 메서드 추출
//MusicPalyerData라는 객체를 만들어 객체지향으로 점차 바꿔보자
public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //음악 플레이어 켜기
        on(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 감소
        volumeDown(data);
        //음악 플레이어 상태
        showStatus(data);
        //음악 플레이어 끄기
        off(data);
    }
    // 각각의 기능들을 모듈화 함(문제 수정의 용의, 코드이해도 증가)
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }
    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
