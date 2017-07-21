/**
 * Created by matthew.yamamoto on 7/20/2017.
 */
import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
public class Powerupmoretap extends GameObject {
    boolean isTextShowing = false;
    float texttimer3 = 2;
    float boxcounter3= 5;
    float powerupcounter3= 90;
    boolean powerup3=true;
    SpriteText st;

    public Powerupmoretap() {
        super("Add one taps", 200, 200, "PlusCursor.png");
    }
    @Override
    public void update(float dt) {

        texttimer3 -= dt;
        if (texttimer3 <= 0 && isTextShowing) {
            st.Kill();
            isTextShowing = false;
        }
        boxcounter3 -= dt;
        if (boxcounter3 <= 0) {
            setOpacity(0);
        }
        powerupcounter3 -= dt;
        if (powerupcounter3 <= 0) {
            setOpacity(100);
            powerup3=true;
        }
        if(powerup3==true)
            if (getOpacity() > 0) {
                if (InputManager.isMouseButtonReleased(0)) {
                    System.out.println(InputManager.getMousePosition());
                    if (InputManager.getMousePosition().getX() < 228.0 && InputManager.getMousePosition().getX() > 16.0 && InputManager.getMousePosition().getY() < 583.0 && InputManager.getMousePosition().getY() > 390.0) {
                        st = new SpriteText("YOU GET ONE MORE TAP POWER", 15, SpriteText.Alignment.CENTER, 7, -280, -175);
                        CookieButton.change++;
                        isTextShowing = true;
                        texttimer3= 2;
                        boxcounter3 = 0;
                        powerupcounter3 = 60;
                    }
                }
            }
    }
}
