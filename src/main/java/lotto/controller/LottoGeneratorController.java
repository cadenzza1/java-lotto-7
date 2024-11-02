package lotto.controller;

import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoGeneratorController {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void run(){
        outputView.requestPurchasePrice();
        inputView.inputPurchasePrice();
    }
}
