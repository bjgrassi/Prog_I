package introducao08GerenteVendedorAbstract;

public class Gerente extends Empregado
{  	public Gerente(String nome, double salario)
   	{  	super(nome, salario);
    }
    
   	public void aumentaSalario(double percentual)
   	{	double novoSalario = getSalario() * (1 + 2 * percentual / 100);
		setSalario(novoSalario); 
   	}
}