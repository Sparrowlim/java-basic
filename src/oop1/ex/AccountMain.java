package oop1.ex;
/**
 * 객체 지향 계좌
 * Account 클래스를 만들어라.
 * int balance 잔액
 * deposit(int amount) : 입금 메서드
 * 입금시 잔액이 증가
 * withdraw(int amount) : 츨금 메서드
 * 출금시 잔액이 감소
 * 만약 잔액이 부족하면 잔액 부족을 출력해야 한다
 * AccountMain 클래스를 만들고 main() 메서드를 통해 프로그램을 시작해라.
 * 계좌에 10000원을 입금해라
 * 계좌에서 9000원을 출금해라
 * 계좌에서 2000원을 출금 시도해라. -> 잔액 부족 출력을 확인해라
 * 잔고를 출력해라. 잔고: 1000
 * */
public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        System.out.println("잔고:" + account.balance);
    }
}
