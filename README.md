# Diferença entre classe e objeto:

-> Classe é uma abstração de uma entitade do mundo real, de modo a representá-la suas características propriedades/atributos, métodos, funções.
-> Objeto é uma instância da Classe. Ela herda tais propriedades e pode preenchê-las/dotá-las de sentido, propósito e dimensões.

# Construtores

-> Construtores servem para instanciar um Objeto. Podem conter todos os argumentos ou só alguns, e, conforme se demanda ou se disponibiliza, aloca os recursos necessários.
* ***Ex.:***
```
public class Goose {

    public String name;
    public String plumage;
    public Double height;

    public Goose(String name, String plumage, Double height) {
        this.name = name;
        this.plumage = plumage;
        this.height = height;
    }
```
