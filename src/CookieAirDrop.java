import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

/**
 * Created by marcus.yim on 7/18/2017.
 */
public class CookieAirDrop extends GameObject {
    public CookieAirDrop()  {
        super("CookieAirDrop", 50, 50, "CookieDrop.png");
    }

    boolean debounce = true;

    SpriteText  st = new SpriteText("Costs " +Level.dropCost+ " Cookies", 15, SpriteText.Alignment.CENTER, 7, 1120, 35);
    SpriteText et = new SpriteText("Costs " + Level.dropCost + " Cookies", 15, SpriteText.Alignment.CENTER, 7, 1120, 35);

    @Override
    public void update(float dt) {

                if(CookieButton.shop == true) {
                if (InputManager.getMousePosition().getX() < 542 && InputManager.getMousePosition().getX() > 498 && InputManager.getMousePosition().getY() < 156 && InputManager.getMousePosition().getY() > 113) {
                    if (InputManager.isMouseButtonPressed(0) && debounce && CookieButton.cookies >= Level.dropCost) {
                        debounce = false;
                        Level.drop++;
                        CookieButton.cookies = CookieButton.cookies - Level.dropCost;
                        Level.dropCost = (Level.dropCost + (int) (Level.dropCost * 1.5f));
                        System.out.println(Level.dropCost);
                        Level.autoClicks = Level.autoClicks + 10;
                        st.Kill();
                        et.Kill();
                        st = new SpriteText("Costs " + Level.dropCost + " Cookies", 15, SpriteText.Alignment.CENTER, 7, 1120, 35);
                        et = new SpriteText("You Have " + Level.drop+ " Cookie Drops", 15, SpriteText.Alignment.CENTER, 7, 1120, 15);
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
