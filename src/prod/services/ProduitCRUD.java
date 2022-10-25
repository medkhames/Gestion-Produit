/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prod.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import prod.entity.Produit;
import prod.utils.MyConnectionProd;


/**
 *
 * @author asus
 */
public class ProduitCRUD {
    
    Connection cnx2;
    public ProduitCRUD(){
        cnx2 = MyConnectionProd.getInstance().getCnx();
        
    }
   
    
   /* public void ajouterProduit(){
        try {
            String req1 ="INSERT INTO produit (nom_prod,discription,reference,prix,categories)"
                    + "VALUES ('Doliprane','douleur et fiévre','CIP120120',2700,'medicament')";
            Statement st = cnx2.createStatement();
            st.executeUpdate(req1);
            System.out.println("Produit ajoutée avec succés!");

        } catch (SQLException ex) {
                        System.err.println(ex.getMessage());

        }
        
    }*/
    public void ajouterProduit2(Produit p ){
        try {
            String requete2 = "INSERT INTO produit (nom_prod,discription,reference,prix,categories) VALUES(?,?,?,?,?)";
            PreparedStatement pst = cnx2.prepareStatement(requete2);
           
           // pst.setInt(1,p.getId_prod());
            pst.setString(1,p.getNom_prod());
            pst.setString(2,p.getDiscription());
            pst.setString(3,p.getReference());
            pst.setInt(4, p.getPrix());
            pst.setString(5, p.getCategories());
            //pst.setInt(7, p.getId_prod());
            pst.executeUpdate();
            System.out.println("Produit est ajoutée avec succée!");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
             
        }
           
    }
    
     public void modifierProduit(Produit P){
        try {
            String req4= "UPDATE produit SET id_prod=?,nom_prod=?,discription=?,reference=?,prix=?,categories=? WHERE id_prod= ?";
            PreparedStatement pst = cnx2.prepareStatement(req4);
            pst.setInt(1, P.getId_prod());
            pst.setString(2, P.getNom_prod());
            pst.setString(3, P.getDiscription());
            pst.setString(4, P.getReference());
            pst.setInt(5, P.getPrix());
            pst.setString(6, P.getCategories());
            pst.setInt(7, P.getId_prod());
            pst.executeUpdate();
            System.out.println("Produit est modifie avec  succeé!");
        } catch (SQLException ex) {
             System.err.println(ex.getMessage());
        }
    }
     
      
    
    
    public List<Produit> afficherProduit(){
                    List<Produit> myList = new ArrayList<>();
                 String req2 = "SELECT * FROM produit";
        try {
           
            Statement st = cnx2.createStatement();
            ResultSet rs = st.executeQuery(req2);
            while(rs.next()){
                Produit p = new Produit(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6));
                myList.add(p);
            }
            System.out.println(" ALL PRODUCT FOUND SUCCSEFULY !");
        } catch (SQLException ex) {
             System.err.println(ex.getMessage());

        }
        return myList;
        
    }
    
     public void deleteProduit(int id_prod){
       
         PreparedStatement pst = null;
        try {
            String req3 = "DELETE FROM produit WHERE id_prod=? ";
            pst = new MyConnectionProd().getCnx().prepareStatement(req3);
            pst.setInt(1, id_prod);
            pst.execute();
            System.out.println("Produit est supprimer avec succés!");

        } catch (SQLException ex) {
               System.err.println(ex.getMessage());
        }
              
        }
    
     /*public void deleteProduit(int id){
       String req3 = "DELETE FROM `produit` WHERE id_prod= '"+ id +"' ";
         
        try {
              Statement st = cnx2.createStatement();
              st.executeUpdate(req3);          
              System.out.println("Produit supprimer avec succés!");

        } catch (SQLException ex) {
               System.err.println(ex.getMessage());
        }
              
     }*/
    
      public List<Produit> RechercherByNom(String nom_prod){
         
         List<Produit> produit = new ArrayList<>();
            String reqR = "SELECT * FROM produit WHERE nom_prod LIKE '" + nom_prod + "' ";
         
        try {
            
            Statement st = cnx2.createStatement();
            ResultSet rs = st.executeQuery(reqR);
            
            while (rs.next()){
                produit.add(new Produit(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getInt(5), rs.getString(6)));
                System.out.println("le produit est trouver!");
            }
            
        } catch (SQLException ex) {
             System.err.println(ex.getMessage());
        }
        return produit;
     }
    
        public List<Produit> RechercherByDiscription(String discription){
         
         List<Produit> produit = new ArrayList<>();
            String reqR = "SELECT * FROM produit WHERE discription LIKE '" + discription + "' ";
         
        try {
            
            Statement st = cnx2.createStatement();
            ResultSet rs = st.executeQuery(reqR);
            
            while (rs.next()){
                produit.add(new Produit(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getInt(5), rs.getString(6)));
                System.out.println("le produit est trouver!");
            }
            
        } catch (SQLException ex) {
             System.err.println(ex.getMessage());
        }
        return produit;
     }
        
         public List<Produit> RechercherByCategories(String categories){
         
         List<Produit> produit = new ArrayList<>();
            String reqR = "SELECT * FROM produit WHERE categories LIKE '" + categories + "' ";
         
        try {
            
            Statement st = cnx2.createStatement();
            ResultSet rs = st.executeQuery(reqR);
            
            while (rs.next()){
                produit.add(new Produit(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getInt(5), rs.getString(6)));
                System.out.println("le produit est trouver!");
            }
            
        } catch (SQLException ex) {
             System.err.println(ex.getMessage());
        }
        return produit;
     }

  

 
    
}
