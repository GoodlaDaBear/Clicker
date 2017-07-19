import edu.digipen.gameobject.GameObject;

import java.util.Random;

public class Cookie extends GameObject {

    int xDir;
    int yDir;

    public Cookie(int count){
        super("Cookie", 50, 50, "Cookie.png");
        if(count%1000 == 0){
            System.out.println(count + ":C");
            setScale(3,3);
        }else if(count%100 == 0)
        {
            System.out.println(count + ":A");
            setScale(2, 2);
        }else{
            System.out.println("B");
            setScale(1,1);
        }
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
