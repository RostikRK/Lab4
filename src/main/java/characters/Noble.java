package characters;

import kick.NobleKick;

import java.util.Random;

public abstract class Noble extends Character {
    private static final Random randomGenerator = new Random();

    public Noble(int min, int max) {
        super(randomGenerator.nextInt(max-min+1)+min, randomGenerator.nextInt(max-min+1)+min, new NobleKick());
    }
}
