package oop1;
//절차 지향과 객체 지향의 차이
//음악플레이어 만들기 (음악플레이어를 만들어 보자)

import java.sql.SQLOutput;

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

//기존 방식인 절차지향으로 짜보자
public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volum = 0;
        boolean isOn = false;
        
        //음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
        //볼륨 증가
        volum++;
        System.out.println("음악 플레이어 볼륨:" + volum);
        //볼륨 증가
        volum++;
        System.out.println("음악 플레이어 볼륨:" + volum);
        //볼륨 감소
        volum--;
        System.out.println("음악 플레이어 볼륨:" + volum);
        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn){
            System.out.println("음악 플레이어 ON, 볼륨:" + volum);
        } else{
            System.out.println("음악 플레이어 OFF");
        }
        //음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
}
