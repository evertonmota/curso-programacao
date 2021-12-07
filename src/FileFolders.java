import java.io.File;
import java.util.Scanner;

public class FileFolders {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho do Diretório");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory); // Listar somente que for Diretorio
				
		System.out.println("Diretórios: ");
		
		for ( File folder : folders) {
			System.out.println(folder);
		}
		
		File [] files = path.listFiles(File::isFile);
		System.out.println("Arquivos : ");
		for(File f : files) {
			System.out.println(f);
		}

		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("Diretorio criado com sucesso : " + sucess) ;
		
		System.out.println("getName : " +path.getName());
		System.out.println("getParent : " +path.getParent());
		System.out.println("getPath : " +path.getPath());		

		sc.close();
	}
}
