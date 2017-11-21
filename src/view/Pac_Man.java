package view;

import java.util.Observable;
import java.util.Observer;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.MoveEvent;

public class Pac_Man extends ImageView implements Observer {
	
	public Pac_Man(model.Pac_Man pm) {
		this.setImage(new Image("pacman.png"));
		this.setX(pm.getX()*8);
		this.setY(pm.getY()*8);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		MoveEvent e = (MoveEvent) arg;
		this.setX(e.x*8);
		this.setY(e.y*8);
	}

}
