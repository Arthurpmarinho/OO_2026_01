#### UnB - Universidade de Brasilia / FGA - Faculdade do Gama / FGA0158 - Orientação por Objetos
#### Estudo Dirigido - Modularidade e Encapsulamento

###### Exercícios conceituais sobre Orientação a Objetos:
Para cada um dos tópicos abaixo, forneça uma definição clara e objetiva e, sempre que aplicável, inclua um breve exemplo de sua utilidade ou sintaxe:

1. **Pacotes e Namespaces:**
    * O que é um pacote em Java e como ele é representado na linguagem UML?
    * Qual é a relação entre a importação de um pacote e a definição de um tipo (namespace) no código?

    A importação permite que o código acesse as classes definidas em um pacote. Já o namespace atua como um 'sobrenome' para a classe, garantindo que não haja conflitos de nome. Assim, é possível utilizar classes com o mesmo nome exato (ex: Aluno), desde que pertençam a namespaces (pacotes) diferentes.

2. **Ocultação de Informação (Information Hiding):**
    * O que significa dizer que um objeto deve atuar como uma "caixa-preta"?
    * Explique a diferença entre a "especificação do comportamento" (interface do objeto) e a sua "implementação" (informações encapsuladas).

    Um objeto deve atuar como uma "caixa-preta" significa que seu funcionamento interno é ocultado ao usuário, assim o usuário tem apenas acesso à interface da classe. A interface do objeto é a especificação do comportamento, ou seja é como os pacotes, outras classes ou outro desenvolvedor irão receber e interagir com esse objeto, já a implementação é o código fonte, é como o objeto é implementado, assim o usuário/desenvolvedor não tem acesso a essa implementação.

