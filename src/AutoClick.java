import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;

/**
 * Created by marcus.yim on 7/18/2017.
 */
public class AutoClick extends GameObject{

    public AutoClick()  {
        super("AutoClick", 50, 50, "PlusCursor.png");
    }

    boolean debounce = true;

   SpriteText st = new SpriteText("" + Level.autoCost, 15, SpriteText.Alignment.CENTER, 7, 829, 55);;
    @Override
    public void update(float dt){


        if(CookieButton.shop == true) {
            if (InputManager.getMousePosition().getX() < 251 && InputManager.getMousePosition().getX() > 208 && InputManager.getMousePosition().getY() < 155 && InputManager.getMousePosition().getY() > 115) {
                if (InputManager.isMouseButtonPressed(0) && debounce && CookieButton.cookies >= Level.autoCost) {
                    debounce = false;
                    CookieButton cookieButton = (CookieButton) ObjectManager.getGameObjectByName("CookieButton");
                    CookieButton.cookies = CookieButton.cookies - Level.autoCost;
                    Level.auto++;
                    Level.autoCost = Level.autoCost * 2;
                    System.out.println(Level.autoCost);
                    st.Kill();
                    st = new SpriteText("" + Level.autoCost, 15, SpriteText.Alignment.CENTER, 7, 829, 55);

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
