package pessoa;

/**
 *
 * @author wande
 */
public class Livro implements Publicacao{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    
    //Metodo Construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setAberto(false);
        this.setPagAtual(0);
        this.setLeitor(leitor);
        
    }

    //Metodo comum
    public void detalhes() {
        System.out.print("Estou lendo o livro " + this.getTitulo() + " do autor \"" + this.getAutor() + "\" \nJa estou na pag " + this.getPagAtual()
                + " de " + this.getTotPaginas() + " paginas, estou adorando. " );
    }
    
    //Metodos Getter

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }
    
    //Metodos Setter

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
    @Override
    public void abrir() {
        this.setAberto(true);  
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(p < getTotPaginas()){
            this.setPagAtual( p);
        } else {
            this.setPagAtual(getTotPaginas());
        }
        
    }

    @Override
    public void avancarPag() {
        if(this.isAberto()){
            this.setPagAtual(getPagAtual()+1);
        } else {
            System.out.println("Não li esta pagina ainda.");
        }
    }

    @Override
    public void voltarPag() {
        if(this.isAberto()){
            this.setPagAtual(getPagAtual()+1);
        } else {
            System.out.println("Não existe pagina anterior");
        }
    }
        
    
}
