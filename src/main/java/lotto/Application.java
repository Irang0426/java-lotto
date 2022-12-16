package lotto;

public class Application {
    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        System.out.println("구입 금액을 입력해주세요.");
        consumer.buyLotto();
        System.out.printf("%d개를 구매했습니다.", consumer.getMoney() / 1000);
        System.out.println(consumer.getLottoList().toString());
    }
}
