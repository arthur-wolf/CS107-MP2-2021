package ch.epfl.cs107.play.game.tutos;

import ch.epfl.cs107.play.game.areagame.AreaGame;
import ch.epfl.cs107.play.game.tutos.area.tuto1.Ferme;
import ch.epfl.cs107.play.io.FileSystem;
import ch.epfl.cs107.play.window.Window;

public class Tuto1 extends AreaGame {

    private void createAreas(){
        addArea(new Ferme());
    }

    public boolean begin(Window window, FileSystem fileSystem){
        if (super.begin(window , fileSystem)) {
            createAreas();
            setCurrentArea("zelda/Village", true);
            return true;
        }
        else return false;
    }

    public void end(){}

    public void update(){
        super.update(60);
    }

    public String getTitle(){
        return "Tuto1";
    }
}
