package Nemoo;

public class RotacionEste extends Rotacion{

	
	//en commandR habria q mandarlo a goright y en commandL a goleft


	public Rotacion goRight() {
		return new RotacionSur();
	}
	
	public Rotacion goLeft(){
		return new RotacionNorte();
	}
	
	public String rotacionGetter() {
		return "este"; // preguntar si es necesario
	}

	public Posicion3 avanzar(Nemo3 nemo) {
		return nemo.posicion.suma(new Posicion3(1, 0));
	}
}
