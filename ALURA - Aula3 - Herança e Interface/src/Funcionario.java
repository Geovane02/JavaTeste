//n�o pode instanciar, criar objetos dessa classe, porque � abistrata



//O QUE S�O CLASSES ABSTRATAS
//As classes abstratas s�o as que n�o permitem realizar qualquer tipo de inst�ncia. 
//S�o classes feitas especialmente para serem modelos para suas classes derivadas. 
//As classes derivadas, via de regra, dever�o sobrescrever os m�todos para realizar 
//a implementa��o dos mesmos.
public abstract class Funcionario {

	//atributos
	private String nome;
	private String cpf;   //private � usado so na mesma classe, n�o libera para outras classe filhos
	private double salario; 

	
	
	
	
	public double getBonificacao() {
		return this.salario * 0.05;
	}
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	
}
