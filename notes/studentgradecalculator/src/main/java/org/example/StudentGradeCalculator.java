package org.example;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class StudentGradeCalculator
{
    public static void main( String[] args ) throws SQLException
    {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Poloking19!");

        Statement st = conn.createStatement();
        ResultSet result = st.executeQuery("select * from student");

        int averageGrades;
        while(result.next()){
            averageGrades = (result.getInt("mathematics") + result.getInt("science")
                + result.getInt("english"))/3 ;

        if(averageGrades <= 100 && averageGrades >= 90)
        {
            System.out.println(result.getString("first_name") + " " + result.getString("last_name") + " scored A");
        } else if(averageGrades <= 90 && averageGrades >= 80)
        {
            System.out.println(result.getString("first_name") + " " +result.getString("last_name") + " scored B");
        }
        else if(averageGrades <= 80 && averageGrades >= 70)
        {
            System.out.println(result.getString("first_name")+ " " +result.getString("last_name") + " scored C");

        } else if (averageGrades <= 70 && averageGrades >= 50) {

            System.out.println(result.getString("first_name")+ " " +result.getString("last_name") + " scored D");
        }else
            System.out.println(result.getString("first_name")+ " " +result.getString("last_name") + " have failed");

        }
    }
}




//        while(result.next()){
//        System.out.println(result.getString("first_name")+" "+result.getInt("mathematics"));
//        }