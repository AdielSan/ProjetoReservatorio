package projetoreservatorio;

public class RandPoisson {

    public RandPoisson(){        
    }
    
    public void GerarAleatorioPoisson(){
    }

    int randpoi(double expmlambda)
    {  
        double p=1; int k=0;
        do { k++; p*=Math.random(); } while (p>expmlambda);
        return (k-1);
    }
        
    public void main(){
        this.GerarAleatorioPoisson();
    }
}
