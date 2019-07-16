package com.visa.training.jdbc;


import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		/*
		 * Connection c = JdbcUtil.getConnection();
		 * 
		 * try { DatabaseMetaData metaData = c.getMetaData();
		 * System.out.println("Product is "+ metaData.getDatabaseProductName());
		 * System.out.println("Version is "+metaData.getDatabaseProductVersion()); }
		 * catch (SQLException e) { e.printStackTrace(); }
		 */
		ProductDAO dao = new ProductDAO();
        Product toBeSaved = new Product("hair oil", 99, 1000);
        int generatedId = dao.save(toBeSaved);
        System.out.println("Created product with id: "+generatedId);

	}


}
