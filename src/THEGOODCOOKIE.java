import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

/**
 * Created by marcus.yim on 7/20/2017.
 */
public class THEGOODCOOKIE extends GameObject{

    public THEGOODCOOKIE()  {
        super("theCookie", 50, 50, "THEGOODCOOKIE.png");
    }

   SpriteText st = new SpriteText("Costs 1,000,000 Cookies", 15, SpriteText.Alignment.CENTER, 7, 840, -145);

    boolean debounce = true;

    @Override
    public void update(float dt){


        if(CookieButton.shop == true) {
            if (InputManager.getMousePosition().getX() < 260 && InputManager.getMousePosition().getX() > 217 && InputManager.getMousePosition().getY() < 355 && InputManager.getMousePosition().getY() > 313) {
                if (InputManager.isMouseButtonPressed(0) && debounce && CookieButton.cookies >= Level.trueCookieCost && CookieButton.cookies >= 0 && Level.trueCookie < 1) {
                    debounce = false;
                    Level.trueCookie++;
                    CookieButton.cookies = CookieButton.cookies - Level.trueCookieCost;
                    System.out.println(Level.powerCost);
                    Level.autoClicks = Level.autoClicks + 999999999;
                    st = new SpriteText("You Are Now Complete GG", 15, SpriteText.Alignment.CENTER, 7, 840, -165);

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
