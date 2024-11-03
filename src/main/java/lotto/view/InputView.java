package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static final int THOUSAND = 1000;
    public static final String ERROR_MESSAGE_PURCHASE_PRICE = "[ERROR] 구입 금액은 1000원 이상의 1000의 배수를 입력해주세요.";

    public int inputPurchasePrice(){
        while(true){
            Integer purchasePrice = validatePurchasePrice();
            if (purchasePrice != null) {
                return purchasePrice;
            }
        }
    }

    private static Integer validatePurchasePrice() {
        try{
            int purchasePrice = Integer.parseInt(Console.readLine());
            validatePriceRange(purchasePrice);
            return purchasePrice;

        } catch(IllegalArgumentException e){
            System.out.println(ERROR_MESSAGE_PURCHASE_PRICE);
        }
        return null;
    }

    private static void validatePriceRange(int purchasePrice) {
        if(purchasePrice <THOUSAND | purchasePrice %THOUSAND != 0){
            throw new IllegalArgumentException(ERROR_MESSAGE_PURCHASE_PRICE);
        }
    }
}
