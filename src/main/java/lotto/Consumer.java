package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.InputMismatchException;

public class Consumer {
    private int money;
    private LottoList lottoList;;

    public Consumer() {
        lottoList = new LottoList();
    }

    public int getMoney() {
        return money;
    }

    public void buyLotto() {
        money = Integer.parseInt(Console.readLine());
        if (money < 1000 || money % 1000 != 0) {
            throw new InputMismatchException();
        }
        lottoList.createRandomLottoList(money);
    }

    public LottoList getLottoList() {
        return lottoList;
    }
}
