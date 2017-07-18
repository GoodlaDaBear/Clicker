import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;

/**
 * Created by marcus.yim on 7/18/2017.
 */
public class ClickPower extends GameObject                                                                  {

    public ClickPower()  {
        super("ClickPower", 50, 50, "PlusUno2.png");
    }

    boolean debounce = true;

    @Override
    public void update(float dt){
        if(InputManager.getMousePosition().getX() < 100 &&InputManager.getMousePosition().getX() > 50 &&InputManager.getMousePosition().getY() < 160&&InputManager.getMousePosition().getY() > 110) {
            if(InputManager.isMouseButtonPressed(0) && debounce) {
                debounce = false;
                CookieButton cookieButton = (CookieButton) ObjectManager.getGameObjectByName("CookieButton");
                cookieButton.change++;
            }
            if(InputManager.isMouseButtonReleased(0))
            {
                debounce = true;
            }
        }
        else
        {
            debounce = true;
        }

    }
}
