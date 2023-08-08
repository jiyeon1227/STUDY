package p2023_08_08;

import java.sql.*;

//DB연결 잘 되었는지 확인

public class JDBC_Connect01{

  public static void main(String[] args)  {

/** ORACLE JDBC Driver Test ***************************/
	String driver = "oracle.jdbc.driver.OracleDriver";  
/******************************************************/

/** My-SQL JDBC Driver Test **************************/	
//	String driver ="com.mysql.jdbc.Driver";
/*****************************************************/

    try{
      Class.forName(driver);
      System.out.println("JDBC Driver Loading 성공~!!");

    }catch(Exception e){
      System.out.println("JDBC Driver Loading 실패~!!");
	  e.printStackTrace();
    }
 }
}  
