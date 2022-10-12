package kick;

import characters.Character;

public class DedlyKick implements BasicKick{

    public void kick(Character whoKick, Character whoIsKicked) {
        if(whoIsKicked.getPower() > whoKick.getPower()){
            whoIsKicked.setPower(whoIsKicked.getPower()-1);
        }
        else{
            whoIsKicked.setHp(0);
        }
    }
}
