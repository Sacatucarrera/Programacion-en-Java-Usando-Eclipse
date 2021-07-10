/**
 * 
 */

/**
 * @author marcosgt11
 *
 */
public class Coche {
int numeroRuedas;
String matricula;
boolean automatico = true;
	/**
	 * 
	 */
	public Coche(int NumeroRuedas, String mat) {
		this.numeroRuedas = NumeroRuedas;
		matricula = mat;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola estudiantes!!");
		Coche ferrari = new Coche(4,"sacatucarrera");
		System.out.println(ferrari);
		
		System.out.println(ferrari.getMatricula());
		//Uso de getters y setters
		int nr = ferrari.getNumeroRuedas();
		System.out.println(nr);
		ferrari.setMatricula("Aprobadisimos");
		String matriculaNueva = ferrari.getMatricula();
		System.out.println(matriculaNueva);
		
		//Demostración de las sentencias de código if-else-else if
		Coche trailer = new Coche(8,"AAA");
		Coche furgoneta = new Coche(3,"BBB");
		Coche tesla = new Coche(4,"CCC");
		
		comparaRuedasCoches(ferrari,trailer);
		comparaRuedasCoches(ferrari,furgoneta);
		comparaRuedasCoches(ferrari,tesla);
		
		reduceRuedasCoche(furgoneta,trailer);
		
		reduceRuedasCoche(furgoneta,trailer);
		
	}
	
	//Getter
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	
	//Setter
	public void setNumeroRuedas(int nuevoNumeroRuedas){
		numeroRuedas = nuevoNumeroRuedas;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	//Metodo comparativo de ruedas de coches
	public static void comparaRuedasCoches(Coche a, Coche b) {
		
		//Lo primero es coger las ruedas de los coches
		int NumeroRuedasA = a.getNumeroRuedas();
		int NumeroRuedasB = b.getNumeroRuedas();
		
		//Secuencia de control if-else-else if
		if(NumeroRuedasA>NumeroRuedasB) {
			System.out.println("El numero de ruedas del primer coche es mayor que el numero de ruedas del segundo coche.");
		}
		else if(NumeroRuedasA == NumeroRuedasB) {
			System.out.println("El numero de ruedas de ambos coches es el mismo.");
		}
		else {
			System.out.println("El numero de ruedas del segundo coche es mayor que el numero de ruedas del primer coche.");
		}
		
	}
	
	public static void reduceRuedasCoche(Coche a, Coche b) {
		
		//Secuencia de control while
		while(a.getNumeroRuedas() != b.getNumeroRuedas()){
			
			//Si el numero de ruedas del coche a es mayor que el del coche b
			if(a.getNumeroRuedas()>b.getNumeroRuedas()) {
				
				//Comparativa de la paridad o imparidad del numero de ruedas
				if((a.getNumeroRuedas()%2) == (b.getNumeroRuedas()%2)) {
					
					//Si son ambos numeros de ruedas pares o impares resto de dos en dos
					a.setNumeroRuedas(a.getNumeroRuedas()-2);
					
				}
				
				//Si no lo hago de uno en uno
				else {
					a.setNumeroRuedas(a.getNumeroRuedas()-1);
				}
				
			}
			
			//Caso contrario, el numero de ruedas del coche b sera mayor al de a
			else {
				
				if((a.getNumeroRuedas()%2) == (b.getNumeroRuedas()%2)) {
					
					b.setNumeroRuedas(b.getNumeroRuedas()-2);
					
				}
				
				else {
					b.setNumeroRuedas(b.getNumeroRuedas()-1);
				}
				
			}
			
		} 
		
	}
	
}