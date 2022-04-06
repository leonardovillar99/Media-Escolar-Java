package calculadoramedia;

public class Aluno {
     private String nome;
     private int idade;
     private int serie;
     private double nota1;
     private double nota2;
     private double nota3;
     private double nota4;
     private double mediaFinal;
     
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	public double getMediaFinal() {
		return mediaFinal;
	}
	public void setMediaFinal(double mediaFinal) {
		this.mediaFinal = mediaFinal;
	}
     
	public double calcularMediaFinal() {
		return mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
	}
	
	void resultado() {
		if(mediaFinal < 6 && mediaFinal >= 5) {
			System.out.println("Recuperação");
		} else if(mediaFinal >= 6) {
			System.out.println("Aprovado");
		} else if(mediaFinal < 5) {
			System.out.println("Reprovado");
		}
	}
     
}
