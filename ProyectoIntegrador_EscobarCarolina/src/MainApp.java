import processing.core.PApplet;

public class MainApp extends PApplet {

	Logica log;
	
	public static void main (String [] args){
		
		main("MainApp");
	}
	
	@Override
	public void settings() {
		
		size(700,700);
	}
	
	@Override
	public void setup() {
		
		log = new Logica(this);
	}
	
	@Override
	public void draw() {
		
		background(255);
		//log.pintar();
		
	}
	
}
