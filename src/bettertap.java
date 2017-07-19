/**
 * Created by matthew.yamamoto on 7/19/2017.
 */
import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
public class bettertap extends GameObject {
    SpriteText st;
    float powerupcounter2 = 120;
    boolean powerup2= false;
    float texttimer2=2;
    float boxcounter2=3;
    boolean isTextShowing = false;
    public bettertap() {
        super("better taps", 350, 219, "bettertap.png");

    }

    @Override
    public void update(float dt) {
        texttimer2-= dt;
        if(texttimer2<=0 && isTextShowing){
            st.Kill();
            isTextShowing = false;
        }
        boxcounter2-=dt;
        if (boxcounter2<= 0){
            setOpacity(0);
        }
        powerupcounter2 -= dt;
        if (powerupcounter2 <= 0) {
            setOpacity(100);
            powerup2 = true;
        }

        if (powerup2 == true) {
            if (InputManager.isMouseButtonReleased(0)) {
                System.out.println(InputManager.getMousePosition());
                if (InputManager.getMousePosition().getX() < 145.0 && InputManager.getMousePosition().getX() > 60.0 && InputManager.getMousePosition().getY() < 99.0 && InputManager.getMousePosition().getY() > 59.0) {
                    st = new SpriteText("YOU GET 5 TIMES THE CLICK POWER FOR 7 SECONDS", 15, SpriteText.Alignment.CENTER, 7, -200, 200);
                    isTextShowing = true;
                    texttimer2 = 2;
                    boxcounter2=0;
                    powerupcounter2=120;
                }

            }
        }
    }
}