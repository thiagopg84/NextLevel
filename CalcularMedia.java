import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b1 = new Scanner(System.in);
		System.out.print("Nota da prova - 1o bimestre: ");
		double notaProva1b = b1.nextDouble();
		
		System.out.print("Nota do projeto - 1o bimestre: ");
		double notaProjeto1b = b1.nextDouble();
		
		System.out.print("Lista de exercícios - 1o bimestre: ");
		double notaEx1b = b1.nextDouble();
		
		System.out.print("Projetos de software livre - 1o bimestre: ");
		double notaPs1b = b1.nextDouble();
		
		Scanner b2 = new Scanner(System.in);
		System.out.print("Nota da prova - 2o bimestre: ");
		double notaProva2b = b2.nextDouble();
		
		System.out.print("Nota do projeto - 2o bimestre: ");
		double notaProjeto2b = b2.nextDouble();
		
		System.out.print("Lista de exercícios - 2o bimestre: ");
		double notaEx2b = b2.nextDouble();
		
		System.out.print("Projetos de software livre - 2o bimestre: ");
		double notaPs2b = b2.nextDouble();
		
		double mediaPrimeiroBimestre = ((notaProva1b * 3) + (notaProjeto1b * 3) + (notaEx1b * 2) + (notaPs1b * 3)) / 11;
		double mediaSegundoBimestre = ((notaProva2b * 3) + (notaProjeto2b * 3) + (notaEx2b * 2) + (notaPs2b * 3)) / 11;
		
		System.out.println("MÉDIA DO PRIMEIRO BIMESTRE: " + mediaPrimeiroBimestre);
		System.out.println("MÉDIA DO SEGUNDO BIMESTRE: " + mediaSegundoBimestre);
		
		double mediaSemestral = (mediaPrimeiroBimestre + mediaSegundoBimestre)/2;
		
		if (mediaSemestral >= 8) {
			System.out.println("MÉDIA SEMESTRAL: " + mediaSemestral + " ALUNO APROVADO!");
		} else {
			System.out.println("MÉDIA SEMESTRAL: " + mediaSemestral + " ALUNO REPROVADO! NOTA NECESSÁRIA NA PROVA FINAL: " + (10 - mediaSemestral));
		}
				
	}

}
