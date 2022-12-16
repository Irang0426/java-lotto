package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class LottoList {
    private List<Lotto> lottoList;

    public LottoList() {
        lottoList = new ArrayList<>();
    }

    public void createRandomLottoList(int money) {
        for (int i = 0; i < money / 1000; i++) {
            Lotto lotto = new Lotto(Randoms.pickUniqueNumbersInRange(1, 45, 6));
            lottoList.add(lotto);
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < lottoList.size(); i++) {
            str += lottoList.get(i).getNumbers() + "\n";
        }
        return str;
    }
}
