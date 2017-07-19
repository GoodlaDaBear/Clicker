/**
 * Created by matthew.yamamoto on 7/19/2017.
 */
import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
public class bettertap extends GameObject {
    SpriteText st;

    public bettertap() {
        super("better taps", 350, 219, "bettertap.png");

    }

    @Override
    public void update(float dt) {
        if (InputManager.isMouseButtonReleased(0)) {
            System.out.println(InputManager.getMousePosition());
            if (InputManager.getMousePosition().getX() < 145.0 && InputManager.getMousePosition().getX() > 60.0 && InputManager.getMousePosition().getY() < 99.0 && InputManager.getMousePosition().getY() > 59.0) {
                st = new SpriteText("YOU GET X5 CLICK POWER FOR 7 SECONDS", 15, SpriteText.Alignment.CENTER, 7, 200,50);
            }

        }
    }
}