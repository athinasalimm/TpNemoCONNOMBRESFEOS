package Nemoo;

public abstract class Rotacion {
	
	public abstract Rotacion goRight();
	
	public abstract Rotacion goLeft();
	
	public abstract Posicion3 avanzar(Nemo3 nemo);
	
	public abstract String rotacionGetter(); //preguntar si es necesario porque solo sirve a fines del test

}
