import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

/**
 * Created by marcus.yim on 7/20/2017.
 */
public class THEGOODCOOKIE extends GameObject{

    public THEGOODCOOKIE()  {
        super("theCookie", 50, 50, "THEGOODCOOKIE.png");
    }

    SpriteText st = new SpriteText("Costs " + Level.powerCost + " Cookies", 15, SpriteText.Alignment.CENTER, 7, 680, 75);

    boolean debounce = true;

    @Override
    public void update(float dt){


        if(CookieButton.shop == true) {
            if (InputManager.getMousePosition().getX() < 0 && InputManager.getMousePosition().getX() > 0 && InputManager.getMousePosition().getY() < 0 && InputManager.getMousePosition().getY() > 0) {
                if (InputManager.isMouseButtonPressed(0) && debounce && CookieButton.cookies >= Level.trueCookieCost && CookieButton.cookies >= 0 && Level.trueCookie < 1) {
                    debounce = false;
                    Level.trueCookie++;
                    CookieButton.change++;
                    CookieButton.cookies = CookieButton.cookies - Level.trueCookieCost;
                    Level.trueCookieCost = (Level.trueCookieCost + (int) (Level.trueCookieCost * 1.5f));
                    System.out.println(Level.powerCost);
                    st.Kill();
                    st = new SpriteText("Costs " + Level.trueCookieCost + " Cookies", 15, SpriteText.Alignment.CENTER, 7, 680, 75);

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
