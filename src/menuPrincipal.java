import java.util.Scanner;

public class menuPrincipal {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    byte opcao = scanner.nextByte();

    do {
        System.out.println("Exibir mapa de assentos - 1");
        System.out.println("Comprar ingressos - 2");
        System.out.println("Cancelar compra de ingressos - 3");
        System.out.println("Exibir relatório de ocupação - 4");
        System.out.println("Sair - 5");
        
        switch(opcao) {
            case 1:
                
                break;
            
            case 2:
                
                break;
            
            case 3:
                
                break;
            
            case 4:
                
                break;
            
            case 5:
                
                break;
            
            default:
                
                System.out.println("Opção inválida!");
        }
    } while (opcao != 0);
        
            scanner.close();
    }
}