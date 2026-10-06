package service;

import java.util.Random;

public class SorteiaEvento {

    int bound;

    public int sorteioEvento(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }
}