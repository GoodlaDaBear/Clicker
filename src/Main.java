import edu.digipen.Game;
import edu.digipen.level.EmptyLevel;

public class Main {
    public static void main(String[] args) {
        Game.initialize(800, 600, 60, new Level());
        while(Game.getQuit() == false)
        {
            Game.update();
        }
        Game.destroy();
    }
}
