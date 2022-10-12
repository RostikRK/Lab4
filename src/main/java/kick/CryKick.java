package kick;

import characters.Character;

public class CryKick implements BasicKick{
    @Override
    public void kick(Character whoKick, Character whoIsKicked){
        System.out.println("Плак Плак Плак");
    }
}
