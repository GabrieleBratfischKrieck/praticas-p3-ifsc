package ifsc;

import java.util.ArrayList;

public class Animalmain {

	public static void main(String[] args) {
		
		
		ArrayList<Gato>gatinhos = new ArrayList<>();
		Gato gato1 = new Gato ();
		
		gato1.setNome("Frederico");
		gato1.setRaca("Siamês");
		gato1.setComprimento(30f);
		gato1.setCor("laranja");
		gato1.setNumerodepatas(4);
		gato1.setEcossistema("Casa");
		
		
		Gato gato2 = new Gato ();
		gato2.setNome("Ramon");
		gato2.setRaca("Siamês");
		gato2.setComprimento(35f);
		gato2.setCor("laranja");
		gato2.setNumerodepatas(3);
		gato2.setEcossistema("Casa");
		
		
		Gato gato3 = new Gato();
		gato3.setNome("Priscila");
		gato3.setRaca("Angorá");
		gato3.setComprimento(40f);
		gato3.setCor("branco");
		gato3.setNumerodepatas(4);
		gato3.setEcossistema("Casa");
		
		gatinhos.add(gato1);
		gatinhos.add(gato2);
		gatinhos.add(gato3);
		 
		ArrayList<Cachorro>cachorrinhos = new ArrayList<>();
		Cachorro cachorro1 = new Cachorro ();
		
		cachorro1.setComprimento(60f);
		cachorro1.setCor("preto");
		cachorro1.setEcossistema("casa");
		cachorro1.setNumerodepatas(4);
		cachorro1.setRaca("vira lata");
		cachorro1.setNome("Tobinho");
		
		Cachorro cachorro2 = new Cachorro ();
		cachorro2.setComprimento(50f);
		cachorro2.setCor("marrom");
		cachorro2.setEcossistema("casa");
		cachorro2.setNome("xixa");
		cachorro2.setNumerodepatas(4);
		cachorro2.setRaca("Fox paulistinha");
		
		
		
		Cachorro cachorro3 = new Cachorro ();
		cachorro3.setComprimento(70f);
		cachorro3.setCor("branco");
		cachorro3.setEcossistema("casa");
		cachorro3.setNome("mel");
		cachorro3.setNumerodepatas(4);
		cachorro3.setRaca("pastor alemão");
		
		
		cachorrinhos.add(cachorro1);
		cachorrinhos.add(cachorro2);
		cachorrinhos.add(cachorro3);
		
		for (Cachorro cachorro : cachorrinhos) {
			System.out.println(cachorro.getNome());
			System.out.println(cachorro.getRaca());
			System.out.println(cachorro.getComprimento());
			System.out.println(cachorro.getCor());
			System.out.println(cachorro.getNumerodepatas());
			System.out.println(cachorro.getEcossistema());
			
		
		}
		
		for (Gato gato : gatinhos) {
			System.out.println(gato.getNome());
			System.out.println(gato.getRaca());
			System.out.println(gato.getComprimento());
			System.out.println(gato.getCor());
			System.out.println(gato.getNumerodepatas());
			System.out.println(gato.getEcossistema());
		}
	}

}
