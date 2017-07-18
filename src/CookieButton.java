import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

import java.awt.event.KeyEvent;

/**
 * Created by ishaan.desai on 7/17/2017.
 */
public class CookieButton extends GameObject {
    static int cookies = 0;
    int change = 1;
    SpriteText st;

    public CookieButton() {
        super("CookieButton", 200, 200, "Cookie-Button.png", 2, 1, 2, 0.0f);
        animationData.goToAndStop(1);
        st = new SpriteText("Cookies: 0", 32, SpriteText.Alignment.CENTER, 20, 0, 100);
    }

    @Override
    public void update(float dt) {
        st.Change("Cookies: " + cookies);

        if (InputManager.getMousePosition().getX() < 460 && InputManager.getMousePosition().getX() > 315 && InputManager.getMousePosition().getY() < 315 && InputManager.getMousePosition().getY() > 265) {
            if (InputManager.isMouseButtonTriggered(0)) {

                cookies = cookies + change;
                st.Change("Cookies: " + cookies);
                animationData.goToAndStop(1);
                GameObject cookie = new Cookie();
            }
            if (InputManager.isMouseButtonTriggered(0)) {
                animationData.goToAndStop(0);
            }
        }
        if (InputManager.isTriggered(KeyEvent.VK_SPACE)) {
            cookies = cookies + change;
            st.Change("Cookies: " + cookies);
            animationData.goToFrame(0);
            GameObject cookie = new Cookie();
        }
        if (InputManager.isReleased(KeyEvent.VK_SPACE)) {
            animationData.goToFrame(1);
        }
    }

}
