/**
 * Created by matthew.yamamoto on 7/19/2017.
 */

import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

public class bettertap extends GameObject {
        SpriteText st;
    float powerupcounter2 = 1;
    boolean powerup2 =true;
    float texttimer2 = 2;
    float boxcounter2 = 5;
    boolean isTextShowing = false;
    float powerupaffect = 7;

    int oldChange;

    public bettertap() {
        super("better taps", 350, 219, "bettertap.png");

    }

    @Override
    public void update(float dt) {
        texttimer2 -= dt;
        if (texttimer2 <= 0 && isTextShowing) {
            st.Kill();
            isTextShowing = false;
        }
       // boxcounter2 -= dt;
        if (boxcounter2 <= 0) {
            setOpacity(0);

        }
        //powerupcounter2 -= dt;
        if (powerupcounter2 <= 0) {
            setOpacity(100);
            powerup2=true;
        }
        if(powerupaffect <=0){
            powerup2=false;
            CookieButton.multi = 1;
            powerupaffect = 7;
        }
        else
        {
            powerupaffect -=dt;
        }


        //System.out.println(powerup2);
        if(powerup2==true)
            if (getOpacity() > 0) {
                if (InputManager.isMouseButtonReleased(0)) {
                    //System.out.println(InputManager.getMousePosition());
                    if (InputManager.getMousePosition().getX() < 154.0 && InputManager.getMousePosition().getX() > 52.0 && InputManager.getMousePosition().getY() < 146.0 && InputManager.getMousePosition().getY() > 56.0) {
                        st = new SpriteText("YOU GET 5 TIMES THE CLICK POWER FOR 7 SECONDS", 15, SpriteText.Alignment.CENTER, 7, -200, 200);
                        CookieButton.multi = 5;
                        // make the current tap times 5.
                        isTextShowing = true;
                        texttimer2 = 2;
                        boxcounter2 = 0;
                        powerupcounter2 = 60;
                        powerupaffect = 7;
                    }
                }
            }
        }


    }
