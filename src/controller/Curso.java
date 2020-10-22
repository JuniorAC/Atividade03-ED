package controller;

public class Curso {

	private int id;
	private String nome;
	private String area;
	private int semetres;
	private String periodo;
	
	public Curso(int id, String nome, String area, int semestres, String periodo) {
		super();
	this.id = id;
	this.nome = nome;
	this.area = area;
	this.semetres = semestres;
	this.periodo = periodo;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getArea() {
		return area;
	}
	public int getSemetres() {
		return semetres;
	}
	
	public String getPeriodo() {
		return periodo;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	public void setSemetres(int semetres) {
		this.semetres = semetres;
	}
	
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	@Override
	public String toString() {
		String retorno = ("Curso- " + this.nome + "  ID- " + this.id + "  area do curso- " + this.area + "  quantidade de semestres- " + this.semetres + "  periodo- " + this.periodo );
		return retorno;
	}
	
}
