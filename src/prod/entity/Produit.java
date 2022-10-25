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
public class Produit {
     private int id_prod;
    private String nom_prod;
    private String discription;
    private String reference;
    private int prix;
    private String categories;
    
    public Produit(){
        
    }

    public Produit(int id_prod, String nom_prod, String discription, String reference, int prix, String categories) {
        this.id_prod = id_prod;
        this.nom_prod = nom_prod;
        this.discription = discription;
        this.reference = reference;
        this.prix = prix;
        this.categories = categories;
    }

    public Produit(String nom_prod, String discription, String reference, int prix, String categories) {
        this.nom_prod = nom_prod;
        this.discription = discription;
        this.reference = reference;
        this.prix = prix;
        this.categories = categories;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public String getNom_prod() {
        return nom_prod;
    }

    public void setNom_prod(String nom_prod) {
        this.nom_prod = nom_prod;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Produit{" + "id_prod=" + id_prod + ", nom_prod=" + nom_prod + ", discription=" + discription + ", reference=" + reference + ", prix=" + prix + ", categories=" + categories + '}';
    }

    

   
    
}
