import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
Exemplos:
Entrada: Saída:
16 2 O JOGO DUROU 10 HORA(S)
Entrada: Saída:
0 0 O JOGO DUROU 24 HORA(S)
Entrada: Saída:
2 16 O JOGO DUROU 14 HORA(S)*/
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a hora que começou e finalizou o jogo!");
    int horaInicial = sc.nextInt();
    int horaFinal = sc.nextInt();
    int duracao;
    if(horaInicial < horaFinal){
        duracao = horaFinal - horaInicial;
    }else {
        duracao = 24 - horaInicial + horaFinal;
    }
    System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
