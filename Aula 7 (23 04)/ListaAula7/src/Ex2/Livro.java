/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author Portu
 */
public class Livro {
    private int ISBM;
    private String Titulo;
    private int NumCap;
    private Capitulo[] vetorCapitulos;
    
    public Livro(int ISBM, String Titulo){
        this.ISBM = ISBM;
        this.Titulo = Titulo;
        this.vetorCapitulos = new Capitulo[Constantes.tamanhoMaximo];
        this.NumCap = 0;
    }
    
    public void addCap(String TituloCap, int NumPaginas){
        if(NumCap < Constantes.tamanhoMaximo){
            vetorCapitulos[NumCap++] = new Capitulo(TituloCap, NumPaginas);
        }else{
            System.out.println("Numero max de capitulos atingido");
        }
    }
    
    public int calculaPaginas(){
        int tamanho = 0;
        for(int i=0; i<vetorCapitulos.length; i++){
            if(vetorCapitulos[i] != null){
                tamanho += vetorCapitulos[i].getNumPaginas();
            }else{
                break;
            }
        }
        return tamanho;
    }
    
    public void relatorio(){
        System.out.println("Livro: "+Titulo);
        System.out.println("Editora: "+Constantes.Editora);
        System.out.println("Codigo ISBM: "+ISBM);
        System.out.println("Numero de Paginas: "+calculaPaginas());
        System.out.println("Numero de capitulos: "+NumCap);
        System.out.println("Capitulos: ");
        for(int i=0; i<NumCap; i++){
            System.out.println("Capitulo "+vetorCapitulos[i].getNumero()+": ");
            System.out.println("Titulo do Capitulo: "+vetorCapitulos[i].getTitulo());
            System.out.println("Tamanho: "+ vetorCapitulos[i].getNumPaginas()+" paginas\n");
        }
    }
}
