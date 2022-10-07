package characters;

public class Hobbit extends Character {
    public Hobbit() {
        super(3,0);
    }

    @Override
    public void kick(Character whoKick) {
        System.out.println("\uD83E\uDD72\uD83E\uDD72\uD83E\uDD72");
    }
}