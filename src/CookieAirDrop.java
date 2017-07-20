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

    SpriteText  st = new SpriteText("Costs 500 Cookies", 15, SpriteText.Alignment.CENTER, 7, 1120, 55);

    @Override
    public void update(float dt) {

                if(CookieButton.shop == true) {
                if (InputManager.getMousePosition().getX() < 0 && InputManager.getMousePosition().getX() > 0 && InputManager.getMousePosition().getY() < 0 && InputManager.getMousePosition().getY() > 0) {
                    if (InputManager.isMouseButtonPressed(0) && debounce && CookieButton.cookies >= Level.dropCost) {
                        debounce = false;
                        Level.drop++;
                        CookieButton.cookies = CookieButton.cookies - Level.dropCost;
                        Level.auto5Cost = (Level.dropCost + (int) (Level.dropCost * 1.75f));
                        System.out.println(Level.dropCost);
                        st.Kill();
                        st = new SpriteText("Costs" + Level.dropCost + "Cookies", 15, SpriteText.Alignment.CENTER, 7, 1120, 55);
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
