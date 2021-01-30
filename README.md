## Aprendizagens durante o projeto

### @Controller x @RestController
O Spring MVC possui a anotação @Controller pra marcar aquela classe de fato como um controller, ou seja, uma classe que
vai ser responsável por receber uma requisição e direcionar para uma **página - view**. Ou seja, o seu
*return* é por default o nome de um arquivo html/jsp.

Quando estamos construindo uma API RESTful, não iremos retornar nome de arquivos de views nos métodos, em vez disso, 
retornaremos dados (json, graças ao jackson que vai fazer esse trabalho por baixo dos panos).

Portanto precisamos anotar nosssos métodos com o decorator @ResponseBody para informar que aquele método vai retornar
dados em vez de um nome de um arquivo.

Uma outra solução, mais simples, é usar @RestController em vez de @Controller na classe. Assim o spring já entenderá
que todos os métodos daquele controller vão retornar dados em vez de páginas de navegação.

### 