import java.sql.*;

public class DatabaseReader {
	
	//This block of code was taken from an example for the sql package at http://www.sqlitetutorial.net/sqlite-java/select/
	public Connection connect() {
		
        Connection conn = null;
        try {
	    System.out.println("Starting");
            Class.forName("org.sqlite.JDBC");
	    System.out.println("Loaded Driver");
            // db parameters
            String url = "jdbc:sqlite:/mnt/c/Users/Gavin/Documents/cpsc4175/implementation/implementation_2/ATM/src/accounts.db";
	    System.out.println("This is the url: " + url);
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
	    System.out.println(e.getMessage());
	}
	 catch (Exception e) {
	    System.out.println(e.getMessage());
	}
        return conn;
    }
	
	public Account getAccount(String pin, DebitCard card) {
		String query = "SELECT * FROM accounts WHERE Pin=\""+pin+"\" AND CARD=\""+ card.getValue() +"\"";
		Account acc = null;
		
		try(Connection conn = this.connect();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query)){
			
			acc = new Account(rs.getString("AccountNumber"), rs.getString("AccountName"), rs.getDouble("Balance"), card);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return acc;
	}
	
	public void updateAccount(Account acc) {
		 String sql = "UPDATE accounts SET Balance = ? WHERE AccountNumber = ?";
		 
		 try(Connection conn = this.connect();
		     PreparedStatement pre = conn.prepareStatement(sql)){
			 pre.setDouble(1, acc.getBalance());
			 pre.setString(2, acc.getAccountNumber());
			 pre.executeUpdate();
		 } catch (SQLException e) {
			 System.out.println(e.getMessage());
		 }
	}
}
