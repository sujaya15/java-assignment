import java.sql.*;
import java.io.*;
public static void main(String[]args)
{
 try
{

class.forName("net.ucanaccess.jdbcUcanccessDriver");
connection c=DriverManager.getConnection("jdbc:ucanaccess:E/Ellipse//Example//A.ucanaccess)
statement s=s.createStatement();
System.out.println("connection established");
s.execute("create table MARK(USN varchar,MARK1 number ,MARK2 number)");
System.out.println("Table Created");
s.executeUpdate("insert into mark values '4AL18CS089',100,89);
s.executeUpdate("insert into mark values '4AL18CS079',100,100);
System.out.println("value inserted");
ResultSet r=r.executeQuery("Select from marks");
System.out.println("The records in the table are")
while(r.next())
{
String usn=r.getString("USN");
int mark1=r.getInt("MARK1");
int mark2=r.getInt("MARK2");
System.out.println("usn+","mark1+","+mark2");
}
catch(Exception e)
{
  System.out.println("e");
}
}
}
