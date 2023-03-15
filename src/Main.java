import br.unitins.model.HillClimbing;

public class Main {

	public static void main(String[] args) {
		 double max = 5.0;
	        double min = -5.0;
	        double etapa = 0.1;
	        
	        double resultado = HillClimbing.escalada(min, max, etapa);
	        
	        System.out.println("O máximo da função ocorre em x = " + resultado);
	        System.out.println("O valor máximo da função é " + HillClimbing.funcao(resultado));

	}

}
