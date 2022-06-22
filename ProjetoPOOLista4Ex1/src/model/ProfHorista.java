package model;

public class ProfHorista extends Professor {
	private float salHora;
	private int totalHoras;
	

	public ProfHorista() {
		super();
	}

	public ProfHorista(String nome, String matricula, int idade, float salHora, int totalHoras) {
		super(nome,matricula,idade);
		this.salHora = salHora;
		this.totalHoras = totalHoras;
	}

	public float getSalHora() {
		return salHora;
	}

	public void setSalHora(float salHora) {
		this.salHora = salHora;
	}

	public int getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(int totalHoras) {
		this.totalHoras = totalHoras;
	}

	@Override
	public float RetornaSalario() {
		// TODO Auto-generated method stub
		 float desconto = 0.05f;
			return (salHora * totalHoras) - desconto;
			//float desconto =this.salHora*this.totalHoras;
			//float Salario=desconto-(desconto*0.05f);
	        //return Salario;

	}


	}

