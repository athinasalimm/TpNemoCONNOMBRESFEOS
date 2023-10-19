package Nemoo;

public class RotacionSur extends Rotacion{

	public Rotacion goRight() {
		return new RotacionEste();
	}
	
	public Rotacion goLeft(){
		return new RotacionOeste();
		}
	
	public String rotacionGetter() {
		return "sur"; // preguntar si es necesario
	}
	
	public Posicion3 avanzar(Nemo3 nemo) {
		return nemo.posicion.suma(new Posicion3(0, -1));
	}
	}

