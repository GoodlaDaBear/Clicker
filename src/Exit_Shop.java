import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.graphics.Graphics;

/**
 * Created by ishaan.desai on 7/18/2017.
 */
public class Exit_Shop extends GameObject{
    public Exit_Shop() {
        super("Exit_Shop_Button", 50, 50, "EXIT.png");
    }
    @Override
    public void update(float dt){
        if(CookieButton.shop == true) {
            if (InputManager.getMousePosition().getX() < 75 && InputManager.getMousePosition().getX() > 25 && InputManager.getMousePosition().getY() < 560 && InputManager.getMousePosition().getY() > 510) {
                if (InputManager.isMouseButtonTriggered(0)) {
                    System.out.println(InputManager.getMousePosition());
                    Graphics.setCameraPosition(0, Graphics.getCameraPosition().getY());
                    CookieButton CookieButton = (CookieButton) ObjectManager.getGameObjectByName("CookieButton");
                    CookieButton.bool = true;
                    CookieButton.shop = false;
                }
            }
        }
    }
    //hi
}
