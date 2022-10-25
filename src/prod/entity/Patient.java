/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prod.entity;

/**
 *
 * @author lenovo
 */
public class Patient {

    private int Id_patient;
    private String Nom_patient;
    private String Prénom_patient;

    public Patient() {
    }
    private String Email_patient;
    private String Adress_patient;
    private int NumTel_patient;
    private String MotDePassel_patient;
    private int Age_patient;
    private String Gendre_patient;
    private int Nb_Rdv;
    private int Nb_Achat;
    private int Nb_Reclamation;
    private Boolean isblokedpatient;

    public Patient(
            int Id_patient,
            String Nom_patient,
            String Prénom_patient,
            String Email_patient,
            String Adress_patient,
            int NumTel_patient,
            String MotDePassel_patient,
            int Age_patient,
            String Gendre_patient,
            int Nb_Rdv,
            int Nb_Achat,
            int Nb_Reclamation,
            Boolean isblokedpatient
    ) {
        this.Id_patient = Id_patient;
        this.Nom_patient = Nom_patient;
        this.Prénom_patient = Prénom_patient;
        this.Email_patient = Email_patient;
        this.Adress_patient = Adress_patient;
        this.NumTel_patient = NumTel_patient;
        this.MotDePassel_patient = MotDePassel_patient;
        this.Age_patient = Age_patient;
        this.Gendre_patient = Gendre_patient;
        this.Nb_Rdv = Nb_Rdv;
        this.Nb_Achat = Nb_Achat;
        this.Nb_Reclamation = Nb_Reclamation;
        this.isblokedpatient = isblokedpatient;
      
    }

    public int getId_patient() {
        return Id_patient;
    }

    public void setId_patient(int Id_patient) {
        this.Id_patient = Id_patient;
    }

    public String getNom_patient() {
        return Nom_patient;
    }

    public void setNom_patient(String Nom_patient) {
        this.Nom_patient = Nom_patient;
    }

    public String getPrénom_patient() {
        return Prénom_patient;
    }

    public void setPrénom_patient(String Prénom_patient) {
        this.Prénom_patient = Prénom_patient;
    }

    public String getEmail_patient() {
        return Email_patient;
    }

    public void setEmail_patient(String Email_patient) {
        this.Email_patient = Email_patient;
    }

    public String getAdress_patient() {
        return Adress_patient;
    }

    public void setAdress_patient(String Adress_patient) {
        this.Adress_patient = Adress_patient;
    }

    public int getNumTel_patient() {
        return NumTel_patient;
    }

    public void setNumTel_patient(int NumTel_patient) {
        this.NumTel_patient = NumTel_patient;
    }

    public String getMotDePassel_patient() {
        return MotDePassel_patient;
    }

    public void setMotDePassel_patient(String MotDePassel_patient) {
        this.MotDePassel_patient = MotDePassel_patient;
    }

    public int getAge_patient() {
        return Age_patient;
    }

    public void setAge_patient(int Age_patient) {
        this.Age_patient = Age_patient;
    }

    public String getGendre_patient() {
        return Gendre_patient;
    }

    public void setGendre_patient(String Gendre_patient) {
        this.Gendre_patient = Gendre_patient;
    }

    public int getNb_Rdv() {
        return Nb_Rdv;
    }

    public void setNb_Rdv(int Nb_Rdv) {
        this.Nb_Rdv = Nb_Rdv;
    }

    public int getNb_Achat() {
        return Nb_Achat;
    }

    public void setNb_Achat(int Nb_Achat) {
        this.Nb_Achat = Nb_Achat;
    }

    public int getNb_Reclamation() {
        return Nb_Reclamation;
    }

    public void setNb_Reclamation(int Nb_Reclamation) {
        this.Nb_Reclamation = Nb_Reclamation;
    }

    public Boolean getIsblokedpatient() {
        return isblokedpatient;
    }

    public void setIsblokedpatient(Boolean isblokedpatient) {
        this.isblokedpatient = isblokedpatient;
    }

}