3. **Modificadores de Acesso:**
    * Diferencie detalhadamente os níveis de visibilidade: `public` (+), `protected` (#), sem modificador (padrão de pacote) e `private` (-).
    * Baseando-se na tabela de escopo, qual modificador permite acesso por uma subclasse, mas impede o acesso pelo "Mundo" (classes fora do pacote que não são subclasses)?

    O modificador 'public' permite acesso a todos os pacotes, classes e subclasses do projeto, qualquer classe pode acessar mesmo não estando no pacote. O modificador 'protected' permite acesso a classes do mesmo pacote e subclasses, porém impede o acesso de classes que não estejam no mesmo pacote. O modificator sem modificador só pode ser acessado por classes do mesmo pacote, porém subclasses desse mesmo objeto ou objetos de outros pacotes não podem acessar. O modificador 'private' só pode ser acessado apenas pela própria classe. O modificador que permite acesso por uma subclasse, mas impede o acesso pelo "Mundo" é o 'protected'.

4. **Interfaces (Contrato de Comportamento):**
    * O que significa programar para uma interface focando no "O Quê" em vez do "Como"?
    * Qual é a vantagem do "Desacoplamento" promovido pelo uso de interfaces no design de um sistema?

    Programar para uma interface focando no "O Quê" em vez do "Como"  significa que o desenvolvedor se preocupa mais com o objeto irá fazer, ou seja, interface nesse caso se preocupa com o resultado final, a metodologia que o objeto irá utilizar é irrelevante, por exemplo, calcular a área de uma figura plana, dependendo do objeto, a metodologia para chegar no resultado é diferente, mas o resultado final é o mesmo, a área. O desacoplamento é um método utilizado para promover independência do código, quando  uma classe implementa uma interface ela se torna independe para funcionar, assim se algo for modificado futuramente a chance de ocorrer um erro são bem menores.

5. **Escopo de Elementos (Dinâmico vs. Estático):**
    * Qual a diferença prática entre um atributo com escopo de *objeto* (dinâmico) e um atributo com escopo de *classe* (estático)?
    * Como os elementos estáticos são representados nos diagramas de classe UML e qual a palavra-reservada utilizada em Java para defini-los?

    Um atributo com escopo de objeto (dinâmico) representa uma varíavel que pertecente a um objeto específico, logo apenas o mesmo objeto pode alterar o valor dessa variável. Por outro lado, um atributo com escopo de classe (estático) ´representado por uma variável que pertecente a uma mesma classe, assim qualquer objeto dessa classe pode alterar o valor dessa variável e essa alteração vai afetar todos os objetos dessa classe. Nos diagramas de classe UML, os elementos estáticos são representados com o nome do elemento sublinhado. Em Java, a palavra-reservada utilizada para definir um elemento estático é 'static'.

6. **Classes e Objetos:**
    * Qual a diferença fundamental entre uma classe e um objeto no paradigma de Orientação a Objetos?
    * O que significa dizer que um objeto é uma "instância" de uma classe?

    A classe representa uma modelo do objeto, ela representa a estrutura e o comportamento que os objetos daquela classe terão em comum. Por outro lado, o objeto é a representação de classe em execução, ele que de fato existe na memória. Desse modo, dizer que um objeto é uma instância de uma classe significa que aquele objeto é uma representação daquela classe.

7. **Atributos, Métodos e Estado:**
    * O que define o "estado" de um objeto e como ocorre o princípio de "retenção de estado" ao longo da execução de um programa?
    * Qual a responsabilidade dos métodos em relação ao estado interno do objeto?

    O estado de um objeto é definido pelos valores atuais de seus atributos. O princípio de "retenção de estado" ocorre quando um objeto mantém seus valores de atributos ao longo da execução do programa, assim permitindo que os objetos possam interagir e modificar seu estado. Os métodos são responsáveis por manipular o estado interno do objeto, eles podem acessar e modificar os atributos do objeto, assim garantindo que essas modificações sejam feitas de forma controlada e consistente.

8. **Associação entre Objetos:**
    * O que significa dizer que dois objetos estão associados?
    * Como uma associação entre, por exemplo, um Cliente e seu Endereco, é estruturalmente implementada no código fonte em Java?

    Dizer que dois objetos estão associados significa que eles possuem atributos que fazem referencia um ao outro. Por exemplo, um Cliente, um objeto, possui um atributo do tipo Endereço, outro objeto, o qual representa essa associação.

9. **Encapsulamento e Ocultação da Informação:**
    * Em termos de manutenção e segurança de código, por que é considerada uma má prática declarar atributos de uma classe com o modificador de acesso `public`?
    * Como a adoção de métodos de acesso e modificação (getters e setters) ou métodos de negócio (depositar, sacar) reforça o encapsulamento de um objeto?

    Declarar atributos de uma classe como 'public' é considerado uma má prática porque isso expõe o estado do objeto, assim permitindo que qualquer parte do código possa acessar e modificar diretamente esses atributos. Desse modo, a adoção de métodos de acesso e modificação reforçam o encapsulamento de um objeto porque eles controlam de uam maneira segura e controlada, como esses dados podem ser acessados e modificados.

10. **Identidade vs. Equivalência:**
    * Se dois objetos distintos instanciados na memória possuem exatamente os mesmos valores em todos os seus atributos, isso quer dizer que eles são o "mesmo objeto"? Explique a diferença entre comparar referências (usando `==`) e comparar estados.

    Não, isso não quer dizer que eles são o "mesmo objeto". A comparação usando '==' compara as referências de memória dos objetos, ou seja, verifica se ambos os objetos apontam para a mesma localização na memória. Já a comparação de estados, geralmente feita utilizando o método 'equals()', verifica se os valores dos atributos dos objetos são iguais, independentemente de serem ou não o mesmo objeto na memória. Assim, dois objetos podem ser considerados equivalentes em termos de estado, mas ainda assim serem objetos distintos em termos de identidade.
---

#### Exercícios práticos

1. Suponha que existam dois pacotes no seu projeto: `graduacao` (contendo uma classe `Aluno` com os atributos `matricula`, `nome` e `curso`) e `posgraduacao` (contendo uma classe `Aluno` com os atributos `matricula`, `nome` e um relacionamento `orientador` apontando para a classe `Professor`). 
Analise o trecho de código abaixo e indique quais atribuições estão corretas e quais darão erro, justificando o motivo com base na importação realizada:

```java
import graduacao.Aluno;

class Principal {
    public static void main (String[] args) {
        Professor p = new Professor("Leslie Lamport");
        Aluno a = new Aluno();
        
        // a.________;  acesso aos elementos de a
        a.matricula = 13;
        a.nome = "Andre";
        a.curso = "Engenharia de Software"; 
        a.orientador = p; 
    }
}
```
Nesse caso, o erro está na linha 'a.orientador' porque a classe aluno importada do pacote 'graduacao' não possui o atributo 'orientador', esse atributo pertence a classe Aluno do pacote 'posgraduacao', assim o código não tem acesso a esse atributo. O restante das atribuições estão corretas porque a classe Aluno do pacote 'graduacao' possui os atributos 'matricula', 'nome' e 'curso'.

2. Analise o seguinte trecho de código. Apresente o que será impresso no console ao final da execução do método `main` e justifique a saída explicando os conceitos de referência de memória e retenção de estado de objetos em Java.

```java
public class TesteIdentidade {
    public static void main (String[] args) {
        Carro c1 = new Carro();
        c1.modelo = "Fusca";
        c1.ano = 1970;

        Carro c2 = c1;
        c2.ano = 1972;

        Carro c3 = new Carro();
        c3.modelo = "Fusca";
        c3.ano = 1972;

        System.out.println("Ano de c1: " + c1.ano);
        System.out.println("c1 == c2: " + (c1 == c2));
        System.out.println("c1 == c3: " + (c1 == c3));
    }
}

class Carro {
    String modelo;
    int ano;
}
```

Ano de c1: 1972
c1 == c2: true
c1 == c3: false



3. Suponha que o código abaixo esteja distribuído em dois pacotes distintos dentro do seu projeto: `recursos_humanos` e `sistema`. Analise o método `main` e indique claramente quais linhas apresentarão erros de compilação. Justifique cada um dos erros baseando-se na tabela de visibilidade dos modificadores de acesso em Java.

```java
// Arquivo: recursos_humanos/Funcionario.java
package recursos_humanos;

public class Funcionario {
    public String nome;
    protected double salario;
    String cargo; // Modificador padrão (package-private / default)
    private String senhaDeAcesso;
}

// Arquivo: sistema/Principal.java
package sistema;

import recursos_humanos.Funcionario;

public class Principal {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        
        f.nome = "Maria";                 // Linha 1
        f.salario = 3500.0;               // Linha 2
        f.cargo = "Analista de Dados";    // Linha 3
        f.senhaDeAcesso = "1234mudar";    // Linha 4
    }
}
```
Linha 2, Linha 3 e Linha 4 apresentarão erros de compilação. O erro na Linha 2 ocorre porque o atributo 'salario' é protegido (protected) e a classe 'Principal' não é uma subclasse de 'Funcionario', logo não tem acesso a esse atributo. O erro na Linha 3 ocorre porque o atributo 'cargo' tem o modificador de acesso padrão (package-private), ou seja, só pode ser acessado por classes do mesmo pacote, e 'Principal' está em um pacote diferente. O erro na Linha 4 ocorre porque o atributo 'senhaDeAcesso' é privado (private) e só pode ser acessado dentro da própria classe 'Funcionario', portanto, não pode ser acessado por 'Principal'.

4. Analise o código abaixo que trabalha com Escopo de Elementos (Dinâmico vs. Estático). Apresente detalhadamente quais serão os valores impressos para o usuário na tela ao final da execução e explique por que a variável estática se comporta de forma diferente da variável de escopo de objeto.

```java
public class Conta {
    public int numero;
    public double saldo; // Escopo dinâmico (pertence ao objeto)
    public static double taxaRendimento = 0.05; // Escopo estático (pertence à classe)

    public void render() {
        saldo = saldo + (saldo * taxaRendimento);
    }

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numero = 101;
        c1.saldo = 1000.0;

        Conta c2 = new Conta();
        c2.numero = 102;
        c2.saldo = 2000.0;

        // Alterando a taxa através da classe
        Conta.taxaRendimento = 0.10; 
        
        c1.render();
        
        // Alterando a taxa através da referência do objeto c2
        // Em Java isso é possível, embora desaconselhado.
        c2.taxaRendimento = 0.20; 
        
        c2.render();

        System.out.println("Saldo c1: " + c1.saldo);
        System.out.println("Saldo c2: " + c2.saldo);
        System.out.println("Taxa atual global: " + Conta.taxaRendimento);
    }
}
```

Saldo c1: 1100.0
Saldo c2: 2400.0
Taxa atual global: 0.20

5. **Modelagem, Associação e Encapsulamento:** Escreva o algoritmo (em código Java) necessário para representar uma compra. Para isso, crie as classes `Cliente` e `CarrinhoDeCompras`.

**Regras para implementação:**
* A classe `Cliente` deve possuir os atributos `nome` e `cpf`.
* A classe `CarrinhoDeCompras` deve possuir um atributo `total` (Double) e uma associação obrigatória para o `Cliente` dono do carrinho.
* **Regra de Encapsulamento:** Todos os atributos de ambas as classes devem ser estritamente privados (`private`).
* Você deverá codificar a lógica da classe `CarrinhoDeCompras` de forma que possua um método `adicionarItem(double valor)`. Esse método será a única maneira pela qual uma classe externa poderá modificar (aumentar) o total do carrinho. O total nunca pode ser manipulado livremente por fora.
* Crie um método `main` (pode ser dentro de uma classe `Principal`) onde você instancie um cliente "João", associe-o a um carrinho criado, e adicione dois itens ao carrinho (um no valor de 50.0 e outro no valor de 100.0). Por fim, imprima o nome do dono do carrinho e o valor total utilizando os métodos `getters`.