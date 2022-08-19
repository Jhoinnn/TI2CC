package aulaaa;
//import java.io.RandomAccessFile;//
public class Aulaaaa {
//Metodo de leitura pedido no enunciado da quest�o//
	//teste integraçao 1//
	
	public static int somando(int numA,int numB)//Método com retorno em int para soma//
	   {
	  int resposta;
	  
	  resposta=numA+numB;
	  
	   
	   
	   
	   return resposta;
	   
	   }
		
		
		
	public static void main(String[] args)
	{
	 int a,b;
	 int resp;
	int Continuar=1;
	 	
	
		
		
		while(Continuar==1) {//Repetição para parar quando pedido//
			MyIO.print("Digite o primeiro numero ");
		 	a=MyIO.readInt();
		 	MyIO.print("Digite o segundo numero ");
			b=MyIO.readInt();
		resp=somando(a,b);
		
		MyIO.println("A soma eh "+resp);
		
		MyIO.print("Deseja continuar?(1)Sim (2)Nao ");
		
		Continuar=MyIO.readInt();
		
		}
		
	}  
	}
		