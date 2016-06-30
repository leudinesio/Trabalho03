    import java.util.Locale;
	import java.util.Scanner;
	
public class trabalho3 {

	
		/*Esta fun��o mostra na tela o menu.
		 *
		 */
		
		private static Scanner sc;

		public static void mostrarMenu(){
			System.out.println("\n1 - Imprimir tabela");
			System.out.println("2 - Pesquisar Produto");
			System.out.println("3 - Mostrar Produto mais caro");
			System.out.println("4 - Mostrar c�digo e descri��o dos produtos cuja quantidade est� abaixo de 10 ");
			System.out.println("5 - Ativo total do estoque");
			System.out.println("6 - Efetuar uma venda");
			System.out.println("7 - Sair");
			
			System.out.println("Digite uma op��o de 1 a 7\n");
		}
		/*Esta fun��o mostra na tela, a tabela dos produtos inseridos anteriormente
		 * @ param Codigo[] � o C�digo do produto.
		 * @ param Descricao[] � a Descri��o do produto.
		 * @ param Preco[] � o Pre�o do produto.
		 * @ param Estoque[] � a quantidade existente do produto no estoque.
		 * @ param N � a quantidade de produtos declarados pelo usuario.
		 */
		public static void mostrarTabela(int Codigo[], String Descricao[], double Preco[], int Estoque[], int N){
			int i;
			
				System.out.print("\nC�digo do Produto");
				System.out.print("\tDescri��o ");
				System.out.print("\tPre�o ");
				System.out.print("\t\tQuantidade no Estoque\n ");
				
				for(i=1; i<N+1; i++){
					System.out.print("\n" + Codigo[i] + "\t\t\t" + Descricao[i] + "\t\t"
							+ Preco[i] + "\t\t\t" + Estoque[i]);
				}
			
		
		}
		/*Esta fun��o pesquisa um produto usando em base o C�digo do produto 
		 * @ param Codigo[] � o C�digo do produto.
		 * @ param Descricao[] � a Descri��o do produto.
		 * @ param Preco[] � o Pre�o do produto.
		 * @ param Estoque[] � a quantidade existente do produto no estoque.
		 */


		public static void pesquisarProduto(int Codigo[], String Descricao[], double Preco[], int Estoque[], int N, int pesquisa){
			int i, pos;
			double totalEstoque;
			
			pos=0;
			
			for(i=1; i<N+1; i++){
				if(pesquisa == Codigo[i]){
					pos=i;
				}			
			}
			if(pos!=0){
				totalEstoque = 0;
				totalEstoque = (Preco[pos] * Estoque[pos]);
				
				System.out.print("\nC�digo do Produto");
				System.out.print("\tDescri��o ");
				System.out.print("\tPre�o ");
				System.out.print("\t\tQuantidade no Estoque ");
				System.out.println("\t\tValor Total no Estoque\n");
				
				System.out.println("\n" + Codigo[pos] + "\t\t\t" + Descricao[pos] + "\t\t"
						+ Preco[pos] + "\t\t\t" + Estoque[pos] + "\t\t\t\t" + totalEstoque);
			}
			else{
				System.out.println("C�digo do produto � inexistente");
			}
			
		}
		/**
		 * Imprime na tela a o codigo,descricao,custo e quantidade do produto mais caro cadastrado
		 * @param codigo vetor String ja preenchido
		 * @param descricao vetor String ja preenchido
		 * @param custo vetor double ja preenchido
		 * @param estoque vetor int ja preenchido
		 */


		public static void mostrarProdutoMaisCaro(int Codigo[], String Descricao[], double Preco[], int Estoque[], int N){
		int pos, i;
		pos = 1;
					for(i=1; i<N+1; i++){
						
						if (Preco[i] > Preco[pos]) {
							pos = i;
						}
						
					}
				System.out.println("\n" + Codigo[pos] + "\t\t\t" + Descricao[pos] + "\t\t"
						+ Preco[pos] + "\t\t\t" + Estoque[pos]);
		}
		/**
		 * Imprime na tela o codigo e descricao do(s) produto(s) com estoque baixo de 10 unidades
		 * @param codigo vetor String ja preenchido
		 * @param descricao vetor String ja preenchido
		 * @param estoque vetor int ja preenchido
		 */
		
		public static void MostrarProdutoAbaixoDeDez(int Codigo[], String Descricao[], double Preco[], int Estoque[], int N){
			int i;
			
				for(i=1; i<N+1; i++){
						if(Estoque[i] < 10){
							System.out.println(Codigo[i] + "\t\t\t" + Descricao[i] + "\t\t"
									+ Preco[i] + "\t\t\t" + Estoque[i]);
						}
					}
		}
		
