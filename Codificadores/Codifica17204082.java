package Codificadores;

public class Codifica17204082 implements Codifica {


    public String getNomeAutor(){
        return 'Neimar da Silva Machado';
    }

    // Retorna a matrícula do autor do codificador
    public String getMatriculaAutor(){
        return '17204082-6';
    }

    // Recebe um string e retorna o correspondente codificado
    public String codifica(String str){

        String code = Base64.getEncoder().encodeToString(str.getBytes());

    return code;

    }

    // Recebe um string codificado e retorna o correspondente decodificado
    public String decodifica(String str){

        String deco = new String(Base64.getDecoder().decode(str));

    return deco;

    }



}