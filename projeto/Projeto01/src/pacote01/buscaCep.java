package pacote01;

public class buscaCep {

	public String cepcliente, estado;
	String SP = new String ("SP");
	String MG = new String ("MG");
	String RJ = new String ("RJ");
	String ES = new String ("ES");
	public float valordofrete;
	
	public float calcularFrete(){
		
		WebServiceCep webcep = WebServiceCep.searchCep(cepcliente);
		if(webcep.wasSuccessful()) {
			estado = webcep.getUf();
//			System.out.println(estado);
			if (estado.equals(SP)) {
				valordofrete = 10;
			}else if (estado.equals(ES) || estado.equals(MG) || estado.equals(RJ)) {
				valordofrete = 15;
			}else {
				valordofrete = 20;
			}
			
		}
		return valordofrete;
	}
	
}