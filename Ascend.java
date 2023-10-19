package Nemoo;

public class Ascend extends Command{

	@Override
	public boolean encontrarKey(char comando) {
		return comando == 'u';
	}

	@Override
	public void ejecutador(Nemo3 nemo) {
		//(profundidad -= 1)
		
	}

}
