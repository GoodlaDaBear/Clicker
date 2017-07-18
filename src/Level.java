import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;

public class Level extends GameLevel {

    @Override
    public void create() {

        GameObject wallpaper1 = new GameObject("Object1", 800, 600, "BlueWallpaper.png");
        CookieButton cookiebutton = new CookieButton();
        GameObject Shop_Icon = new Shop_Icon();
        Shop_Icon.setPosition(360, 250);

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
