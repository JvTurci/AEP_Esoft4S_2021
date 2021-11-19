package Irrigator;


import java.util.HashSet;
import java.util.Set;

public class Agricultor {
		private String nomeAgricultor;
		private String cpf;
		private String email;
		private String senha;
		private Set<Ambiente> ambientes = new HashSet<>();
		
		public Agricultor(String cpf, String nome, String email, String senha) {
			this.nomeAgricultor = nome;
			this.cpf = cpf;
			this.email = email;
			this.senha = senha;
		}
		public String getNomeAgricultor() {
			return nomeAgricultor;
		}

		public void setNome(String nome) {
			this.nomeAgricultor = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		public void adicionarAmbiente(Ambiente novoAmbiente) {
			this.ambientes.add(novoAmbiente);
		}
		
		public void retirarAmbiente(Ambiente ambienteRetirado) {
			this.ambientes.remove(ambienteRetirado);
		}
		
		public Set<Ambiente> getAmbientes() {
			return new HashSet<>(ambientes);
		}
}
