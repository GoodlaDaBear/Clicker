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

    SpriteText st = new SpriteText("" + Level.autoCost, 15, SpriteText.Alignment.CENTER, 7, 680, 75);

    @Override
    public void update(float dt){


        if(CookieButton.shop == true) {
            if (InputManager.getMousePosition().getX() < 105 && InputManager.getMousePosition().getX() > 55 && InputManager.getMousePosition().getY() < 160 && InputManager.getMousePosition().getY() > 110) {
                if (InputManager.isMouseButtonPressed(0) && debounce && CookieButton.cookies >= Level.powerCost) {
                    debounce = false;
                    CookieButton cookieButton = (CookieButton) ObjectManager.getGameObjectByName("CookieButton");
                   Level.power++;
                    CookieButton.cookies = CookieButton.cookies - Level.powerCost;
                    Level.powerCost = (Level.powerCost + (int) (Level.powerCost * 1.5f));
                    System.out.println(Level.powerCost);
                    st.Kill();
                    st = new SpriteText("" + Level.powerCost, 15, SpriteText.Alignment.CENTER, 7, 680, 75);

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
