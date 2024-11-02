package lotto;

import camp.nextstep.edu.missionutils.Console;

public class Validatior {
    public static final int THOUSAND = 1000;

    public static int purchasePriceValidator(){
        while(true){
            try{
                int purchasePrice = Integer.parseInt(Console.readLine());
                if(purchasePrice<THOUSAND | purchasePrice%THOUSAND != 0){
                    throw new IllegalArgumentException("[ERROR] 구입 금액은 1000원 이상의 1000의 배수를 입력해주세요.");
                }

                return purchasePrice;

            } catch(IllegalArgumentException e){
                System.out.println("[ERROR] 구입 금액은 1000원 이상의 1000의 배수를 입력해주세요.");
            }
        }
    }
}
