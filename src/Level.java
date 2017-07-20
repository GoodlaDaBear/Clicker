import edu.digipen.gameobject.GameObject;
import edu.digipen.level.GameLevel;

public class Level extends GameLevel {
    SpriteText st;

    static int power = 0;
    static int auto = 0;
    static int auto5 = 0;
    static  int drop = 0;
    static int truck = 0;
    static int cloud = 0;
    static int powerCost = 5;
    static int autoCost = 10;
    static int auto5Cost = 100;
    static  int dropCost = 100;
    static int truckCost = 700;
    static int cloudCost = 1500;


    @Override
    public void create() {

        GameObject wallpaper1 = new GameObject("Object1", 800, 600, "BlueWallpaper.png");
        CookieButton cookiebutton = new CookieButton();
        GameObject Shop_Icon = new Shop_Icon();
        Shop_Icon.setPosition(360, 250);
        GameObject cookies = new cookies();
        cookies.setPosition(200,50);
        
        GameObject sickbackrounddude = new Shop_Backround();
        st = new SpriteText("The Shop", 32, SpriteText.Alignment.CENTER, 20, 1000, 250);
        GameObject ClickPower = new ClickPower();
        ClickPower.setPosition(685, 175);
        st = new SpriteText("+1 Click Power", 15, SpriteText.Alignment.CENTER, 7, 685, 135);
        st = new SpriteText("Each Click Gives You", 15, SpriteText.Alignment.CENTER, 7, 685, 115);
        st = new SpriteText("One More Cookie", 15, SpriteText.Alignment.CENTER, 7, 685, 95);
        st = new SpriteText("Costs", 15, SpriteText.Alignment.CENTER, 7, 645, 75);
        st = new SpriteText("Cookies", 15, SpriteText.Alignment.CENTER, 7, 715, 75);
        GameObject AutoClick = new AutoClick();
        AutoClick.setPosition(830, 175);
        st = new SpriteText("+1 Auto Click", 15, SpriteText.Alignment.CENTER, 7, 830, 135);
        st = new SpriteText("Gives You One", 15, SpriteText.Alignment.CENTER, 7, 830, 115);
        st = new SpriteText("Automatic Cookie", 15, SpriteText.Alignment.CENTER, 7, 830, 95);
        st = new SpriteText("Every Second", 15, SpriteText.Alignment.CENTER, 7, 830, 75);
        st = new SpriteText("Costs", 15, SpriteText.Alignment.CENTER, 7, 790, 55);
        st = new SpriteText("Cookies", 15, SpriteText.Alignment.CENTER, 7, 871, 55);
        st = new SpriteText("Hand That Clicks", 15, SpriteText.Alignment.CENTER, 7, 830, 35);
        GameObject AutoClicker5 = new AutoClicker5();
        AutoClicker5.setPosition(975, 175);
        st = new SpriteText("+5 Auto Clicks", 15, SpriteText.Alignment.CENTER, 7, 975, 135);
        st = new SpriteText("Gives You Five", 15, SpriteText.Alignment.CENTER, 7, 975, 115);
        st = new SpriteText("Automatic Cookies", 15, SpriteText.Alignment.CENTER, 7, 975, 95);
        st = new SpriteText("Every Second", 15, SpriteText.Alignment.CENTER, 7, 975, 75);
        st = new SpriteText("Costs 100 Cookies", 15, SpriteText.Alignment.CENTER, 7, 975, 55);
        st = new SpriteText("5 Click Hands", 15, SpriteText.Alignment.CENTER, 7, 975, 35);
        GameObject CookieAirDrop = new CookieAirDrop();
        CookieAirDrop.setPosition(1120, 175);
        st = new SpriteText("+5 Auto Clicks", 15, SpriteText.Alignment.CENTER, 7, 1120, 135);
        st = new SpriteText("Gives You Five", 15, SpriteText.Alignment.CENTER, 7, 1120, 115);
        st = new SpriteText("Automatic Cookies", 15, SpriteText.Alignment.CENTER, 7, 1120, 95);
        st = new SpriteText("Every Second", 15, SpriteText.Alignment.CENTER, 7, 1120, 75);
        st = new SpriteText("Costs 100 Cookies", 15, SpriteText.Alignment.CENTER, 7, 1120, 55);
        st = new SpriteText("5 Click Hands", 15, SpriteText.Alignment.CENTER, 7, 1120, 35);
        GameObject CookieTruck = new CookieTruck();
        CookieTruck.setPosition(1265, 175);
        st = new SpriteText("+20 Auto Clicks", 15, SpriteText.Alignment.CENTER, 7, 1265, 135);
        st = new SpriteText("Gives You 20", 15, SpriteText.Alignment.CENTER, 7, 1265, 115);
        st = new SpriteText("Automatic Cookies", 15, SpriteText.Alignment.CENTER, 7, 1265, 95);
        st = new SpriteText("Every Second", 15, SpriteText.Alignment.CENTER, 7, 1265, 75);
        st = new SpriteText("Costs 700 Cookies", 15, SpriteText.Alignment.CENTER, 7, 1265, 55);
        st = new SpriteText("Cookie Trucks", 15, SpriteText.Alignment.CENTER, 7, 1265, 35);
        GameObject CookieCloud = new CookieCloud();
        CookieCloud.setPosition(685, -25);
        st = new SpriteText("+100 Auto Clicks", 15, SpriteText.Alignment.CENTER, 7, 685, -65);
        st = new SpriteText("Gives You 20", 15, SpriteText.Alignment.CENTER, 7, 685, -85);
        st = new SpriteText("Automatic Cookies", 15, SpriteText.Alignment.CENTER, 7, 685, -105);
        st = new SpriteText("Every Second", 15, SpriteText.Alignment.CENTER, 7, 685, -125);
        st = new SpriteText("Costs 1500 Cookies", 15, SpriteText.Alignment.CENTER, 7, 685, -145);
        st = new SpriteText("Cookie Clouds", 15, SpriteText.Alignment.CENTER, 7, 685, -165);

        GameObject Exit_Shop = new Exit_Shop();
        Exit_Shop.setPosition(650, -225);
        GameObject bettertap = new bettertap();
        bettertap.setPosition(-300,200);

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
