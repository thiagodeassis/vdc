package br.com.thiagotfx.validador;

import java.io.PrintStream;
import java.util.List;

import br.com.thiagotfx.model.Saida;

public class GeraSaida {

	public void geraSaida(String path, List<Saida> saidas) {

		try {
			PrintStream ps = new PrintStream(path);

			ps.println("NUMERO,REGRA,CORRETO");

			for (Saida saida : saidas) {

				StringBuilder sb = new StringBuilder();
				sb.append(saida.getNumeroEntrada()).append(",").append(saida.getNumeroRegra()).append(",").append(saida.getCorreto());

				ps.println(sb);
				
			}
			ps.flush();
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
