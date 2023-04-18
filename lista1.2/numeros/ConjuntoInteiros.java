import java.util.ArrayList;

public class ConjuntoInteiro{
    private ArrayList<Integer> num = new ArrayList<>();
    private ArrayList<Boolean> verifica= new ArrayList<>();
    private ArrayList<Integer> inter = new ArrayList<>();
    public void newNum(int n){
        num.add(n);
        verifica.add(false);
    }
    public void removeNum(int n){
        num.remove(n);
        verifica.remove(n);
    }
    public int getElementos(int i){
        return num.get(i);
    }
    public int size(){
        return num.size();
    }
    public void uniao(int n){
        num.add(n);
        verifica.add(false);
    }
    public void intersecao(int n){
        for(int i=0;i<num.size();i++){
            if(num.get(i) == n){
                inter.add(n);
                i++;
            }
        }
    }
    public String intersecao(){
        String texto = new String();
        for(Integer item: inter){
            texto += " " + item;
        }
        return texto;
    }
    public void diferenca(int n){
        for(int i=0;i<num.size();i++){
            if(num.get(i) == n){
                num.remove(i);
            }
        }
    }
    
    public String toString(){
        String texto = new String();
        for(Integer item: num){
            texto += " " + item;
        }
        return texto;
    }

}
