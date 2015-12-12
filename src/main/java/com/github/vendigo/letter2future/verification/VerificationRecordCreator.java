package com.github.vendigo.letter2future.verification;

import com.github.vendigo.letter2future.user.User;

import java.util.Random;

public class VerificationRecordCreator {

    private static Random rand = new Random();
    private static int BOUND = 10_000_000;
    private static int MIN_VALUE = 1_000_000;

    public static VerificationRecord createVerificationRecord(User user) {
        return new VerificationRecord(user, generateCode());
    }

    private static String generateCode() {
        return "" + (rand.nextInt(BOUND - MIN_VALUE) + MIN_VALUE);
    }
}