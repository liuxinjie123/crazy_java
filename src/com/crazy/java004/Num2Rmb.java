package com.crazy.java004;

import java.math.BigDecimal;

public class Num2Rmb {
    /**
     * 能处理数字上限，大于或等于此值不支持处理
     */
    private static final BigDecimal MAX_MONEY = BigDecimal.valueOf(10000000000000000.00);
    /**
     * 万亿
     */
    private static final Long TRILLIONS_UNIT = 1000000000000L;

    /**
     * 亿
     */
    private static final Long HUNDRED_MILLION_UNIT = 100000000L;

    /**
     * 万
     */
    private static final Long TEN_THOUSAND_UNIT = 10000L;

    public static void main(String[] args) {
        BigDecimal num = BigDecimal.valueOf(1051000000001110.00);
        String result = change(num);
        System.out.println("num=" + String.valueOf(num));
        System.out.println("result=" + result);
    }

    /**
     * 数字金额转换为金额大写
     */
    private static String change(BigDecimal num) {
        String result = "";
        num = num.setScale(2, BigDecimal.ROUND_DOWN);
        if (num.compareTo(MAX_MONEY) == 1) {
            return "the input num is too large.";
        }
        Long intValue = num.longValue();
        String fractionalPart = String.valueOf(num.subtract(BigDecimal.valueOf(intValue))).substring(2, 4);

        // 万亿
        int trillions = (int) (intValue / TRILLIONS_UNIT);
        if (trillions > 0) {
            result += num2Str(trillions) + "万亿";
        }

        // 亿
        intValue = intValue % TRILLIONS_UNIT;
        int hundredMillion = (int) (intValue / HUNDRED_MILLION_UNIT);
        if (hundredMillion > 0) {
            result += num2Str(hundredMillion) + "亿";
        } else {
            if (!result.equals("")) {
                result += "零";
            }
        }

        // 万
        intValue = intValue % HUNDRED_MILLION_UNIT;
        int tenThousand = (int) (intValue / TEN_THOUSAND_UNIT);
        if (tenThousand > 0) {
            result += num2Str(tenThousand) + "万";
        } else {
            if (!result.equals("") && !result.endsWith("零")) {
                result += "零";
            }
        }

        // 个
        intValue = intValue % TEN_THOUSAND_UNIT;
        if (intValue > 0) {
            result += num2Str(Math.toIntExact(intValue));
        }

        // 小数位
        result += "点";
        int intFractional1 = Integer.parseInt(fractionalPart.substring(0, 1));
        int intFractional2 = Integer.parseInt(fractionalPart.substring(1, 2));
        result += num2ChineseCharacter(intFractional1);
        result += num2ChineseCharacter(intFractional2);
        return result;
    }

    /**
     * 把数字变为大写字符串
     * 0-9999 之间
     */
    public static String num2Str(int num) {
        String result = "";
        // 千位
        int thousandUnit = num / 1000;
        if (thousandUnit > 0) {
            result += num2ChineseCharacter(thousandUnit) + "仟";
        }

        // 百位
        num = num % 1000;
        int hundredUnit = num / 100;
        if (hundredUnit > 0) {
            result += num2ChineseCharacter(hundredUnit) + "佰";
        } else {
            result += "零";
        }

        // 十位
        num = num % 100;
        int tenUnit = num / 10;
        if (tenUnit > 0) {
            result += num2ChineseCharacter(tenUnit) + "拾";
        } else {
            if (!result.endsWith("零")) {
                result += "零";
            }
        }

        // 个位
        num = num % 10;
        int theUnit = num;
        if (theUnit > 0) {
            result += num2ChineseCharacter(theUnit);
        } else {
            if (result.endsWith("零")) {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }

    /**
     * 0 -9 对应的汉字大写
     */
    public static String num2ChineseCharacter(int num) {
        switch (num) {
            case 0:
                return "零";
            case 1:
                return "壹";
            case 2:
                return "贰";
            case 3:
                return "叁";
            case 4:
                return "肆";
            case 5:
                return "伍";
            case 6:
                return "陆";
            case 7:
                return "柒";
            case 8:
                return "捌";
            case 9:
                return "玖";
            default:
                return "";
        }
    }
}
