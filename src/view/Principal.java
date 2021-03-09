package view;

import controller.IdThread;

public class Principal{

	public static void main(String[] args)
	{

		for (int i = 0; i < 5; i++)
		{
			Thread idThread = new IdThread();
			idThread.start();
		}

	}

}