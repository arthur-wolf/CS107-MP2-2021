package ch.epfl.cs107.play.game.tutos;

import ch.epfl.cs107.play.game.areagame.AreaGame;
import ch.epfl.cs107.play.game.tutos.area.tuto1.Ferme;

public class Tuto1 extends AreaGame {

    private void createAreas(){
        addArea(new Ferme());
    }

    public boolean begin(){
        if (super.begin(getWindow() , getFileSystem())) {
            setCurrentArea("zelda/VIllage", true);
            createAreas();
            return true;
        }
        else return false;
    }

    public void end(){}

    public void update(){
        super.update(1);
    }

    public String getTitle(){
        return "Tuto1";
    }
}
