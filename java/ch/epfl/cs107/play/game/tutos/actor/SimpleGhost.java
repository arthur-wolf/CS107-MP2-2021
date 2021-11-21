package ch.epfl.cs107.play.game.tutos.actor;

import ch.epfl.cs107.play.game.actor.Entity;
import ch.epfl.cs107.play.game.actor.TextGraphics;
import ch.epfl.cs107.play.game.areagame.actor.Sprite;
import ch.epfl.cs107.play.math.Vector;
import ch.epfl.cs107.play.window.Canvas;

import java.awt.Color;

public class SimpleGhost extends Entity {
    private Sprite sprite;
    private float hp;
    private TextGraphics hpText;

    public SimpleGhost(Vector position, String spriteName){
        super(position);
        new Sprite(spriteName , 1, 1.f, this);
        new TextGraphics(Integer.toString((int)hp), 0.4f, Color.BLUE);
        this.hp = 10;
        hpText.setParent(this);
        this.hpText.setAnchor(new Vector(-0.3f, 0.1f));
    }

    @Override
    public void draw(Canvas canvas) {
        hpText.draw(canvas);
    }

    @Override
    public void update(float deltaTime) {
        if (hp > 0 && hp - deltaTime > 0){
            hp -= deltaTime;
            hpText.setText(Integer.toString((int)hp));
        }
    }

    public boolean isWeak(){
        return hp <= 0;
    }

    public void strenghten(){
        hp = 10;
    }
}
