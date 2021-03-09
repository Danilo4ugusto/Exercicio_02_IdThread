package controller;

public class IdThread extends Thread
{
	//Declaração de variaveis
	private long id;
	
	//Método construtor
	public IdThread()
	{
		this.id = id;
	}
	
	//Método RUN chamando o método getThreadId
	@Override
	public void run()
	{
		getIdThread();
	}

	//Método que coleta o ID e demonstra no Console
	private void getIdThread()
	{
		id = getId();
		System.out.println("TID #" + id);
	}
}