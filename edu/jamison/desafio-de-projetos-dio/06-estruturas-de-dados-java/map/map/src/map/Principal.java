package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {

		Map<String, String> aluno = new HashMap<>();
		
		aluno.put("Nome", "Tiana");
		aluno.put("Idade", "8");
		aluno.put("Média", "9.3");
		aluno.put("Turma", "1301A");
		
		System.out.println(aluno);
		//System.out.println(aluno.keySet());
		//System.out.println(aluno.values());
		
		List<Map<String, String>> listaAlunos = new ArrayList<>();
		listaAlunos.add(aluno);
		
		Map<String, String> aluno2 = new HashMap<>();
		
		aluno2.put("Nome", "Brenda");
		aluno2.put("Idade", "25");
		aluno2.put("Média", "9.1");
		aluno2.put("Turma", "3A");

		listaAlunos.add(aluno2);
		
		System.out.println(listaAlunos);
	}

}
