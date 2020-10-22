package controller;

import javax.swing.JOptionPane;

public class ListaDuplamenteLigada {
private NO inicio;
int id;
String nome;
String area;
int semestres;
String periodo; 

	public ListaDuplamenteLigada() {
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

	public void addFinal(Curso e){
		NO n= new NO(e);
		
		if (inicio==null) {
			inicio=n;
			n.ant=null;
			n.prox=null;
		}
		else {
			NO aux=inicio;
				while(aux.prox!=null) {
					aux=aux.prox;
				}
			aux.prox=n;
			n.ant=aux;
			n.prox=null;
		}
	}
	
	
	public void addInicio(Curso e){
		NO n = new NO(e);
		
		if (inicio!=null) {
			n.prox=inicio;
			inicio.ant=n;
		}
		inicio=n;
	}
	
	
	public void addQualquer(Curso e, int pos) {
		NO n=new NO(e);

        if((pos)==1){          
            addInicio(e);
        }else{       
            NO aux=inicio;
            int count=1;
            
            while(aux.prox!=null && count<pos-1){
                aux=aux.prox;
                count++;
            }
            
            if(count==pos-1){
                n.prox=aux.prox;
                aux.prox=n;
            }else{
                System.out.println("Posição Inválida!");
            }            
        }
		
	}
	

	
	public Curso removeFinal(){
		Curso i=null;
		
		if(inicio==null) {
			JOptionPane.showMessageDialog(null, "VAZIA");
		}
		else {
			if(inicio.prox==null) {
				i=inicio.curso;
				inicio=null;
			}else {
				NO aux=inicio;
				NO aux2=inicio;
					while(aux.prox!=null) {
						aux2=aux;
						aux=aux.prox;
					}
				i=aux.curso;
				aux.ant=null;
				aux2.prox=null;
			}
		}
		return i;
	}

	
	
	public Curso removeInicio(){
		Curso i=null;
		
		if (inicio==null) {
			JOptionPane.showMessageDialog(null, "VAZIA");
		}
		else {
			i=inicio.curso;
			inicio=inicio.prox;
			if (inicio!=null) {
				inicio.ant=null;
			}
		}
		return i;
	}
	
	
	public Curso removeQualquer(int pos) {
		int i=1;
		NO aux=inicio;
		
        Curso e=null;
        	        
        if(inicio==null){
            System.out.println("Lista Vazia!");
            return e;
        }    
        if(pos==1){
            e=removeInicio();
            return e;
        }else{           
            while(aux.prox!=null){
                aux=aux.prox;
                i++;
            }
            if(pos>i || pos==0){
                System.out.println("Posição Invalida!");
                return e;
            }else if(pos==i){
                e=removeFinal();
                return e;
            }else{
                aux=inicio;
                NO aux2=aux;
                
                while(pos>1){
                    aux2=aux;
                    aux=aux.prox;
                    pos--;
                }
                e=aux.curso;
                aux2.prox=aux.prox;
                return e;
            }
        }
	}
	

	
	public String percorre(){
		NO aux=inicio;
		String i=" ";
		while(aux!=null){
			i=i+"\n"+aux.curso;
			aux=aux.prox;
		}
		return i;
	}
}