		/**
		 * Imprime na tela o valor total (custo x estoque)
		 * @param custo Vetor double ja preenchido
		 * @param estoque Vetor int ja preenchido
		 */
		public static void AtivoTotalEstoque(int Codigo[], String Descricao[], double Preco[], int Estoque[], int N){
		
			int somaTotalEstoque, i;
			
		somaTotalEstoque = 0;
		
				for(i=1; i<N+1; i++){
					somaTotalEstoque = (int) ((Preco[i]*Estoque[i]) + somaTotalEstoque);
			}
			
			System.out.println(somaTotalEstoque);
		}
		/*Esta fun��o pesquisa um produto usando o C�digo do produto para que seja efetuada uma venda. 
		 * @ param Codigo[] � o C�digo do produto.
		 * @ param Descricao[] � a Descri��o do produto.
		 * @ param Preco[] � o Pre�o do produto.
		 * @ param Estoque[] � a quantidade existente do produto no estoque.
		 */
		
		public static void EfetuarVenda(int Codigo[], String Descricao[], double Preco[], int Estoque[], int N){
			sc = new Scanner(System.in);
			int i, CodigoVenda, QuantidadeVend, pos;
			
			pos = 0;
			QuantidadeVend=0;
			CodigoVenda = 0 ;
			
		
		System.out.println("C�digo do Produto");
		CodigoVenda = sc.nextInt();
		
					for(i=1; i<N+1; i++){
						
						 if(CodigoVenda == Codigo[i]){
							 pos = i;
						 }

					}
					
					if(pos != 0){
						
						System.out.println("Quantidade a ser vendida: ");
						QuantidadeVend = sc.nextInt();
						
							if(QuantidadeVend <= Estoque[pos]){
								Estoque[pos] = Estoque[pos] - QuantidadeVend;
								System.out.println("Venda efetuada com Sucesso! ");
							}
							else{
						System.out.println("Venda n�o efetuada. Quantidade insuficiente");
					}
				}
					else{
						System.out.println("Produto n�o encontrado! ");
					}
					
		}

		/*Esta fun��o abandona/finaliza o Programa.
		*/
		public static void exit(){
		
		}
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			sc.useLocale(Locale.ENGLISH);
			Locale.setDefault(new Locale("en", "US"));
			
						
			String Descricao[];
			int i, N, Codigo[], acao, pesquisa, Estoque[];
			double Preco [];
					
			System.out.println("Quantidade de produtos a serem cadastrados: ");
			N = sc.nextInt();
						
			Codigo = new int[N+1];
			Estoque = new int[N+1];
			Preco = new double[N+1];
			Descricao = new String[N+1];
			
			System.out.println("Digite os elementos da tabela: ");
			
			for(i=1; i<N+1; i++){
				
				System.out.println("\nC�digo do Produto:\n");
				Codigo[i] = sc.nextInt();
				
				System.out.println("\nDescri��o:");
				Descricao[i] = sc.next();
				
				
				System.out.println("\nPre�o:");
				Preco[i] = sc.nextDouble();
				
				
				System.out.println("\nQuantidade no Estoque:");
				Estoque[i] = sc.nextInt();
			}
		
				
			acao = 0;
			if(acao<0 || acao>7){
				System.out.println("Digite uma op��o valida de 1 a 7");
			}
				mostrarMenu();
				acao = sc.nextInt();
				
			while(acao != 7){
		
				
				if(acao == 1){
					mostrarTabela(Codigo, Descricao, Preco, Estoque, N);
					System.out.println("\n");

					mostrarMenu();
					acao = sc.nextInt();
					}
				if(acao == 2 ){
					System.out.println("Digite o c�digo do produto: ");
					pesquisa = sc.nextInt();
					pesquisarProduto(Codigo, Descricao, Preco, Estoque, N, pesquisa);
					System.out.println("\n");

					mostrarMenu();
					acao = sc.nextInt();
				}
				
				if(acao == 3){
					mostrarProdutoMaisCaro(Codigo, Descricao, Preco, Estoque, N);

					mostrarMenu();
					acao = sc.nextInt();
				}
					
				if(acao == 4){

					MostrarProdutoAbaixoDeDez(Codigo, Descricao, Preco, Estoque, N);

					mostrarMenu();
					acao = sc.nextInt();				
				}

				if(acao == 5){
					AtivoTotalEstoque(Codigo, Descricao, Preco, Estoque, N);

					mostrarMenu();
					acao = sc.nextInt();				
					
				}
				
				if(acao == 6){

					EfetuarVenda(Codigo, Descricao, Preco, Estoque, N);

					mostrarMenu();
					acao = sc.nextInt();
				}
				if(acao == 7){
					exit();

				}
			
		
			}
			sc.close();

	}

}
