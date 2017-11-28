import java.sql.*;

/**
 * Reads the user information from the database to validate users and retrieve information
 *
 * @author Gavin Kerr
 * @author Allie McFarland
 * @version 11/23/2017
 */
public class DatabaseReader {
	
	//This block of code was taken from an example for the sql package at http://www.sqlitetutorial.net/sqlite-java/select/
	/**
	 * Creates a connection to the database
	 *
	 * @return the connection to the database
	 */
	public Connection connect() {
		
        Connection conn = null;
        try {
	    //System.out.println("Starting");
            Class.forName("org.sqlite.JDBC");
	    //System.out.println("Loaded Driver");
            // db parameters
            String url = "jdbc:sqlite:data/accounts.db";
	    //System.out.println("This is the url: " + url);
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            //System.out.println("Connection to SQLite has been established.");
            
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
	
	/**
	 * Retrieves the information for the account
	 *
	 * @param pin the PIN number associated with the account
	 * @param card the debit card information associated with the account
	 * @return the account
	 */
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
	
	/**
	 * Updates the account information in the database
	 *
	 * @param acc the account information
	 */
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
