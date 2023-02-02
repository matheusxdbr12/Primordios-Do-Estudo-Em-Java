# Documentação 

## Tags

> @autor -> Referencia a o Autor ou criador do conteúdo;

> @version -> Versão do recurso disponibilizado;

> @since -> Versão/Data de inicio da disponibilidade do recurso;

> @param -> Descrição dos parâmetros

> @return -> Definição do tipo de retorno de um método;

> @throws -> Se o método lança alguma exceção;

## (Oneline) 

Ex:

> // Hello, i'am a commentary    

## (MultiLine)

Ex:
> /* Hello
    * Eu sou um comentario
    * Que posso ser mais detalhado
    * quando necessarios
  */

## Documentation

Ex:
> /** 
   * Estas duas estrelinhas acima
   * é para indentificar que você
   * pretende elaborar um comentário
   * a nivel de documentação.
   * que incrivel !!!
  */

JavaDoc

Criando nossa documentação no formato html para disponibilizar via Web.

> No terminal execute o comando abaixo
> javadoc -encoding UTF-8 -decencoding ISO-8859-1 -d ../docs src/*.java