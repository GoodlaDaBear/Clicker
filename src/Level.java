import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;

public class Level extends GameLevel {
    SpriteText st;
    @Override
    public void create() {

        GameObject wallpaper1 = new GameObject("Object1", 800, 600, "BlueWallpaper.png");
        CookieButton cookiebutton = new CookieButton();
        GameObject Shop_Icon = new Shop_Icon();
        Shop_Icon.setPosition(360, 250);
        // GameObject box = new box();
        // box.setPosition(200,50);
        
        GameObject sickbackrounddude = new Shop_Backround();
        st = new SpriteText("The Shop", 32, SpriteText.Alignment.CENTER, 20, 1000, 250);
        GameObject PlusUno = new ClickPower();
        PlusUno.setPosition(685, 175);
        st = new SpriteText("+1 Click Power", 15, SpriteText.Alignment.CENTER, 7, 685, 135);
        st = new SpriteText("Each Click Gives You", 15, SpriteText.Alignment.CENTER, 7, 685, 115);
        st = new SpriteText("One More Cookie", 15, SpriteText.Alignment.CENTER, 7, 685, 95);
        st = new SpriteText("Costs 5 Cookies", 15, SpriteText.Alignment.CENTER, 7, 685, 75);
        GameObject AutoClick = new AutoClick();
        AutoClick.setPosition(830, 175);
        st = new SpriteText("+1 Auto Click", 15, SpriteText.Alignment.CENTER, 7, 830, 135);
        st = new SpriteText("Gives You One", 15, SpriteText.Alignment.CENTER, 7, 830, 115);
        st = new SpriteText("Automatic Cookie", 15, SpriteText.Alignment.CENTER, 7, 830, 95);
        st = new SpriteText("Every Second", 15, SpriteText.Alignment.CENTER, 7, 830, 75);
        st = new SpriteText("Costs 10 Cookies", 15, SpriteText.Alignment.CENTER, 7, 830, 55);
        st = new SpriteText("Hand That Clicks", 15, SpriteText.Alignment.CENTER, 7, 830, 35);
        GameObject CookieAirDrop = new CookieAirDrop();
        CookieAirDrop.setPosition(975, 175);
        st = new SpriteText("+5 Auto Clicks", 15, SpriteText.Alignment.CENTER, 7, 975, 135);
        st = new SpriteText("Gives You Five", 15, SpriteText.Alignment.CENTER, 7, 975, 115);
        st = new SpriteText("Automatic Cookies", 15, SpriteText.Alignment.CENTER, 7, 975, 95);
        st = new SpriteText("Every Second", 15, SpriteText.Alignment.CENTER, 7, 975, 75);
        st = new SpriteText("Costs 100 Cookies", 15, SpriteText.Alignment.CENTER, 7, 975, 55);
        st = new SpriteText("Cookie Air Drops", 15, SpriteText.Alignment.CENTER, 7, 975, 35);
        GameObject CookieTruck = new CookieTruck();
        CookieTruck.setPosition(1120, 175);
        st = new SpriteText("+20 Auto Clicks", 15, SpriteText.Alignment.CENTER, 7, 1120, 135);
        st = new SpriteText("Gives You 20", 15, SpriteText.Alignment.CENTER, 7, 1120, 115);
        st = new SpriteText("Automatic Cookies", 15, SpriteText.Alignment.CENTER, 7, 1120, 95);
        st = new SpriteText("Every Second", 15, SpriteText.Alignment.CENTER, 7, 1120, 75);
        st = new SpriteText("Costs 700 Cookies", 15, SpriteText.Alignment.CENTER, 7, 1120, 55);
        st = new SpriteText("Cookie Trucks", 15, SpriteText.Alignment.CENTER, 7, 1120, 35);
        GameObject CookieCloud = new CookieCloud();
        CookieCloud.setPosition(1265, 175);
        st = new SpriteText("+100 Auto Clicks", 15, SpriteText.Alignment.CENTER, 7, 1265, 135);
        st = new SpriteText("Gives You 20", 15, SpriteText.Alignment.CENTER, 7, 1265, 115);
        st = new SpriteText("Automatic Cookies", 15, SpriteText.Alignment.CENTER, 7, 1265, 95);
        st = new SpriteText("Every Second", 15, SpriteText.Alignment.CENTER, 7, 1265, 75);
        st = new SpriteText("Costs 1500 Cookies", 15, SpriteText.Alignment.CENTER, 7, 1265, 55);
        st = new SpriteText("Cookie Clouds", 15, SpriteText.Alignment.CENTER, 7, 1265, 35);






        GameObject Exit_Shop = new Exit_Shop();
        Exit_Shop.setPosition(650, -225);


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
