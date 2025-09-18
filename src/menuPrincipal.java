import java.util.Scanner;

public class menuPrincipal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[][] salaDeCinema = new char[10][20];

        
        for (int i = 0; i < salaDeCinema.length; i++) {
            for (int j = 0; j < salaDeCinema[i].length; j++) {
                salaDeCinema[i][j] = 'L';
            }
        }

        byte opcao;
        do {
            System.out.println("---- Cinema CineDev ----");
            System.out.println("Exibir mapa de assentos - 1");
            System.out.println("Comprar ingressos - 2");
            System.out.println("Cancelar compra de ingressos - 3");
            System.out.println("Exibir relatório de ocupação - 4");
            System.out.println("Sair - 5");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextByte();

            switch (opcao) {
            case 1:
                   System.out.print("           "); 
            for (int j = 0; j < salaDeCinema[0].length; j++) {
                   System.out.printf("%3d", j + 1); 
            }
            System.out.println();

            for (int i = 0; i < salaDeCinema.length; i++) {
                   System.out.printf("Fileira %2d: ", i + 1); 
            for (int j = 0; j < salaDeCinema[i].length; j++) {
                   System.out.print("[" + salaDeCinema[i][j] + "]");
            }
                   System.out.println();
            }
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