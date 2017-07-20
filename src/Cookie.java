import edu.digipen.gameobject.GameObject;

import java.util.Random;

public class Cookie extends GameObject {

    int xDir;
    int yDir;
    int Count;

    public Cookie(int count){
        super("Cookie", 50, 50, "Cookie.png");
        Count = count;
        if(count%10000 == 0){
            setScale(4, 4);
        } else if(count%1000 == 0){
            setScale(2,2);
            setModulationColor(0, 0, 0, 0.5F);
        }else if(count%100 == 0)
        {
            setScale(2, 2);
        }else{
            setScale(1,1);
        }
        Random rand = new Random();
        xDir = rand.nextInt() % 10;
        yDir = rand.nextInt() % 10;
    }
    float counter = 0;

    @Override
    public void update(float dt){
        counter += dt * 5;
        if(xDir == 0){
            xDir = 2;
        }
        if(yDir == 0) {
            yDir = 2;
        }
        //hi
        setPosition(getPositionX() + xDir, getPositionY()+ yDir);

        if(Count%1000 == 0) {

            setModulationColor((float)Math.cos(counter), (float)Math.sin(counter), 1.0f - ((float)Math.cos(counter) + (float)Math.sin(counter)), 0.5F);
        }
        if(Count%10000 == 0){
            setModulationColor(0, 0, 0, 0);
        }
    }
}
