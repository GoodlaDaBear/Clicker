import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

/**
 * Created by matthew.yamamoto on 7/18/2017.
 * public box (){
 * <p/>
 * super("Power Up",350,219,"box.png");
 */
public class cookies extends GameObject {
    float boxcounter = 5;
    boolean isTextShowing = false;
    SpriteText st;
    int cookies = 0;
    float texttimer =2;
    float powerupcounter = 1;
    boolean powerup = false;
       public cookies() {
        super("more cookies", 350, 219, "cookies.png");

    }


    @Override
    public void update(float dt) {
            texttimer -= dt;
            if(texttimer<=0 && isTextShowing){
                st.Kill();
                isTextShowing = false;
            }
            boxcounter -= dt;
            if (boxcounter <= 0) {
                setOpacity(0);
                powerup = false;
            }
            powerupcounter -= dt;
            if (powerupcounter <= 0) {
                setOpacity(100);
                powerup = true;
            }

            if (powerup == true) {
                if (InputManager.isMouseButtonReleased(0)) {
                    System.out.println(InputManager.getMousePosition());
                    if (InputManager.getMousePosition().getX() < 733.0 && InputManager.getMousePosition().getX() > 633.0 && InputManager.getMousePosition().getY() < 294.0 && InputManager.getMousePosition().getY() > 192) {

                        st = new SpriteText("YOU GOT COOKIES", 15, SpriteText.Alignment.CENTER, 7, 285, 50);
                        isTextShowing = true;
                        texttimer = 2;
                        CookieButton.cookies = (CookieButton.cookies + (int) (CookieButton.cookies * 0.2f));
                        boxcounter = 0;
                        powerupcounter = 20;
                    }

                }
            }
            }
        }