package beans;

import java.util.ArrayList;
import java.util.Collection;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.Pessoa;
import modelo.PessoaFisica;

@ManagedBean
@SessionScoped
public class CadastroPessoaBean {
	private Pessoa pessoaSelecionada;
	private Collection<Pessoa> lista;
	
	public CadastroPessoaBean(){
		pessoaSelecionada = new PessoaFisica();
		lista = new ArrayList<Pessoa>();
		
		for(int x =0; x <10; x++){
			Pessoa p = new PessoaFisica();
			p.setNome(String.format("Fulano %02d", x));
			p.setEmail(String.format("fulano%02d@teste.com", x));
			p.setTelefone(String.format("993442890 %02d", x));
			
			lista.add(p);
		}
	}
	
	public void salvar(){
		if (!lista.contains(pessoaSelecionada)){
			lista.add(pessoaSelecionada);
		}
	}
	
	public void excluir(){
		lista.remove(pessoaSelecionada);
		pessoaSelecionada = new PessoaFisica();
		
	}
	
	public Pessoa getPessoaSelecionada() {
		return pessoaSelecionada;
	}
	public void setPessoaSelecionada(Pessoa pessoaSelecionada) {
		this.pessoaSelecionada = pessoaSelecionada;
	}
	public Collection<Pessoa> getLista() {
		return lista;
	}
	public void setLista(Collection<Pessoa> lista) {
		this.lista = lista;
	}
	
}
