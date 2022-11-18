import javax.swing.JOptionPane;
public class Contato {
    private String nome;
    private String tel; 

    public Contato(){

    }

    public Contato(String nome, String tel) {
        this.nome = nome;
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    

    public void insCont(){
        this.setNome(JOptionPane.showInputDialog("digite seu nome: "));
        this.setTel(JOptionPane.showInputDialog("digite seu telefone: "));

    }

    public void proxCont(){
        
    }

    public void sair (){
        JOptionPane.showMessageDialog(null,"fim de programa");
        
    }


    
    
}