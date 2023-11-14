import java.util.Scanner;

public class exe10uni6 {

    public exe10uni6() {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[50];
        int opcao = menu(sc);
        int tamanho = 0;
        while (opcao != 8) {
            switch (opcao) {
                case 1:
                    tamanho = menu1(numeros, sc, tamanho);
                    break;
                case 2:
                    menu2(numeros, sc);
                    break;
                case 3:
                    menu3(numeros, sc);
                    break;
                case 4:
                    menu4(numeros, sc);
                    break;
                case 5:
                    menu5(numeros);
                    break;
                case 6:
                    menu6(numeros);
                    break;
                case 7:
                    menu7(numeros, tamanho);
                    break;
            }
            opcao = menu(sc);
        }
        System.out.println("Fim");
    }

    public int menu(Scanner sc) {

        System.out.println(
                "Selecione uma das opções do menu: \n1 - Incluir valor \n2 - Pesquisar valor \n3 - Alterar valor \n4 - Excluir valor \n5 - Mostrar valores \n6 - Ordenar valores \n7 - Inverter valores \n8 - Sair do sistema");
        int opcao = sc.nextInt();

        return opcao;
    }

    public int menu1(int[] numeros, Scanner sc, int tamanho) {
        System.out.println("Digite um valor para incluir no fim do vetor: ");
        int valor1 = sc.nextInt();
        boolean temEspaco = false;
        int vetorTeste[] = new int[50];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                if (numeros[49] == 0) {
                    numeros[49] = valor1;
                    tamanho++;
                    i = 50;

                } else {
                    for (int j = 0; j < numeros.length - 1; j++) {
                        vetorTeste[j] = numeros[j + 1];
                    }
                    for (int k = 0; k < vetorTeste.length; k++) {
                        numeros[k] = vetorTeste[k];
                    }
                    numeros[49] = valor1;
                    i = 50;
                    tamanho++;
                }
                temEspaco = true;
            }

        }
        if (temEspaco) {
            System.out.println("O valor foi incluido no vetor");
        } else {
            System.out.println("O valor não foi incluido no vetor");
        }
        return tamanho;
    }

    public void menu2(int[] numeros, Scanner sc) {
        System.out.println("Pesquise um valor para ver se ele está no vetor: ");
        int valor2 = sc.nextInt();
        boolean taOUnao = false;
        int posicao = 0;

        for (int i = 0; i < 50; i++) {
            if (numeros[i] == valor2) {
                taOUnao = true;
                posicao = i + 1;
            }
        }
        if (taOUnao) {
            System.out.println("O valor está no vetor na posição: " + posicao);
        } else {
            System.out.println("O valor não está no vetor");
        }
    }

    public void menu3(int[] numeros, Scanner sc) {
        boolean temOUnao3 = false;
        System.out.println("Digite um valor para ser alterado e o valor que deseja colocar no lugar: ");
        int valor3sai = sc.nextInt();
        int valor3ent = sc.nextInt();

        for (int i = 0; i < 50; i++) {
            if (numeros[i] == valor3sai) {
                temOUnao3 = true;
                numeros[i] = valor3ent;
                i = 50;
            }
        }
        if (temOUnao3) {
            System.out.println("O valor foi alterado");
        } else {
            System.out.println("Número não encontrado");
        }
    }

    public void menu4(int[] numeros, Scanner sc) {
        System.out.println("Digite um valor para excluir do vetor: ");
        int valor4 = sc.nextInt();
        boolean temOUnao = false;

        for (int i = 0; i < 50; i++) {
            if (numeros[i] == valor4) {
                for (int j = i; j < 50; j++) {
                    if (j == 49) {
                        numeros[j] = 0;
                        temOUnao = true;
                    } else {
                        numeros[j] = numeros[j + 1];
                        temOUnao = true;
                    }
                }
            }
        }

        if (temOUnao) {
            System.out.println("O valor foi excluido do vetor");
        } else {
            System.out.println("O valor não foi excluido do vetor, porque ele não está nele");
        }
    }

    public void menu5(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }

    public void menu6(int[] numeros) {
        int bolha = 0;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {

                bolha = numeros[i];
                numeros[i] = numeros[i + 1];
                numeros[i + 1] = bolha;
                i = -1;

            }
        }
    }

    public void menu7(int[] numeros, int tamanho) {

        int temp = 0;
        int x = numeros.length - 1;
        if (tamanho > 25) {
            tamanho = 25;
        }
        for (int i = 0; i < tamanho; i++) {
            temp = numeros[i];
            numeros[i] = numeros[x];
            numeros[x] = temp;
            x += -1;
        }
    

    }

    public static void main(String[] args) {
        exe10uni6 j = new exe10uni6();
    }

}
