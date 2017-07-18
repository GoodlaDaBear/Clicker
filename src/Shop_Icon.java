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
        SpriteText st;
        if(InputManager.isMouseButtonReleased(0)){
            System.out.println(InputManager.getMousePosition());
            if(InputManager.getMousePosition().getX() < 780 &&InputManager.getMousePosition().getX() > 741 &&InputManager.getMousePosition().getY() < 79&&InputManager.getMousePosition().getY() > 40){
                GameObject sickbackrounddude = new Shop_Backround();
                st = new SpriteText("The Shop", 32, SpriteText.Alignment.CENTER, 20, 0, 250);
                GameObject PlusUno = new ClickPower();
                PlusUno.setPosition(-360, 175);

            }

        }

    }


}
