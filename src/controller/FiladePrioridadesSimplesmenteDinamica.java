package controller;

import javax.swing.JOptionPane;

public class FiladePrioridadesSimplesmenteDinamica {
private NO inicio;
int id;
String nome;
String area;
int semestres;
String periodo; 

	public FiladePrioridadesSimplesmenteDinamica() {
		inicio =null;
	}
	
	
	public  Curso registra() {
		id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do curso"));
		nome = (JOptionPane.showInputDialog("Digite o nome do curso"));
		area = (JOptionPane.showInputDialog("Digite a área do curso"));
		semestres = (Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de semestres")));
		periodo = (JOptionPane.showInputDialog("Digite o período"));
		
		Curso curso = new Curso(id, nome, area, semestres, periodo);
		return curso;
	}

	public void addFinal(Curso curso){
		if (inicio==null){
			NO n=new NO(curso);
			inicio=n;
		}
		else{
			NO aux=inicio;
			while(aux.prox!=null){
				aux=aux.prox;
			}
			NO n=new NO(curso);
			aux.prox=n;
		}
	}
	
	public Curso removeInicio(){
		Curso r=null;
		if (inicio==null){
			JOptionPane.showMessageDialog(null,"Lista Vázia");
		}
		else{
			r=inicio.curso;
			inicio=inicio.prox;
		}
		return r;
	}
	
	
	public String percorre(){
		NO aux=inicio;
		String r=" ";
		while(aux!=null){
			r=r+"\n"+aux.curso;
			aux=aux.prox;
		}
		return r;
	}
}
