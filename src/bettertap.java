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
            if (InputManager.getMousePosition().getX() < 52.0 && InputManager.getMousePosition().getX() > 102.0 && InputManager.getMousePosition().getY() < 98.0 && InputManager.getMousePosition().getY() > 59) {
                st = new SpriteText("ffff", 15, SpriteText.Alignment.CENTER, 7, 200, 50);
            }

        }
    }
}