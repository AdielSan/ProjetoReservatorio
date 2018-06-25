package projetoreservatorio;

 public class Reservatorio{
      public double CapacidadeTotal = 10000;
      public double VolumeAtual = 5000;
      public double Transbordo = 0;
      public double Captacao = 0;
      public double VolumeNaoDrenado = 0;
      public int TempoVazio = 0;
      
    public Reservatorio(){      
    }
    
    public void UsarReservatorio(){          
    }
    
    double getCapacidadeTotal(){
        return this.CapacidadeTotal;
    }
    
    double getVolumeAtual(){
        return this.VolumeAtual;
    }
    
    double getTransbordo(){
        return this.Transbordo;
    }
    
    double getCaptacaoTotal(){
        return this.Captacao;
    }
    
    double getVolumeNaoDrenado(){
        return this.VolumeNaoDrenado;
    }
    
    int getTempoVazio(){
        return this.TempoVazio;
    }
    
    void EncherReservatorio(double AguaPluvial){
       if ((this.VolumeAtual + AguaPluvial) < this.CapacidadeTotal){
           this.VolumeAtual += AguaPluvial;
           this.Captacao += AguaPluvial;
       }
       
       else if (this.VolumeAtual == this.CapacidadeTotal){
           this.Transbordo += AguaPluvial; 
       }
       
       else if((this.VolumeAtual + AguaPluvial > this.CapacidadeTotal)){ 
         this.Captacao += this.VolumeAtual - this.CapacidadeTotal;  
         this.Transbordo += AguaPluvial - (this.VolumeAtual - this.CapacidadeTotal);
         this.VolumeAtual = this.CapacidadeTotal;
       } 
    }
    
    void DrenarReservatorio(double Drenagem){
        if(Drenagem < this.VolumeAtual){
            this.VolumeAtual -= Drenagem;
        }
        
        else if(this.VolumeAtual == 0){
            this.VolumeNaoDrenado += Drenagem;
        }
        
        else if (Drenagem > this.VolumeAtual){
            this.VolumeNaoDrenado += Drenagem - this.VolumeAtual;
            this.VolumeAtual = 0;
        }
    }
    
    
    public void main(){
        this.UsarReservatorio();
    }
}