package Nemoo;

public class GirarDerecha extends Command {

	@Override
	public boolean encontrarKey(char comando) {
		return comando == 'r';
	}

	@Override
	public void ejecutador(Nemo3 nemo) {
		nemo.rotacion = nemo.rotacion.goRight(); //preguntar si es necesario un metodo aca o esta bien con q sea la prop del constructor
	}

}
