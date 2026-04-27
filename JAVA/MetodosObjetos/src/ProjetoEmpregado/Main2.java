package ProjetoEmpregado;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Empregado> lista = new ArrayList<>();
        lista.add(new EmpregadoHorista(1, "A",10,10));
        lista.add(new EmpregadoComissionado(2,"a",100,10));

        //for tradicional
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).nome);

        }

        //for generico
        for (Empregado e : lista){
            System.out.println(e.toString());
        }
    }
}
