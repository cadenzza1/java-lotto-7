package lotto;

import lotto.controller.LottoGeneratorController;

public class Application {
    public static void main(String[] args) {
        LottoGeneratorController controller = new LottoGeneratorController();

        controller.run();
    }
}
