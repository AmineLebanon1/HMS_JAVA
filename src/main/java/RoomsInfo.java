/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class RoomsInfo {
    private int id;
    private boolean status;
    private Patient patient;

    public RoomsInfo(int id, boolean status, Patient patient) {
        this.id = id;
        this.status = status;
        this.patient = patient;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getId() {
        return id;
    }

    public boolean getStatus() {
        return status;
    }

    public Patient getPatient() {
        return patient;
    }
    
    
}
