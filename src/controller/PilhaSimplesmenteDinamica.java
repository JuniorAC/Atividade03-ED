package controller;

import javax.swing.JOptionPane;

public class PilhaSimplesmenteDinamica {
private NO inicio;
int id;
String nome;
String area;
int semestres;
String periodo; 
	
	public PilhaSimplesmenteDinamica() {
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

	public void addTopo(Curso curso){
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
	
	
	public Curso removeTopo(){
		Curso r = null;
		if (inicio==null){
			System.out.println("Pilha Vázia");
		}
		else{
			if (inicio.prox==null){
				r=inicio.curso;
				inicio=null;
			}
			else{
				NO aux1=inicio;
				NO aux2=inicio;

				while(aux1.prox!=null){
					aux2=aux1;
					aux1=aux1.prox;
				}

				r=aux1.curso;
				aux2.prox=null;
			}
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
