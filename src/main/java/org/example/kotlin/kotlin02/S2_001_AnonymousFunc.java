package org.example.kotlin.kotlin02;

import java.util.Random;

public class S2_001_AnonymousFunc {

    public static void main(String[] args) {
        showOnBoard("牙膏", new MyDiscountWords());

        showOnBoard("牙膏", new DiscountWords() {
            @Override
            public String getDiscountWords(String goodsName, int hour) {
                int currentYear = 2027;
                return String.format("%d年，双11%s促销倒计时：%d 小时", currentYear, goodsName, hour);
            }
        });

        showOnBoard("牙膏", (goodsName, hour) -> {
            int currentYear = 2027;
            return String.format("%d年，双11%s促销倒计时：%d 小时", currentYear, goodsName, hour);
        });
    }

    public interface DiscountWords {
        String getDiscountWords(String goodsName, int hour);
    }

    public static void showOnBoard(String goodsName, DiscountWords discountWords) {
        int hour = new Random().nextInt(24);
        System.out.println(discountWords.getDiscountWords(goodsName, hour));
    }

    static class MyDiscountWords implements DiscountWords {
        @Override
        public String getDiscountWords(String goodsName, int hour) {
            int currentYear = 2027;
            return String.format("%d年，双11%s促销倒计时：%d 小时", currentYear, goodsName, hour);
        }
    }

}
