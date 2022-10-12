package characters;

import kick.BasicKick;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Character {
    @Getter
    private int hp;
    @Getter @Setter
    private int power;

    private BasicKick kickInter;
    public void kick(Character enemy) {
        kickInter.kick(this, enemy);
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

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
