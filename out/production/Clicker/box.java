import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

public class box extends GameObject {

    public box()  {
        super("Power up ", 200, 200, "");
    }

    @Override
    public void update(float dt){

        if(InputManager.isMouseButtonReleased(0)){
            System.out.println(InputManager.getMousePosition());
            if(InputManager.getMousePosition().getX() < 780 &&InputManager.getMousePosition().getX() > 741 &&InputManager.getMousePosition().getY() < 79&&InputManager.getMousePosition().getY() > 40){