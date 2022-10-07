package characters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Character {
    @Getter
    private int hp;
    @Getter @Setter
    private int power;

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public abstract void kick(Character whoKick);

    public boolean isAlive() {
        return getHp() > 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
