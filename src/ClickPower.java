import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

/**
 * Created by marcus.yim on 7/18/2017.
 */
public class ClickPower extends GameObject                                                                  {

    public ClickPower()  {
        super("ClickPower", 50, 50, "PlusUno2.png");
    }


    boolean debounce = true;

    SpriteText st = new SpriteText("Costs " + Level.powerCost + " Cookies", 15, SpriteText.Alignment.CENTER, 7, 680, 75);

    @Override
    public void update(float dt){


        if(CookieButton.shop == true) {
            if (InputManager.getMousePosition().getX() < 107 && InputManager.getMousePosition().getX() > 64 && InputManager.getMousePosition().getY() < 160 && InputManager.getMousePosition().getY() > 110) {
                if (InputManager.isMouseButtonPressed(0) && debounce && CookieButton.cookies >= Level.powerCost && CookieButton.cookies >= 0) {
                    debounce = false;
                    CookieButton.cookies = CookieButton.cookies - Level.powerCost;
                    Level.power++;
                    Level.powerCost = (Level.powerCost + (int) (Level.powerCost * 2f));
                    CookieButton.change++;
                    st.Kill();
                    st = new SpriteText("Costs " + Level.powerCost + " Cookies", 15, SpriteText.Alignment.CENTER, 7, 680, 75);
                    st = new SpriteText("You Have " + Level.power + " Clickers", 15, SpriteText.Alignment.CENTER, 7, 680, 75);

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
