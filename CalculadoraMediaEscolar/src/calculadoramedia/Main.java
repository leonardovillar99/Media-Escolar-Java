package calculadoramedia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Digite seu nome completo: ");
		aluno.setNome(leitor.nextLine());
		
		do {
		System.out.println("Digite sua idade: ");
		aluno.setIdade(leitor.nextInt());
		
		if(aluno.idade < 10) {
			System.out.println("Erro! Sua idade deve ser maior do que 10 anos\n");
		}
		
		}while(aluno.getIdade() < 10);
		
		do {
					
		System.out.println("Digite sua primeira nota: ");
		aluno.setNota1(leitor.nextDouble());
		
		if(aluno.nota1 < 0 || aluno.nota1 > 10) {
			System.out.println("Erro! A nota deve ser maior que 0 e menor do que 10\n");
		}
		
		}while(aluno.getNota1() < 0 || aluno.getNota1() > 10);
		
		do {
			
		System.out.println("Digite sua segunda nota: ");
		aluno.setNota2(leitor.nextDouble());
		
		if(aluno.nota2 < 0 || aluno.nota2 > 10) {
			System.out.println("Erro! A nota deve ser maior que 0 e menor do que 10\n");
		}
		
		}while(aluno.getNota2() < 0 || aluno.getNota2() > 10);
		
		do {
		
		System.out.println("Digite sua terceira nota: ");
		aluno.setNota3(leitor.nextDouble());
		
		if(aluno.nota3 < 0 || aluno.nota3 > 10) {
			System.out.println("Erro! A nota deve ser maior que 0 e menor do que 10\n");
		}
		
		}while(aluno.getNota3() < 0 || aluno.getNota3() > 10);
		
		do {
		
		System.out.println("Digite sua quarta nota: ");
		aluno.setNota4(leitor.nextDouble());
		
		if(aluno.nota4 < 0 || aluno.nota4 > 10) {
			System.out.println("Erro! A nota deve ser maior que 0 e menor do que 10\n");
		}
		
		}while(aluno.getNota4() < 0 || aluno.getNota4() > 10);
		
		System.out.println("\nNome: " + aluno.getNome() + 
				"\nIdade: " + aluno.getIdade() + " anos" + 
				"\n\nNota do primeiro bimestre: " + aluno.getNota1() + 
				"\nNota do segundo bimestre: " + aluno.getNota2() +
				"\nNota do terceiro bimestre: " + aluno.getNota3() +
				"\nNota do quarto bimestre: " + aluno.getNota4() +
				"\n\nMédia Final: " + aluno.calcularMediaFinal());
		
		aluno.resultado();
	}
}
