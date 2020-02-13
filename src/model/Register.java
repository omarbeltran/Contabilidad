/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Omar Beltran
 */
public class Register {

    /**
     * @return the career
     */
    public String getCareer() {
        return career;
    }

    /**
     * @param career the career to set
     */
    public void setCareer(String career) {
        this.career = career;
    }

    /**
     * @return the timeIn
     */
    public String getTimeIn() {
        return timeIn;
    }

    /**
     * @param timeIn the timeIn to set
     */
    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    /**
     * @return the timeOut
     */
    public String getTimeOut() {
        return timeOut;
    }

    /**
     * @param timeOut the timeOut to set
     */
    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the personName
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * @param personName the personName to set
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    private static int id = 1;//this attribute can not be instanted two or more times, by this reason is declarated static 
    //this.id = id + 1;//each time when a object "Faculty" is create, the value of "id" is automatically incremented
    
    
    private String timeIn;
    private String timeOut;
    private String date;
    private String personName;
    private String department;
    private String career;
    
    public Register(String personName, String department, String career, String date, String timeIn, String timeOut){
        this.personName = personName;
        this.department = department;
        this.career = career;
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }
    
    public Register(String personName, String department, String career, String date, String timeIn){
        this.personName = personName;
        this.department = department;
        this.career = career;
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = "0";
    }
}
