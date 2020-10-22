package controller;

public class NO {
	public NO prox;
	public NO ant;
	public Curso curso;
	
	public NO(Curso e) {
		this.curso=e;
		this.ant=null;
		this.prox=null;
	}
}
