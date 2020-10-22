package controller;

import javax.swing.JOptionPane;

public class ListaLigada {
private NO inicio;
int id;
String nome;
String area;
int semestres;
String periodo; 
		
		public ListaLigada() {
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
		
		public void addInicio(Curso e){
			NO n=new NO(e);
			n.prox=inicio;
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
			Curso r = null;
			if (inicio==null){
				System.out.println("Lista Vázia");
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
			String r=" ";
			while(aux!=null){
				r=r+"\n"+aux.curso;
				aux=aux.prox;
			}
			return r;
		}
	}
