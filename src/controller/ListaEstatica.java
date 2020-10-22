package controller;

import javax.swing.JOptionPane;

public class ListaEstatica {
	private Curso dados[];                  
	private int tamanho;                 

	public ListaEstatica(){                       
		dados =new Curso [5];                    
		tamanho=0;                            
	}

	public void AdicionaFinal(Curso e){     

		if (tamanho<dados.length){
			dados[tamanho]=e;                     
			tamanho++;                            
		}
		else{
			System.out.println("Lista Cheia");    
		}
	}

	public void AdicionaInicio(Curso e){   
		if (tamanho<dados.length){           
			for (int i=tamanho;i>0;i--){         
				dados[i]=dados[i-1];                 
			}
			dados[0]=e;                          
			tamanho++;                           
		}
		else{
			System.out.println("Erro, lista cheia");        
		}
	}

	public void  AdicionaQualquerPosicao(Curso e, int pos){
		int i;
		if ((tamanho<dados.length)&&(pos<tamanho+1)&&(pos>=0)){


			for (i=tamanho;i!=pos;i--){                     
				if (i!=0){                                      
					dados[i]=dados[i-1];                            
				}
			}
			dados[i]=e;                                     
			tamanho++;                                      
		}
	}

	public void RemoveFinal(){
		
		int i;
		if (tamanho>=1){                               
			JOptionPane.showMessageDialog(null,"O elemento removido foi:"+ dados[tamanho-1].toString());

			
			for (i=0;i<tamanho;i++){                       
				if (i==tamanho-1)                             
					tamanho--;                                    
			}
		}
		
	}

	public void RemoveInicio(){
		
		int i;
		if (tamanho>=1){                              
			JOptionPane.showMessageDialog(null,"O elemento removido foi:"+ dados[0].toString());

			for (i=1;i<tamanho;i++){                      
				dados[i-1]=dados[i];                          
			}
			tamanho--;                                   
		}
		
	}

	public int RemoveQualquerPosicao(int pos){
		int i;
		int retorno=0;                                         

		if ((pos<tamanho)&&(pos>=0)&&(tamanho>=1)){
			JOptionPane.showMessageDialog(null,"O elemento removido foi:"+ dados[pos].toString());

			for (i=pos;i<tamanho-1;i++){                 
				dados[i]=dados[i+1];                         
			}

			tamanho--;                                   
		}
		return retorno;
	}



	public String percorre(){                    
		String aux=" ";

		for (int i=0;i<tamanho;i++){
			aux=aux+"\n"+dados[i].toString();
		}
		return aux;
	}
}

