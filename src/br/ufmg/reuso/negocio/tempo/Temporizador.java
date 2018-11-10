package br.ufmg.reuso.negocio.tempo;

import java.util.Timer;

import java.util.TimerTask;

import br.ufmg.reuso.negocio.jogo.Jogo;

public class Temporizador {
	
	private static Temporizador temporizador;
	private int numeroRetorno = 1;
	private int mode;
	public int secondsPassed = 0;
	
	Timer myTimer = new Timer();
	
	TimerTask task;
	
	private Temporizador() {
		
	}
	
	public static Temporizador getTemporizador(int mode) {
		if (temporizador == null) {
			temporizador = new Temporizador();
		}
		temporizador.setMode(mode);
		return temporizador;
	}
	
	public void start() {
		if(getMode() == 0) {
			myTimer.scheduleAtFixedRate(task, 1000, 120);
		}else if (getMode() == 1) {
			myTimer.scheduleAtFixedRate(task, 1000, 80);
		}else if(getMode() == 2) {
			myTimer.scheduleAtFixedRate(task, 1000, 60);
		}	
		task = new TimerTask() {
			public void run() {
				secondsPassed++;
			}
		};
	}
			
	// Escolher de acordo com o modo do jogo
	public void setMode(int numero) {
		this.mode = numero;
	}
	
	public int getMode() {
		return this.mode;
	}

}