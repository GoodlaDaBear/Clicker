import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

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
            System.out.println(InputManager.getMousePosition());
            if(InputManager.getMousePosition().getX() < 780 &&InputManager.getMousePosition().getX() > 741 &&InputManager.getMousePosition().getY() < 79&&InputManager.getMousePosition().getY() > 40){

                GameObject sickbackrounddude = new Shop_Backround();

            }

        }

    }


}
