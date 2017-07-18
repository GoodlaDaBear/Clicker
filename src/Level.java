import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;
import edu.digipen.math.Vec2;

public class Level extends GameLevel {

    @Override
    public void create() {

        GameObject wallpaper1 = new GameObject("Object1", 800, 600, "BlueWallpaper.png");
        GameObject cookiebutton = new CookieButton();

    }

    @Override
    public void initialize() {

    }



    @Override
    public void update(float v) {


    }

    @Override
    public void uninitialize() {

    }
}
