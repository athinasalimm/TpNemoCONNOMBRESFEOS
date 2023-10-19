package Nemoo;

import java.util.Arrays;

import java.util.List;

public abstract class Command{
	
	public  static List<Command> listaDeComandos = Arrays.asList(
		new CommandD(),
		new Ascend(),
		new GirarDerecha(),
		new GirarIzquierda(),
		new Forward()
		);

		//hacer una lista con todos los comandos
		
		//luego hay que ver que el char q estoy mandando desde nemo a command cumpla con la key de alguno de los commandsX //nemo
		//(por ejemplo la key de CommandD es 'd', con la key que cumpla entonces tiene que netrar a la subclase de ese command y ejecutar la accion 
		//del command, por ejemplo si char = 'd' y 'd' ==  el key de CommandD entonces se entra en commandD y se enviA 
		//EL MENSAJE DE ESTE PARA QUE SE EJECUTE EN nEMO
	
	public abstract boolean encontrarKey(char comando);
	
	public abstract void ejecutador(Nemo3 nemo);
	
 }
