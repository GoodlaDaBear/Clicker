import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

/**
 * Created by marcus.yim on 7/18/2017.
 */
public class AutoClick extends GameObject{

    public AutoClick()  {
        super("AutoClick", 50, 50, "PlusCursor.png");
    }

    boolean debounce = true;



    SpriteText st = new SpriteText("" + Level.autoCost, 15, SpriteText.Alignment.CENTER, 7, 829, 55);
    SpriteText et = new SpriteText("" + Level.autoCost, 15, SpriteText.Alignment.CENTER, 7, 829, 55);
    @Override
    public void update(float dt){


        if(CookieButton.shop == true) {
            if (InputManager.getMousePosition().getX() < 251 && InputManager.getMousePosition().getX() > 208 && InputManager.getMousePosition().getY() < 155 && InputManager.getMousePosition().getY() > 115) {
                if (InputManager.isMouseButtonPressed(0) && debounce && CookieButton.cookies >= Level.autoCost && CookieButton.cookies >= 0) {
                    debounce = false;
                    CookieButton.cookies = CookieButton.cookies - Level.autoCost;
                    Level.auto++;
                    Level.autoClicks = Level.autoClicks + 1;
                    Level.autoCost = (Level.autoCost + (int) (Level.autoCost * 2f));
                    System.out.println(Level.autoCost);
                    st.Kill();
                    st.Kill();
                    et = new SpriteText("Costs " + Level.auto + " Cookies", 15, SpriteText.Alignment.CENTER, 7, 829, 35);
                    st = new SpriteText("" + Level.autoCost, 15, SpriteText.Alignment.CENTER, 7, 829, 15);

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
