
import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

/**
 * Created by marcus.yim on 7/19/2017.
 */
public class CookieCloud extends GameObject {

    public CookieCloud()  {
        super("CookieCloud", 50, 50, "CookieCloud.png");
    }

    boolean debounce = true;

    SpriteText  st = new SpriteText("Costs " +Level.cloudCost+ " Cookies", 15, SpriteText.Alignment.CENTER, 7, 685, -145);
    @Override
    public void update(float dt) {

        if(CookieButton.shop == true) {
            if (InputManager.getMousePosition().getX() < 107 && InputManager.getMousePosition().getX() > 62 && InputManager.getMousePosition().getY() < 359 && InputManager.getMousePosition().getY() > 312) {
                if (InputManager.isMouseButtonPressed(0) && debounce && CookieButton.cookies >= Level.cloudCost && CookieButton.cookies >= 0) {
                    debounce = false;
                    CookieButton.cookies = CookieButton.cookies - Level.cloudCost;
                    Level.cloud++;
                    Level.autoClicks = Level.autoClicks + 100;
                    Level.auto5Cost = (Level.cloudCost + (int) (Level.cloudCost * 1.5f));
                    System.out.println(Level.cloudCost);
                    st.Kill();
                    st = new SpriteText("Costs " +Level.cloudCost+ " Cookies", 15, SpriteText.Alignment.CENTER, 7, 685, -145);

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

