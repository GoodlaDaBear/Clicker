import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.graphics.Graphics;

/**
 * Created by marcus.yim on 7/18/2017.
 */
public class Shop_Icon extends GameObject {

    public Shop_Icon()  {
            super("Shop Icon", 200, 200, "Shop_Icon.png");
    }

    @Override
    public void update(float dt){

        if(InputManager.isMouseButtonReleased(0)){
            if(InputManager.getMousePosition().getX() < 780 &&InputManager.getMousePosition().getX() > 741 &&InputManager.getMousePosition().getY() < 79&&InputManager.getMousePosition().getY() > 40){
                CookieButton CookieButton = (CookieButton) ObjectManager.getGameObjectByName("CookieButton");
                CookieButton.bool = false;
                Graphics.setCameraPosition(1000, Graphics.getCameraPosition().getY());
            }

        }

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //  ObjectManager;
    }
}
