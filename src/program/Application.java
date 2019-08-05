package program;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import db.DbException;
import db.DbJava;
import entities.Notes;
import entities.Student; 

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Notes notes = new Notes();
		System.out.println(notes.toString());
		System.out.println();

		List<Notes> list = new ArrayList<>();

		System.out.println("How many students you want to add? ");
		int RA = sc.nextInt();

		for (int i = 1; i <= RA; i++) {
			System.out.println();
			sc.nextLine();
			System.out.println("RA " + i + ": ");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("e-mail: ");
			String email = sc.nextLine();
			System.out.println("Notas NP1: ");
			double NP1 = sc.nextDouble();
			System.out.println("Notas NP2: ");
			double NP2 = sc.nextDouble(); 
			System.out.print("Média: " + (NP1 + NP2) / 2);
			System.out.println();
			notes = new Notes(name, email, NP1, NP2);
		}
		for (int i = 0; i <= RA; i++) {
			if (list != null)
			System.out.print(i + ": " + list);
			
			Connection conn = null;
			PreparedStatement st = null;
			try {
				conn = DbJava.getConnection();
					
				st = conn.prepareStatement(
						"INSERT INTO ti2p22" + "(NAME, EMAIL, NP1, NP2, MEDIA)" + "VALUES" + "(?, ?, ?, ?, ?)");
				st.setString(1, notes.getName());
				st.setString(2, notes.getEmail());
				st.setDouble(3, notes.getNP1());
				st.setDouble(4, notes.getNP2());
				st.setDouble(5, (notes.getNP1() + notes.getNP2()) / 2);
				
				int rowsAffected = st.executeUpdate();
				
				System.out.println("Done! Rows Afeected " + rowsAffected);	
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
			finally {
				DbJava.closeConnection();
			}
			
			
			{
		}
			}
		sc.close();
		
	}

}

