import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DecimalFormat;




public class Exec1 {
   public static void main(String[] args) {
     List<Produto> listaDeProdutos = new ArrayList<>();
     listaDeProdutos.add(new Produto("ABCD", 5.30));
     listaDeProdutos.add(new Produto("XYPK", 6.00));
     listaDeProdutos.add(new Produto("KLMP", 3.20));
     listaDeProdutos.add(new Produto("QRST", 2.50));

     String code = "";
     int quantity = 0;
     boolean isValidate = false;
     
     
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");
     
    while(!isValidate){

      System.out.println("Informe o código do Produto: ");
      code = scanner.nextLine();

      for(Produto cogido : listaDeProdutos) {
        if(isValidate){
          break;
        }
        
        if (cogido.getCodigo().equals(code)) {
          isValidate = true;
        }        
      }
      
      if(!isValidate){
        System.out.println("Produto não encontrado!");
      }
    }





    isValidate = false;

    while(!isValidate){
      System.out.println("Informe a quantidade: ");
      quantity = scanner.nextInt();

      if(quantity > 0){
        isValidate = true;
      } else {
        System.out.println("Quantidade inválida!");
      }
    }


    for (Produto produto : listaDeProdutos) {
      System.out.println(produto.getCodigo());

      if (produto.getCodigo().equals(code)){
        System.out.println("Valor total: " + df.format( produto.getValor() * quantity));
        return;
      }
    }

    System.out.println("Código não encontrado");
     return;
     
   } 
}




class Produto {
    // Atributos
    private String codigo;
    private double valor;

    // Construtor
    public Produto(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    // Métodos getter e setter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}


