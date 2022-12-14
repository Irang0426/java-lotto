package lotto;

import java.util.*;
import java.util.stream.Collectors;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
//        Collections.sort(numbers);
        numbers = numbers.stream().sorted().collect(Collectors.toList());
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) == numbers.get(i + 1)) {
                throw new IllegalArgumentException();
            }
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    // TODO: 추가 기능 구현
}
