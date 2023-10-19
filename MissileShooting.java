package Nemoo;

public class MissileShooting extends Command{

	@Override
	public boolean encontrarKey(char comando) {
		return comando == 'm';
	}

	@Override
	public void ejecutador(Nemo3 nemo) {
		//aca esto tiene relacion con profundidad 
	}

}
