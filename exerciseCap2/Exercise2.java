package exerciseCap2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {

	public static String
    isValidPassword(String password) {
		
        String regex = "^(?=.*[0-9])"
                       + "(?=.[a-z])(?=.[A-Z])"
                       + "(?=.[!@#$%^&()-+])"
                       + "(?=\\S+$).{6,100}$";
        
        String message = null;
  
        Pattern p = Pattern.compile(regex);  

        Matcher m = p.matcher(password);

        m.matches();     

        if (password == null) {
        	message = "preencha o campo da senha.";
        }else if(password.length()<=6) {
        	message = "precisa ter no mínimo 6(seis) caracteres."; 
        }else if(!m.matches()) {
        	message = "senha inválida.";
        }else {
        	message = "senha inserida com sucesso!!!";
        }

		return message;
    }
  
    public static void main(String args[])
    {
  
    	Scanner entry = new Scanner(System.in);
    	
    	System.out.print("Digite o seu nome: ");
		String name = entry.next();
		System.out.print("Digite a senha: ");
		String password = entry.next();
			
		System.out.println("Sr(a). " + name +", "+ isValidPassword(password));

     
    }

}