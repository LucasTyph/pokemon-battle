# pokemon-battle

Programa feito por Lucas de Menezes (NUSP 10770180) e Vinícius Lopes (NUSP 10770134). O exercício 1 é uma batalha 6 vs 6, em que cada um dos dois treinadores escolhe 6 Pokemon entre os 19 possíveis, para então batalhar até que os 6 de um deles não possa mais batalhar. O exercício 2 é uma viagem por uma paisagem exótica, encontrando Pokémon selvagens no caminho -- o treinador começa com 3 Pokémon, e pode capturar outros no caminho, adquirindo uma equipe completa, se assim desejar.

# Instruções

O jogo funciona à base de input de números inteiros pelo usuário. Cada ação é indicada por um número entre colchetes. Por favor não insira elementos que não são números inteiros.

Para começar, escolha '1' para acessar o modo Versus, e '2' para acessar o modo Wild.

# Modo Versus

É impressa uma lista de Pokémon disponíveis. O treinador 1 escolhe 6 deles pelo número da PokéDex (indicado entre colchetes), e o treinador 2 faz o mesmo. Cada treinador realiza uma ação, dentre as quais estão as opções originais dos jogos Pokémon -- Atacar, Trocar de Pokémon, Usar item, Fugir. A batalha termina quando o HP (vida) de todos os Pokémon de um treinador estiver zerado.

# Modo Wild

Da mesma forma, é impressa uma lista de Pokémon disponíveis. O treinador escolhe três. Se decidir caminhar pela trilha, terá uma viagem calma e tranquila. Se decidir adentrar no gramado, terá uma chance de encontrar Pokémon selvagem. Durante a batalha, terá as mesmas ações -- Atacar, Trocar de Pokémon, Usar item, Fugir. No caso, o único item que pode ser usado são PokéBolas. Elas te dão uma chance de capturar o Pokémon selvagem, que aumenta conforme seu HP diminui. Os Pokémon capturados são adicionados ao grupo do treinador até ele alcançar 6, e então são mandados para o laboratório, ficando inacessíveis. Não há um fim definido, e o jogo só termina quando o grupo do treinador estiver totalmente incapaz de batalhar (todos com HP zerado), ou o vetor de eventos chegar a seu fim.
