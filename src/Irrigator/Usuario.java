package Irrigator;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
		private String nome;
		private String sobrenome;
		private String email;
		private String senha;
		private List<Ambiente> ambientes = new ArrayList<>();
		
		public Usuario(String nome, String sobrenome, String email, String senha) {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.email = email;
			this.senha = senha;
		}
		
		
		public String getNome() {
			return nome;
		}
		
		public String getSobrenome() {
			return sobrenome;
		}
		
		public String getEmail() {
			return email;
		}
		
		public String getSenha() {
			return senha;
		}
		
		public void adicionarAmbiente(Ambiente novo) {	
			this.ambientes.add(novo);
		}
		
}
