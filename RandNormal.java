package projetoreservatorio;

import java.util.Random;

public class RandNormal {
    public double Media = 600;
    public double DesvioPadrao = 100;
    public double VariavelAleatoria = 0;
    
    public RandNormal(){
    }
    
    double GerarAleatorioNormal(){
        Random r = new Random();
        this.VariavelAleatoria = (r.nextGaussian() * this.DesvioPadrao) + this.Media;
        return this.VariavelAleatoria;
    }
    
    double getMedia(){
        return this.Media;
    }
    
    double getDesvioPadrao(){
        return this.DesvioPadrao;
    }
    
    public void main(){
        this.GerarAleatorioNormal();
    }
}
