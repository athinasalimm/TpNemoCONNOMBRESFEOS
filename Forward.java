package Nemoo;

public class Forward extends Command{

	@Override
	public boolean encontrarKey(char comando) {
		return comando == 'f';
	}

	@Override
	public void ejecutador(Nemo3 nemo) {
		nemo.posicion = nemo.rotacion.avanzar(nemo);
	}

}
