package busineslogic;

import java.io.Console;

public class Executable 
{
    public static void main(String[] args) {
        
        String cmd;
		ShowroomLogic.fillShowroom();
		do
		{
            //ricordatevi la libreria
			System.out.println("Inserisci comando");
			cmd = Console.readString().toLowerCase();//metto l'input in minuscolo

			switch (cmd)
			{
				
				case "add"            	-> ShowroomLogic.add();
				case "print"            	-> ShowroomLogic.print();
				case "remove"            	-> ShowroomLogic.remove();
				case "printexposition"            	-> ShowroomLogic.printExposition();
				
				case "quit"            	-> System.out.println("BYE BYE");
				default                	-> System.out.println("Comando non valido");
			}

		}while (!cmd.equals("quit"));
	}

       
	
}
