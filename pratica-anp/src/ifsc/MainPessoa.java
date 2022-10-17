package ifsc;

public class MainPessoa {

	public static void main(String[] args) {
	
		Professor  professor = new Professor ();
		
		professor.setNome("Gabriele");
		professor.setCpf("10281170940");
		professor.setSiape(2039080);
		
		Aluno aluno = new Aluno ();
		
		aluno.setCpf("03194076914");
		aluno.setMatricula(2023456);
		aluno.setNome("Deise");
		
		System.out.println(aluno.getCpf());
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMatricula());
		System.out.println(professor.getCpf());
		System.out.println(professor.getNome());
		System.out.println(professor.getSiape());
		}

}
