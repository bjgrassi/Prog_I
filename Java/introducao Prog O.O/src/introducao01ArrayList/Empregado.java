package introducao01ArrayList;

public class Empregado
{
	private String nome;
	private double salario;
	
	public Empregado (String n, double s)
	{	nome = n;
		salario = s;
	}

	public void imprime()
	{	System.out.println ("Nome = " + nome + "  Sal�rio = " + salario);
	}

	public String getNome()
	{	return nome;
	}
		
	public double getSalario()
	{	return salario;
	}
		
	public void setNome(String n)
	{	nome = n;
	}
		
	public void setSalario(double s)
	{	salario = s;
	}
}