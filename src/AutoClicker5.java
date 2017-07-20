import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

/**
 * Created by marcus.yim on 7/18/2017.
 */
public class AutoClicker5 extends GameObject{

    public AutoClicker5()  {
        super("AutoClick5", 50, 50, "PlusCursor5.png");
    }

    SpriteText st = new SpriteText("Costs " + Level.auto5Cost + " Cookies", 15, SpriteText.Alignment.CENTER, 7, 975, 55);
    SpriteText et = new SpriteText("Costs " + Level.auto5Cost + " Cookies", 15, SpriteText.Alignment.CENTER, 7, 975, 55);

    boolean debounce = true;

    @Override
    public void update(float dt) {

        if(CookieButton.shop == true) {
            if (InputManager.getMousePosition().getX() < 396 && InputManager.getMousePosition().getX() > 354 && InputManager.getMousePosition().getY() < 157 && InputManager.getMousePosition().getY() > 115) {
                if (InputManager.isMouseButtonPressed(0) && debounce && CookieButton.cookies >= Level.auto5Cost && CookieButton.cookies >= 0) {
                    debounce = false;
                    CookieButton.cookies = CookieButton.cookies - Level.auto5Cost;
                    Level.auto5++;
                    Level.autoClicks = Level.autoClicks + 5;
                    Level.auto5Cost = (Level.auto5Cost + (int) (Level.auto5Cost * 1.75f));
                    System.out.println(Level.auto5Cost);
                    st.Kill();
                    et.Kill();
                    st = new SpriteText("Costs " + Level.auto5Cost + " Cookies", 15, SpriteText.Alignment.CENTER, 7, 975, 55);
                    et = new SpriteText("You Have " + Level.auto5 + " X5 Auto Clickers", 15, SpriteText.Alignment.CENTER, 7, 829, 15);
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
