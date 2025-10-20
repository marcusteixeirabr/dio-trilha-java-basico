package iphone;

import iphone.apps.AparelhoTelefonico;
import iphone.apps.NavegadorInternet;
import iphone.apps.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página no navegador de internet no iphone ...");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba no navegador de internet no iPhone ...");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página no nevegador do iPhone ...");
		
	}

	@Override
	public void ligar() {
		System.out.println("Fazendo uma ligação no iPhone ...");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo uma chamada no iPhone ...");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz no iPhone ...");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando uma música no iPhone ...");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando uma música no iPhone ...");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando um música no iPhone ...");
		
	}

}
