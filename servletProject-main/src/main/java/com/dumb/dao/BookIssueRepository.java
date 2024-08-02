package com.dumb.dao;

public class BookIssueRepository {
//	public static boolean writeToDataBase(BookIssue user){
//		String query = "insert into book_issue(firstName,lastName,gender,program,section,bookTaken) values(?,?,?,?,?,?)";
//		boolean bool = false;
//		try {
//			PreparedStatement statement= dbConnect().prepareStatement(query);	
//			
//			statement.setString(1,user.getFirstName());
//			statement.setString(2,user.getSecondName());
//			statement.setString(3,user.getGender());
//			statement.setString(4,user.getProgram());
//			statement.setString(5,user.getSection());
//			statement.setString(6,user.getBookTaken());
//			
//			int num=statement.executeUpdate();
//			if(num>0) {
//				return true;
//			}else {
//				return false;
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return bool;
//		
//		
//	}
//	
//	public static ArrayList<BookIssue> readData(){
//		ArrayList<BookIssue> al=null;
//		String query = "select * from book_issue";
//		BookIssue bi=null;
//		
//		try {
//			al = new ArrayList<BookIssue>();
//			Connection con = dbConnect();
//			
//			//prepare java statement
//			PreparedStatement statement = con.prepareStatement(query);
//			
//			ResultSet rs = statement.executeQuery();
//			
//			while(rs.next()) {
//				//bi = new BookIssue();
////				
////				bi.setFirstName(rs.getString("firstName"));
////				bi.setSecondName(rs.getString("lastName"));
////				bi.setGender(rs.getString("gender"));
////				bi.setProgram(rs.getString("program"));
////				bi.setSection(rs.getString("section"));
////				bi.setBookTaken(rs.getString("bookTaken"));				
////				al.add(bi);
//				
//			}
//			con.close();			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//		return al;
//	}

}
