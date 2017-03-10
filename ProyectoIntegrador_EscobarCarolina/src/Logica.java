import java.util.ArrayList;

import processing.core.PApplet;

public class Logica {

	private PApplet app;
	ArrayList alumnos=new ArrayList<Alumno>();
	
	public Logica(PApplet app) {
		this.app=app;
		String[] nombre, dato, color;
		alumnos=new ArrayList<>();
		
		nombre=app.loadStrings("../Data/nombres.txt");
		dato=app.loadStrings("../Data/datos.txt");
		color=app.loadStrings("../Data/colores.txt");
		
		for (int i = 0; i < nombre.length; i++) {
			String [] nombres = nombre[i].split(":");
			String [] datos = dato[i].split("/");
			String [] colores = color[i].split("/");
			alumnos.add(new Alumno (nombre[0], nombre[1],
					(int) Long.parseLong(dato[0]),Integer.parseInt(dato[1]),
					Integer.parseInt(dato[2]),Integer.parseInt(color[0]),
					Integer.parseInt(color[1]),Integer.parseInt(color[2])));
				
		}
		
		for (int i = 0; i < alumnos.size(); i++) {
			for (int j = 1; j < alumnos.size(); j++) {
				Alumno primero = (Alumno) alumnos.get(j-1);
				Alumno segundo = (Alumno) alumnos.get(j);
				if(primero.getEdad()>segundo.getEdad()){
					alumnos.set(j-1, segundo);
					alumnos.set(j, primero);
						
				}	
			}
		}
		
		for (int i=0; i<alumnos.size();i++){
			
		}
	}
	
}
