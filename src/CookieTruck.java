import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

/**
 * Created by marcus.yim on 7/19/2017.
 */
public class CookieTruck extends GameObject {

    public CookieTruck() {
        super("CookieTruck", 50, 50, "Cookie_Truck.png");
    }

    boolean debounce = true;

    SpriteText  st = new SpriteText("Costs " + Level.truckCost +  " Cookies", 15, SpriteText.Alignment.CENTER, 7, 1265, 55);

    @Override
    public void update(float dt) {

        if(CookieButton.shop == true) {
            if (InputManager.getMousePosition().getX() < 683 && InputManager.getMousePosition().getX() > 645 && InputManager.getMousePosition().getY() < 156 && InputManager.getMousePosition().getY() > 115) {
                if (InputManager.isMouseButtonPressed(0) && debounce && CookieButton.cookies >= Level.truckCost && CookieButton.cookies >= 0) {
                    debounce = false;
                    CookieButton.cookies = CookieButton.cookies - Level.truckCost;
                    Level.truck++;
                    Level.truckCost = (Level.truckCost + (int) (Level.truckCost * 1.5f));
                    System.out.println(Level.truckCost);
                    Level.autoClicks = Level.autoClicks + 20;
                    st.Kill();
                    st = new SpriteText("Costs " + Level.truckCost +  " Cookies", 15, SpriteText.Alignment.CENTER, 7, 1265, 55);

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
