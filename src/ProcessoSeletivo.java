public class ProcessoSeletivo {
    public static void  main(String[] args) {
    analisandoCandidato(1950.0);
    analisandoCandidato(2200.0);
    analisandoCandidato(2000.0);


    }
    static void  analisandoCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");

        } else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA!");
        else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS!");

        }

    }
}

