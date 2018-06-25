package projetoreservatorio;
        
public class ProjetoReservatorio {
    public static void main(String[] args) {
        
    double AguaPluvial = 0;
    double Drenagem = 1260; // drenagem semanal de água
    
    double explambda = Math.exp(-2);
    int QuantidadeDiasDeChuva = 0;
    
    RandPoisson p = new RandPoisson();
    RandNormal n = new RandNormal();
    Reservatorio r = new Reservatorio();
    
        for(int periodo = 1; periodo <= 50; periodo++){
            QuantidadeDiasDeChuva = p.randpoi(explambda);
            
            for(int DiasEncher = 0; DiasEncher <= QuantidadeDiasDeChuva; DiasEncher++){
                AguaPluvial = n.GerarAleatorioNormal();
                
                r.EncherReservatorio(AguaPluvial);
                
                }
            r.DrenarReservatorio(Drenagem);
            
            if(r.VolumeAtual == 0){
               r.TempoVazio ++;
            }
        }
    
        
        
    System.out.println("Volume total de água captada pelo reservatório no período: " + r.getCaptacaoTotal() + " m^3\n");
    System.out.println("Volume total de água transbordada pelo reservatório no período: " + r.getTransbordo() + " m^3\n");
    System.out.println("Volume total de água que deixou de ser drenada no período por falta de água: " + r.getVolumeNaoDrenado() + " m^3\n");
    System.out.println("Volume Atual: " + r.getVolumeAtual() + " m^3\n");
    System.out.println("Tempo que o reservatorio passou vazio: " + r.getTempoVazio() + " semanas\n");
    }
        
}    
