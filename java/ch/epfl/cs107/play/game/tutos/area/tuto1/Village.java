package ch.epfl.cs107.play.game.tutos.area.tuto1;

import ch.epfl.cs107.play.game.tutos.actor.SimpleGhost;
import ch.epfl.cs107.play.game.tutos.area.SimpleArea;
import ch.epfl.cs107.play.math.Vector;

public class Village extends SimpleArea {
    public void createArea(){
        SimpleGhost a = new SimpleGhost(new Vector(18, 7), "ghost.2");
        registerActor(a);
        setViewCandidate(a);
    }

    @Override
    public String getTitle() {
        return "zelda/Village";
    }

}