package lotto;

public class LottoApplication {
    private Consumer consumer;
    private WinningLotto winningLotto;

    public LottoApplication() {
        this.consumer = new Consumer();
        this.winningLotto = new WinningLotto();
    }

    public void run() {
        System.out.println("구입 금액을 입력해 주세요.");
        consumer.buyLotto();
        System.out.printf("%d개를 구매했습니다.\n", consumer.getMoney() / 1000);
        System.out.println(consumer.getLottoList().toString());
        System.out.println("당첨 번호를 입력해 주세요.");
        winningLotto.inputWinningNumber();
        System.out.println("보너스 번호를 입력해 주세요.");
        winningLotto.inputBonusNumber();
    }
}
