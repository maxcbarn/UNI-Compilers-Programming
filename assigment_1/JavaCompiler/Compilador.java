import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

class Compilador{

	public static void main(String[]args)
	{	
		ArvoreSintatica arv=null;
	
		try{

			AnaliseLexica al = new AnaliseLexica(args[0]);
			Parser as = new Parser(al);
		
			arv = as.parseProg();
		
			
			CodeGen backend = new CodeGen();
			String codigo = backend.geraCodigo(arv);
			System.out.println(codigo);
			System.out.println(backend.Interpreter(arv));


			try {
            	Files.writeString(Path.of("code.txt"), codigo);
			} catch (IOException e) {
				e.printStackTrace();
			}

		}catch(Exception e)
		{			
			System.out.println("Erro de compilação:\n" + e);
		}



	}
}
