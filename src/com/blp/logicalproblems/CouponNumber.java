package com.blp.logicalproblems;
import java.security.SecureRandom;
import java.util.Random;

public class CouponNumber {
    public static void main(String[] args) {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max = 100000000;
        int random = (int) (Math.random() * max);
        StringBuffer sb = new StringBuffer();

        while (random > 0) {
            sb.append(chars[random % chars.length]);
            random = random/chars.length;
        }

        String couponCode = sb.toString();
        System.out.println("Coupon Code: " + couponCode);
    }
}
