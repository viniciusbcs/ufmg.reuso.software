package br.ufmg.reuso.negocio.temp;

import java.util.Timer;

import java.util.TimerTask;

public class Temp {
	
	private int numeroRetorno = 1;
	private int mode;
	int secondsPassed = 0;
	
	Timer myTimer = new Timer();
	
	TimerTask task = new TimerTask() {
		public void run() {
			secondsPassed++;
		}
	};
	
	public int start() {
		if(getMode() == 0) {
			myTimer.scheduleAtFixedRate(task, 1000, 120);
		}else if (getMode() == 1) {
			myTimer.scheduleAtFixedRate(task, 1000, 80);
		}else if(getMode() == 2) {
			myTimer.scheduleAtFixedRate(task, 1000, 60);
		}	
		return this.numeroRetorno;
	}
			
	// Escolher de acordo com o modo do jogo
	public void setMode(int numero) {
		this.mode = numero;
	}
	
	public int getMode() {
		return this.mode;
	}

}
