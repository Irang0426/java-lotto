package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.InputMismatchException;

import static lotto.Strings.BUY_LOTTO;

public class Consumer {
    private int count;
    private LottoList lottoList;;

    public Consumer() {
        lottoList = new LottoList();
    }

    public void buyLotto() {
        int money = Integer.parseInt(Console.readLine());   // 예외 처리
        validate(money);
        count = money / 1000;
        lottoList.createRandomLottoList(count);
        System.out.printf(BUY_LOTTO, count);
    }

    private void validate(int money) {
        if (money < 1000 || money % 1000 != 0) {
            throw new InputMismatchException();
        }
    }

    public LottoList getLottoList() {
        return lottoList;
    }
}
