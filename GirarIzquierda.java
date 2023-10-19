package Nemoo;

public class GirarIzquierda extends Command{

	@Override
	public boolean encontrarKey(char comando) {
		return comando == 'l';
	}

	@Override
	public void ejecutador(Nemo3 nemo) {
		nemo.rotacion = nemo.rotacion.goLeft(); //preguntar si es necesario un metodo aca o esta bien con q sea la prop del constructor

		
	}

}
