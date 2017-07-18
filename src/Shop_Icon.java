import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

/**
 * Created by marcus.yim on 7/18/2017.
 */
public class Shop_Icon extends GameObject {

    public Shop_Icon()  {
            super("Shop Icon", 200, 200, "Shop_Icon.png");
    }

    @Override
    public void update(float dt){
        SpriteText st;
        if(InputManager.isMouseButtonReleased(0)){
            //System.out.println(InputManager.getMousePosition());
            if(InputManager.getMousePosition().getX() < 780 &&InputManager.getMousePosition().getX() > 741 &&InputManager.getMousePosition().getY() < 79&&InputManager.getMousePosition().getY() > 40){
                GameObject sickbackrounddude = new Shop_Backround();
                st = new SpriteText("The Shop", 32, SpriteText.Alignment.CENTER, 20, 0, 250);
                GameObject PlusUno = new ClickPower();
                PlusUno.setPosition(-315, 175);
                st = new SpriteText("+1 Click Power", 15, SpriteText.Alignment.CENTER, 7, -315, 135);
                st = new SpriteText("Each Click Gives You", 15, SpriteText.Alignment.CENTER, 7, -315, 115);
                st = new SpriteText("One More Cookie", 15, SpriteText.Alignment.CENTER, 7, -315, 95);
                st = new SpriteText("Costs 5 Cookies", 15, SpriteText.Alignment.CENTER, 7, -315, 75);
                GameObject AutoClick = new AutoClick();
                AutoClick.setPosition(-170, 175);
                st = new SpriteText("+1 Auto Click", 15, SpriteText.Alignment.CENTER, 7, -170, 135);
                st = new SpriteText("Gives You One", 15, SpriteText.Alignment.CENTER, 7, -170, 115);
                st = new SpriteText("Automatic Cookie", 15, SpriteText.Alignment.CENTER, 7, -170, 95);
                st = new SpriteText("Every Second", 15, SpriteText.Alignment.CENTER, 7, -170, 75);
                st = new SpriteText("Costs 10 Cookies", 15, SpriteText.Alignment.CENTER, 7, -170, 55);
                GameObject CookieAirDrop = new CookieAirDrop();
                CookieAirDrop.setPosition(-25, 175);
                st = new SpriteText("+5 Auto Clicks", 15, SpriteText.Alignment.CENTER, 7, -25, 135);
                st = new SpriteText("Gives You Five", 15, SpriteText.Alignment.CENTER, 7, -25, 115);
                st = new SpriteText("Automatic Cookies", 15, SpriteText.Alignment.CENTER, 7, -25, 95);
                st = new SpriteText("Every Second", 15, SpriteText.Alignment.CENTER, 7, -25, 75);
                st = new SpriteText("Costs 100 Cookies", 15, SpriteText.Alignment.CENTER, 7, -25, 55);
            }

        }

    }


}
