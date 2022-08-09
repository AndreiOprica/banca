import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    public String nume;
    public List<String> contRon = new ArrayList<>();
    public List<Integer> soldRon = new ArrayList<>();
    public List<String> contEur = new ArrayList<>();
    public List<Integer> soldEur = new ArrayList<>();

    public Client(String nume){
        this.nume = nume;
    }

    public void creareContRon(String cont, int sold){
        this.contRon.add(cont);
        this.soldRon.add(sold);
    }

    public void creareContEur(String cont, int sold){
        this.contEur.add(cont);
        this.soldEur.add(sold);
    }

    public void lichidareContRon(String cont){
        int i = 0;
        for(String el : contRon){
            if(Objects.equals(el, cont)){
                contRon.remove(i);
                soldRon.remove(i);
                break;
            }
            i++;
        }
    }

    public void lichidareContEur(String cont){
        int i = 0;
        for(String el : contEur){
            if(Objects.equals(el, cont)){
                contEur.remove(i);
                soldEur.remove(i);
                break;
            }
            i++;
        }
    }
}
