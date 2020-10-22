package View;

import javax.swing.JOptionPane;

import controller.Curso;
import controller.FiladePrioridadesSimplesmenteDinamica;
import controller.ListaDuplamenteLigada;
import controller.ListaEstatica;
import controller.ListaLigada;
import controller.PilhaSimplesmenteDinamica;

public class Menu {
	
	public static void main(String[] args) {
		
		
		 
		 int op=0;
			while(op!=99){
				op=Integer.parseInt(JOptionPane.showInputDialog("1-Lista Estática \n2-Pilha Simplesmente Dinâmica \n3-Fila de Prioridades Simplesmente Dinâmica\n4-Lista Ligada \n5-Lista Duplamente Ligada \n6-Lista Duplamente Ligada recursiva  \n99-Sair"));
				switch(op){
				case 1:
					Exlistaestatica();
					break;
				case 2:
					EXpilhasimples();
					break;
				case 3:
					EXfiladeprioridades();
					break;
				case 4:
					EXListalisgada();
					break;
				case 5:
					EXlistaduplamenteligada();
					break;
					
				case 6:
					
					break;
				case 99:
					
					break;	
				default:
					
				}
		 
	}

}

	//private static void ExlistaDuplamenteLIgadarecursiva() {
			
	//}

	private static void EXlistaduplamenteligada() {
		ListaDuplamenteLigada listaDLigada = new ListaDuplamenteLigada();
				int op = 0;
		int posicao=0;
		
		while(op!=99) {	
			op= Integer.parseInt(JOptionPane.showInputDialog("1: adiciona no inicio" + "\n2: adiciona no final \n3: adiciona qualquer posição" + "\n4: remove do inicio \n5: remove do final"+"\n6: removo qualquer posição \n7: para mostrar a lista"+ "\n99: para sair"));
			switch (op) {
			case 1:
				listaDLigada.addInicio(listaDLigada.registra());
				break;	
			case 2:
				listaDLigada.addFinal(listaDLigada.registra());
				break;
			case 3:
				posicao=Integer.parseInt(JOptionPane.showInputDialog("Digite a posição"));
				listaDLigada.addQualquer(listaDLigada.registra(),posicao);
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Removido -> " + listaDLigada.removeInicio());
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"Removido -> " + listaDLigada.removeFinal());
				break;
			case 6:
				posicao=Integer.parseInt(JOptionPane.showInputDialog("Digite a posição"));
				JOptionPane.showMessageDialog(null,"Removido -> " + listaDLigada.removeQualquer(posicao));
				break;
			case 7:
				JOptionPane.showMessageDialog(null,listaDLigada.percorre());
				break;

			case 99:
				JOptionPane.showMessageDialog(null, "Saindo");
				break;
				
			default:
				break;
				
			}
		}	
		
	}
		
	

	private static void EXListalisgada() {
		ListaLigada listaLigada = new ListaLigada();
		int posicao=0;
		 
		 
		 int op = 0;
		while(op!=99) {	
			op= Integer.parseInt(JOptionPane.showInputDialog(" 1: adiciona no início" + "\n2: adiciona no final \n3: adiciona qualquer posição" + "\n4: remove do início \n5: remove do final"+"\n6: removo qualquer posição \n7: para mostrar a lista"+ "\n99: para sair"));
			switch (op) {
			case 1:
			
				listaLigada.addInicio(listaLigada.registra());
				break;
			case 2:
				
				listaLigada.addFinal(listaLigada.registra());
				break;
			case 3:
				posicao=Integer.parseInt(JOptionPane.showInputDialog("Digite a posição"));
				listaLigada.addQualquer(listaLigada.registra(),posicao);
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Removido -> " + listaLigada.removeInicio());
				break;
			case 5:
				JOptionPane.showMessageDialog(null,"Removido -> " + listaLigada.removeFinal());
				break;
			case 6:
				posicao=Integer.parseInt(JOptionPane.showInputDialog("Digite a posição"));
				JOptionPane.showMessageDialog(null,"Removido -> " + listaLigada.removeQualquer(posicao));
				break;
			case 7:
				JOptionPane.showMessageDialog(null,listaLigada.percorre());
				break;

			case 99:
				JOptionPane.showMessageDialog(null, "Saindo");
				break;
				
			default:
				break;
				
			}
		}	
		
	}
		
	

	private static void EXfiladeprioridades() {
		FiladePrioridadesSimplesmenteDinamica FilaDinamica = new FiladePrioridadesSimplesmenteDinamica();
		
		int op = 0;
		
		while(op!=99) {	
			op= Integer.parseInt(JOptionPane.showInputDialog("1: adicionar ao final da fila \n2: remove do início da fila \n3: para mostrar a lista"+ "\n99: para sair"));
			switch (op) {		
			case 1:
				FilaDinamica.addFinal(FilaDinamica.registra());
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"Removido -> " + FilaDinamica.removeInicio());
				break;
			case 3:
				JOptionPane.showMessageDialog(null,FilaDinamica.percorre());
				break;

			case 99:
				JOptionPane.showMessageDialog(null, "Saindo");
				break;
				
			default:
				break;
				
			}
		}	
		
	}
		
	

	private static void EXpilhasimples() {
		PilhaSimplesmenteDinamica pilha = new PilhaSimplesmenteDinamica();
		
		int op = 0;
		
		while(op!=99) {	
			op= Integer.parseInt(JOptionPane.showInputDialog("1: adiciona no topo \n2: remove do topo \n3: para mostrar a lista \n99: para sair"));
			switch (op) {
			case 1:
				pilha.addTopo(pilha.registra());
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"Removido -> " + pilha.removeTopo());
				break;
			case 3:
				JOptionPane.showMessageDialog(null,pilha.percorre());
				break;
			case 99:
				JOptionPane.showMessageDialog(null, "Saindo");
				break;
				
			default:
				break;
				
			}
		}	
		
	}
		
	

	private static void Exlistaestatica() {
		ListaEstatica ListaEstatic = new ListaEstatica();
		 int id;
		 String nome;
		 String area;
		 int semestres;
		 String periodo; 
		
		
		int op=0,pos;
		while(op!=99){
			op=Integer.parseInt(JOptionPane.showInputDialog("Cadastro\n1-Adiciona Final\n2-Adiciona Início\n3-Adiciona em uma posição específica\n"
					+ "4-Remove Final\n5-Remove Início\n6-Remove de uma posição específica\n7-Mostra Elementos\n99-Sair"));

			switch(op){
			case 1:
				nome = JOptionPane.showInputDialog("Informe o nome do curso");
				id = Integer.parseInt(JOptionPane.showInputDialog("Id do curso"));
				area = JOptionPane.showInputDialog("Area do curso");
				semestres =Integer.parseInt(JOptionPane.showInputDialog("Quantidade de semestres"));
				periodo =JOptionPane.showInputDialog("Periodo ");
				
				ListaEstatic.AdicionaFinal(new Curso (id, nome, area, semestres, periodo ));                  
			
				break;
			case 2:
				nome = JOptionPane.showInputDialog("Informe o nome do curso");
				id = Integer.parseInt(JOptionPane.showInputDialog("Id do curso"));
				area = JOptionPane.showInputDialog("Area do curso");
				semestres =Integer.parseInt(JOptionPane.showInputDialog("Quantidade de semestres"));
				periodo =JOptionPane.showInputDialog("Periodo ");
				
				ListaEstatic.AdicionaInicio(new Curso (id, nome, area, semestres, periodo ));                                           	   
				
				break;
			case 3:
				nome = JOptionPane.showInputDialog("Informe o nome do curso");
				id = Integer.parseInt(JOptionPane.showInputDialog("Id do curso"));
				area = JOptionPane.showInputDialog("Area do curso");
				semestres =Integer.parseInt(JOptionPane.showInputDialog("Quantidade de semestres"));
				periodo =JOptionPane.showInputDialog("Periodo ");
				pos=Integer.parseInt(JOptionPane.showInputDialog("Informe a posicao do vetor que você deseja inserir o curso"));
				pos=pos-1;     

				if (!(pos<=0 || pos >5)){
					ListaEstatic.AdicionaQualquerPosicao(new Curso (id, nome, area, semestres, periodo ), pos);
				}
				break;
			case 4:
				ListaEstatic.RemoveFinal();
				break;
			case 5:
				ListaEstatic.RemoveInicio();
				break;
			case 6:
				pos=Integer.parseInt(JOptionPane.showInputDialog("Informe a posição do vetor que você deseja remover a idade"));
				pos=pos-1;     
				ListaEstatic.RemoveQualquerPosicao(pos);
				break;
			case 7:
				JOptionPane.showMessageDialog(null,"Lista:"+ListaEstatic.percorre());       
				break;
			case 99:
				JOptionPane.showMessageDialog(null,"Saindo");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Opção inválida");
			}	
		
		}
}
	}