import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;

/**
 * Created by matthew.yamamoto on 7/18/2017.
 */
public class box extends GameObject {
    SpriteText st;
    //int cookies = 0;
public box (){

super("Power Up",350,219,"box.png");

}
@Override
public void update(float dt) {

    if (InputManager.isMouseButtonReleased(0)) {
        System.out.println(InputManager.getMousePosition());
        if (InputManager.getMousePosition().getX() <  692.0&& InputManager.getMousePosition().getX() > 537.0&& InputManager.getMousePosition().getY() < 309.0 && InputManager.getMousePosition().getY() > 215) {

        SpriteText st= new SpriteText("You got 20 cookies",15, SpriteText.Alignment.CENTER, 7, 200,50 );
            CookieButton.cookies = CookieButton.cookies +20;

        }

    }
}
}