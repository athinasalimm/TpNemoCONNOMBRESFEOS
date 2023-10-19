package Nemoo;

import java.util.List;
import java.util.stream.Collectors;

public class Nemo3 {
		public int profundidad = 0;
		public Posicion3 posicion;
		public  Rotacion rotacion ;

		
		public Nemo3(Posicion3 posicion1, Rotacion rotacion1 ) {
			posicion = posicion1;
			rotacion = rotacion1;
		}
		
		
	    public int getProfundidad() {
	        return profundidad;
	    }
	    
	    public Posicion3 getPosicion() {
	        return posicion;
	    }
	    
	    public String getRotacion() {
	        return rotacion.rotacionGetter(); //fijarse que al getter lo puedo hacer durectamente como un atributo de cada rotacion
	    }
		
	    public int getY () {
			return posicion.posGetY();
		}
	    
	    public int getX () {
			return posicion.posGetX();
		}
 
		public Nemo3 movimientovacio(char comandovacio) { 
			if (comandovacio == ' ') {
				return this;
			}
			return null;
		}

		 //movimientoD es commandD
		//movimientoU es Ascend
		//movimientoL y movimientoR son girarizq y girar derecha 
		
		
		public Nemo3 movimientoM (char comandoM) {
			if (comandoM == 'm' && (profundidad == 0 || profundidad == 1)) {
				//capsuleStock -= 1;
				return this;
			}
			else {
				throw new Error("no se puede tirar misil en estas condiciones");
			}
		}

		

		
		public Nemo3 ejecutarComandos(String comandos) {
	        // Convert the string to a list of characters
	        List<Character> listaComandos = comandos.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.toList());

	        for (char comando : listaComandos) {
	            	Command.listaDeComandos.stream()
		            .filter(command -> command.encontrarKey(comando)) //comando es el char que viene d elas acciones de nemo. command es cada objeto de la lista de Comandos.
		            .findFirst()
		            .orElse(null).ejecutador(this);
	            }
			return this;
	        }
	 
	
		}

