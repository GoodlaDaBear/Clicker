import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

/**
 * Created by ishaan.desai on 7/17/2017.
 */
public class CookieButton extends GameObject {
    int cookies = 0;
    SpriteText st;
    public CookieButton(){
        super("CookieButton", 200, 200, "Cookie-button2.png");
        st = new SpriteText("Cookies: 0", 32, SpriteText.Alignment.CENTER, 20, 0, 100);
    }
    @Override
    public void update(float dt){
        if(InputManager.isMouseButtonReleased(0)){
            if(InputManager.getMousePosition().getX() < 528&&InputManager.getMousePosition().getX() > 272&&InputManager.getMousePosition().getY() < 332&&InputManager.getMousePosition().getX() > 268){
                cookies++;
                st.Change("Cookies: " + cookies);
                GameObject cookie = new Cookie();
            }
        }
    }

}
