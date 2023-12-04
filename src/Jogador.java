public class Jogador {
    private String nome;
    private String time;
    private int camnum;
    private int stamina = 50;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getTime(){
        
        return time;

    }
    public void setTime(String time){
        this.time = time; 
    }
    public int getCamnum(){
        return camnum;
    }
    public void setCamnum(int camnum){
        this.camnum = camnum;
    }
    public int getStamina(){
        return stamina;
    }
    public void setStamina(int stamina){
        this.stamina = stamina;
    }
}
