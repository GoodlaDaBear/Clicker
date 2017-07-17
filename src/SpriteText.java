import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.math.Vec2;

/**
 * Created by Jacob on 7/16/2017.
 */
public class SpriteText
{
  private GameObject[] objs = null;
  private int scale;
  private int spacing;
  private Alignment align;
  private Vec2 pos;

  public enum Alignment
  {
    LEFT,
    CENTER,
    RIGHT
  }

  public SpriteText(String text, int scale, Alignment align, int spacing, float xPos, float yPos)
  {
    this(text, scale, align, spacing, new Vec2(xPos, yPos));
  }

  public SpriteText(String text, int scale, Alignment align, int spacing, Vec2 position)
  {
    this.scale = scale;
    this.spacing = spacing;
    this.align = align;
    this.pos = position;

    Change(text);
  }

  public void Change(String text)
  {
    GameObject[] oldObjs = objs;
    objs = new GameObject[text.length()];
    int textWidth = text.length() * spacing;

    int oldObjCounter = 0;
    int objCounter = 0;
    for(char i : text.toCharArray())
    {
      GameObject obj;
      if(oldObjs != null && oldObjCounter < oldObjs.length)
      {
        obj = oldObjs[oldObjCounter];
        ++oldObjCounter;
      }
      else
      {
        obj = new GameObject("TextCharacter", scale, scale, "text.png", 96, 6, 16, 0.0f);
        ObjectManager.addGameObject(obj);
      }

      obj.goToAndStop((i - ' '));

      if(align == Alignment.LEFT)
      {
        obj.setPosition(pos.getX() + objCounter * spacing, pos.getY());
      }
      else if(align == Alignment.CENTER)
      {
        obj.setPosition(pos.getX() + (objCounter + 0.5f) * spacing - (textWidth / 2.0f), pos.getY());
      }
      else // Right
      {
        obj.setPosition(pos.getX() + (objCounter + 1) * spacing - textWidth, pos.getY());
      }

      objs[objCounter] = obj;
      ++objCounter;
    }

    if(oldObjs != null) {
      for (int i = oldObjCounter; i < oldObjs.length; ++i) {
        oldObjs[i].kill();
      }
    }
  }

  public void Kill()
  {
    for(GameObject obj : objs)
    {
      obj.kill();
    }

    objs = null;
  }
}
