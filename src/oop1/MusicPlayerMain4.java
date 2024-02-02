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

//기능과 데이터가 모여있는 MusicPlayer를 사용하자
//MusicPlayer를 변경해도 쓰는 쪽에서는 변경할 필요가 없음(메서드이름 교체는 제외)
public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        //음악 플레이어 켜기
        player.on();
        //볼륨 증가
        player.volumeUp();
        //볼륨 증가
        player.volumeUp();
        //볼륨 감소
        player.volumeDown();
        //음악 플레이어 상태
        player.showStatus();
        //음악 플레이어 끄기
        player.off();
    }

}
