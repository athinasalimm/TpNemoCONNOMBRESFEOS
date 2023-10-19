package Nemoo;

public class Posicion3{
		
		private int coordenadaX;
		private int coordenadaY;

		public Posicion3 (int coordenadaX, int coordenadaY) {
			this.coordenadaX = coordenadaX;
			this.coordenadaY = coordenadaY;
			}
		
		public int posGetX () {
			return this.coordenadaX;
		}
		
		public int posGetY () {
			return this.coordenadaY;
		}

		public void setY(int coordenadaY) {
	        this.coordenadaY = coordenadaY;
	    }
		
		public void setX(int coordenadaX) {
	        this.coordenadaX = coordenadaX;
	    }
		
		public Posicion3 suma(Posicion3 anotherCoord) {
			int newX = this.coordenadaX + anotherCoord.coordenadaX;
			int newY =  this.coordenadaY + anotherCoord.coordenadaY;
			Posicion3 newPosicion = new Posicion3(newX,newY);
			return newPosicion;
		}
	

}
