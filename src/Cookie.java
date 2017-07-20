import edu.digipen.gameobject.GameObject;

import java.util.Random;

public class Cookie extends GameObject {

    int xDir;
    int yDir;
    long Count;
    long Cookies;

    public Cookie(long cookies){
        super("Cookie", 50, 50, "Cookie.png");
        Cookies = CookieButton.cookies;
        if(CookieButton.cookies%1000000 <= CookieButton.change&& CookieButton.cookies != 1 ){
            setScale(16, 16);
        }else if(CookieButton.cookies%100000 <= CookieButton.change&& CookieButton.cookies != 1 ){
            setScale(6, 6);
        }else if(CookieButton.cookies%10000 <= CookieButton.change&& CookieButton.cookies != 1 ){
            setScale(4, 4);
        } else if(CookieButton.cookies%1000 <= CookieButton.change&& CookieButton.cookies != 1){
            setScale(2, 2);
            setModulationColor(0, 0, 0, 0.5F);
        }else if(CookieButton.cookies%100 <= CookieButton.change&& CookieButton.cookies != 1)
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
        setPosition(getPositionX() + xDir, getPositionY()+ yDir);

        if(CookieButton.cookies%1000 <= CookieButton.change&& CookieButton.cookies != 1 ) {

            setModulationColor((float)Math.cos(counter), (float)Math.sin(counter), 1.0f - ((float)Math.cos(counter) + (float)Math.sin(counter)), 0.5F);
        }
        if(CookieButton.cookies%10000 <= CookieButton.change&& CookieButton.cookies != 1 ) {
            setModulationColor((float)Math.cos(counter), (float)Math.sin(counter), 1.0f - ((float)Math.cos(counter) + (float)Math.sin(counter)), 0.5F);
        }
        if(CookieButton.cookies%100000 <= CookieButton.change && CookieButton.cookies != 1){
            setModulationColor((float)Math.cos(counter), (float)Math.sin(counter), 1.0f - ((float)Math.cos(counter) + (float)Math.sin(counter)), 0.5F);
        }
        if(CookieButton.cookies%1000000 <= CookieButton.change && CookieButton.cookies != 1){
            setScale(8, 8);
            setModulationColor((float) Math.cos(counter), (float) Math.sin(counter), 1.0f - ((float) Math.cos(counter) + (float) Math.sin(counter)), 0.5F);
        }
    }
}

