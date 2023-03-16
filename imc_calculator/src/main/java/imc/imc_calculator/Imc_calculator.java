package imc.imc_calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Imc_calculator {
    
    static ArrayList<CASOS_DE_TESTE> lista = new ArrayList<>();
    
    public static void main(String[] args) {
        while (true) {            
            System.out.println("1=LER NOVO TESTE 2=LISTAR OBJETO 3=EXCLUIR OBJETO 4=ALTERAR OBJETOS");
            System.out.print("Opção: ");
            String opcao = new Scanner(System.in).next();
            switch (opcao) {
                case "1":
                    novo();
                    break;
                case "2":
                    listar();
                    break;
                case "3":
                    excluir();
                    break;
                case "4":
                   alterar();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }    
    }
    private static CASOS_DE_TESTE novo() {
        // Instanciar a primeira avaliação
        Scanner ler = new Scanner(System.in);
        CASOS_DE_TESTE ct = new CASOS_DE_TESTE();
        System.out.print("Nome: ");
        ct.nome = new Scanner(System.in).nextLine();
        System.out.print("CPF: ");
        ct.cpf = new Scanner(System.in).nextLine();
        System.out.print("Peso: ");
        ct.peso = ler.nextFloat();
        System.out.print("Altura: ");
        ct.altura = ler.nextFloat();
        lista.add(ct);
        return ct;
    }
    private static void listar() {
        for(CASOS_DE_TESTE ct : lista)
        System.out.println(ct.nome + " sua altura é " + ct.altura + " seu peso é "
                + ct.peso + " seu IMC é " + ct.Calcular_IMC() + " e seu status é de " 
                + ct.consultarStatus()
        );
    }
    private static void excluir(){
        String CPFS;
        System.out.println("Digite o cpf de quem deseja excluir: ");
        CPFS = new Scanner(System.in).nextLine();
        for(CASOS_DE_TESTE ct : lista){
            if(ct.cpf.equals(CPFS)){
                lista.remove(ct);
                System.out.println("CPF excluido!");
                return;
            }
    }
        System.out.println("CPF não encontrado!");
        return;
    }
    private static void alterar(){
        String CPFS;
        System.out.println("Digite o cpf de quem deseja alterar: ");
        CPFS = new Scanner(System.in).nextLine();
        for(CASOS_DE_TESTE ct : lista){
            if(ct.cpf.equals(CPFS)){
                Scanner ler = new Scanner(System.in);
                System.out.print("Nome: ");
                ct.nome = new Scanner(System.in).nextLine();
                System.out.print("CPF: ");
                ct.cpf = new Scanner(System.in).nextLine();
                System.out.print("Peso: ");
                ct.peso = ler.nextFloat();
                System.out.print("Altura: ");
                ct.altura = ler.nextFloat();
                return;
            }
    }
        System.out.println("CPF não encontrado!");
        return;
    }
}
