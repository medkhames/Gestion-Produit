/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prod.entity;

/**
 *
 * @author asus
 */
public class Achat {
     public int	id_achat;
    public int id_produit;
    public  int quantité ;	
    public int id_patien ;	 
    public float prix_unitaire ;
     public   String date_achat;
     private Patient pastient;
      private Produit produit;
      public Achat(){
        
    }

    public Achat(int id_achat, int id_produit, int quantité, int id_patien, float prix_unitaire, String date_achat) {
        this.id_achat = id_achat;
        this.id_produit = id_produit;
        this.quantité = quantité;
        this.id_patien = id_patien;
        this.prix_unitaire = prix_unitaire;
        this.date_achat = date_achat;
    }

    public Achat(int quantité, float prix_unitaire, String date_achat) {
        this.quantité = quantité;
        this.prix_unitaire = prix_unitaire;
        this.date_achat = date_achat;
    }
    

   

    public Achat(int id_produit) {
        this.id_produit = id_produit;
    }

    public int getId_achat() {
        return id_achat;
    }

    public void setId_achat(int id_achat) {
        this.id_achat = id_achat;
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    public int getId_patien() {
        return id_patien;
    }

    public void setId_patien(int id_patien) {
        this.id_patien = id_patien;
    }

    public float getPrix_unitaire() {
        return prix_unitaire;
    }

    public void setPrix_unitaire(float prix_unitaire) {
        this.prix_unitaire = prix_unitaire;
    }

    public String getDate_achat() {
        return date_achat;
    }

    public void setDate_achat(String date_achat) {
        this.date_achat = date_achat;
    }

    public Patient getPastient() {
        return pastient;
    }

    public void setPastient(Patient pastient) {
        this.pastient = pastient;
    }
      public Produit getProduit() {
        return produit;
    }

    public void setPruduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "Achat{" + "quantit\u00e9=" + quantité + ", prix_unitaire=" + prix_unitaire + ", date_achat=" + date_achat + ", pastient=" + pastient + ", produit=" + produit + '}';
    }
   
    
    

    

   
    
}
