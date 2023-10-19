package Nemoo;

public class RotacionOeste extends Rotacion {


	public Rotacion goRight() {
		return new RotacionNorte();
	}
	
	public Rotacion goLeft(){
		return new RotacionSur();
	}
	
	public String rotacionGetter() {
		return "oeste"; // preguntar si es necesario
	}
	
	public Posicion3 avanzar(Nemo3 nemo) {
		return nemo.posicion.suma(new Posicion3(-1, 0));
	}

}