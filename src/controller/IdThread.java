package controller;

public class IdThread extends Thread
{
	//Declara��o de variaveis
	private long id;
	
	//M�todo construtor
	public IdThread()
	{
		this.id = id;
	}
	
	//M�todo RUN chamando o m�todo getThreadId
	@Override
	public void run()
	{
		getIdThread();
	}

	//M�todo que coleta o ID e demonstra no Console
	private void getIdThread()
	{
		id = getId();
		System.out.println("TID #" + id);
	}
}