# Builder

1. Encapsula a lógica de construção de um objeto de forma mais simples, em outras palavras nao deixa que a classe que o cria seja responsavel pela sua criacao.
2. O Builder está dentro do conjunto de padrões criacionais; ele foi pensado para resolver problemas na contrução de objetos complexos.
3. Pontos:
	1. POS 
		* Torna-se muito mais sustentável construir objetos que possuam muitos campos;
		* Fica menos sujeito a erros já que se pode trabalhar de forma menos granular;
		* Aumenta a robustez do construtor;
	2. CONS
		* Torna o construtor muito detalhado e requer duplicação de código.
