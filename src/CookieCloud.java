
import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;

/**
 * Created by marcus.yim on 7/19/2017.
 */
public class CookieCloud extends GameObject {

    public CookieCloud()  {
        super("CookieCloud", 50, 50, "CookieCloud.png");
    }

    boolean debounce = true;

    @Override
    public void update(float dt) {

        if(CookieButton.shop == true) {
            if (InputManager.getMousePosition().getX() < 105 && InputManager.getMousePosition().getX() > 55 && InputManager.getMousePosition().getY() < 160 && InputManager.getMousePosition().getY() > 110) {
                if (InputManager.isMouseButtonPressed(0) && debounce) {
                    debounce = false;
                    CookieButton cookieButton = (CookieButton) ObjectManager.getGameObjectByName("CookieButton");
                    Level.cloud++;
                }
                if (InputManager.isMouseButtonReleased(0)) {
                    debounce = true;
                }
            } else {
                debounce = true;
            }
        }

    }

}
