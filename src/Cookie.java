import edu.digipen.Game;
import edu.digipen.gameobject.GameObject;

import java.util.Random;

public class Cookie extends GameObject {

    int xDir;
    int yDir;

    public Cookie(){
        super("Cookie", 50, 50, "Cookie.png");
        Random rand = new Random();
        xDir = rand.nextInt() % 10;
        yDir = rand.nextInt() % 10;
    }
    @Override
    public void update(float dt){
        if(xDir == 0){
            xDir = 2;
        }
        if(yDir == 0) {
            yDir = 2;
        }
        setPosition(getPositionX() + xDir, getPositionY()+ yDir);

    }
}
