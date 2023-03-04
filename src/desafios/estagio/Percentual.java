package desafios.estagio;

import java.text.DecimalFormat;

public class Percentual {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        
        double total = sp + rj + mg + es + outros;
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        System.out.println("Percentual de representação por estado:");
        System.out.println("SP: " + df.format((sp/total)*100) + "%");
        System.out.println("RJ: " + df.format((rj/total)*100) + "%");
        System.out.println("MG: " + df.format((mg/total)*100) + "%");
        System.out.println("ES: " + df.format((es/total)*100) + "%");
        System.out.println("Outros: " + df.format((outros/total)*100) + "%");
    }
}