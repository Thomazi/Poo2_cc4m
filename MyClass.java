public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + z);
    }
}

public class Cliente {
    private String nome; 
    private String cpf;
}

public class Veiculo {
    private int ano;
    private String marca;
    private String cor;
    private String placa;
    private Modelo modelo;
}

public class Modelo {
    private String nome;
    private Veiculo veiculo;
}

Public class Seguro {
    private float valor;
    private boolean vigencia;
    
    private Cliente proprietario;
    private Cliente[] asseguradora;
    private Veiculo veiculo;
}

