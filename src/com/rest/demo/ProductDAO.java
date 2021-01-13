package com.rest.demo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO
{
   
    public List<Product> getAllProducts()
    {
        List<Product> lst=new ArrayList<Product>();
        try
        {
        Connection con= new DBConnect().createConn();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from ProductX");
        while(rs.next())
        {
            lst.add(new Product(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
        }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println(lst);
        return lst;
    }

	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
        try
        {
        Connection con=  new DBConnect().createConn();
        Statement st=con.createStatement();
        String query = "Insert into productX values("+product.getProdId()+","+product.getProdName()+","+product.getCategory()+","+product.getPrice()+")"; 
        int rs=st.executeUpdate(query);
        if(rs==1)
        {
           return true;
        }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
     
		return false;
	}

	public List<Product> getProductByID(String pid) {
		// TODO Auto-generated method stub
		List<Product> lst=new ArrayList<Product>();
        try
        {
        Connection con=  new DBConnect().createConn();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from ProductX where prodId = "+pid);
        while(rs.next())
        {
            lst.add(new Product(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
        }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println(lst);
        return lst;
	}
}
