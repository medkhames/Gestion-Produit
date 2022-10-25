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
import prod.entity.Achat;
import prod.entity.Patient;
import prod.entity.Produit;
import prod.utils.MyConnectionProd;

/**
 *
 * @author asus
 */
public class AchatCRUD {
     Connection cnx1;
    public AchatCRUD(){
        cnx1 = MyConnectionProd.getInstance().getCnx();
        
    }
   private ResultSet rs;
    
    public void ajouterAchat(Achat a ){
        try {
            String requete1 = "INSERT INTO Achat (id_produit,quantité,id_patien,prix_unitaire,date_achat) VALUES(?,?,?,?,?)";
            PreparedStatement pst = cnx1.prepareStatement(requete1);
           
           
            pst.setInt(1,a.getId_produit());
            pst.setInt(2,a.getQuantité());
            pst.setInt(3,a.getId_patien());
            pst.setFloat(4, a.getPrix_unitaire());
            pst.setString(5, a.getDate_achat());
            
            pst.executeUpdate();
            System.out.println("Produit est ajoutée avec succée!");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
             
        }
           
    }
    public List<Achat> FindAll(int idp){
        
        List<Achat> list = new ArrayList<>();
        String req55 = "SELECT`nom_prod`,`discription`,`prix`,"
                + "`quantité`,`nom_patient`,`Prénom_patient`,`prix_unitaire`,`date_achat`"
                + " FROM `achat` JOIN `produit` ON achat.id_produit = produit.id_prod JOIN `patient`"
                + "ON achat.id_patien = patient.Id_patient WHERE achat.id_produit = " + idp + "   ";
        try {
            Statement st =cnx1.createStatement();
            rs = st.executeQuery(req55);
            while (rs.next()){
                Patient pat = new Patient();
                Produit P = new Produit();
                Achat a = new Achat();
                
               
                P.setNom_prod(rs.getString("nom_prod"));
                P.setDiscription(rs.getString("discription"));
                P.setPrix(Integer.parseInt(rs.getString("prix")));
                 pat.setNom_patient(rs.getString("Nom_patient"));
                pat.setPrénom_patient(rs.getString("Prénom_patient"));
                //a.setNom_produit(rs.getString("nom_produit"));
                a.setQuantité(Integer.parseInt(rs.getString("quantité")));
                //a.setNom_patient(rs.getString("nom_patient"));
                a.setPrix_unitaire(Integer.parseInt(rs.getString("prix_unitaire")));
                a.setDate_achat(rs.getString("date_achat"));
                a.setPruduit(P);
                a.setPastient(pat);
                list.add(a);
            }
             System.out.println("produit FOUND SUCCSEFULY !");
        } catch (SQLException ex) {
            
               System.err.println(ex.getMessage());
        }
          return list;
    }
    
    /* public List<Achat> afficherAchat(){
                    List<Achat> myList = new ArrayList<>();

        try {
            String req2 = "SELECT * FROM achat";
            Statement st = cnx1.createStatement();
            ResultSet rs = st.executeQuery(req2);
            while(rs.next()){
                Achat a = new Achat();
               // p.setId_prod(rs.getInt(1));
                a.setNom_produit(rs.getString("nom_produit"));
                a.setQuantité(rs.getInt("quantité"));
                a.setNom_patient(rs.getString("nom_patient"));
                a.setPrix_unitaire(rs.getFloat("prix_unitaire"));
                a.setDate_achat(rs.getString("date_achat"));
                myList.add(a);
            }
           
        } catch (SQLException ex) {
             System.err.println(ex.getMessage());

        }
        return myList;
        
    }*/
     
     
        public void deleteAchat(int id_achat){
       
         PreparedStatement pst = null;
        try {
            String req3 = "DELETE FROM achat WHERE id_achat=? ";
            pst = new MyConnectionProd().getCnx().prepareStatement(req3);
            pst.setInt(1, id_achat);
            pst.execute();
            System.out.println("Produit est supprimer avec succés!");

        } catch (SQLException ex) {
               System.err.println(ex.getMessage());
        }
              
        }
        
    //    private ResultSet st;
        
      /* public void UpdateQuantité( int id,int qte, float prix_unitaire) {

        try {
             
            String sql = "select quantité FROM `achat` WHERE id_achat = '" + id + "'  ";
             Statement st = cnx1.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            float  prix_total = 0;
            if (rs.next()) {
                
                int min = rs.getInt("quantité")-qte;
                float prix_tolal = prix_unitaire*min;
                
                String sql4 = "UPDATE achat set quantité='" +min+"' "
                   +" WHERE  id_achat='"+ id +"' ";
                   st.executeUpdate(sql4);
            }
            
            else if(rs.next()){
            
                int max = rs.getInt("quantité")+qte;
                prix_total = prix_unitaire*max;
                
                String sql2 = "Update achat set quantité='" + max + "'"
                    + "where id_achat='"+id+"'";
                st.executeUpdate(sql2);
                
                
                
                String sql3 = "Update achat set prix_total WHERE id_achat= '"+ id +"'";
            st.executeUpdate(sql3);
            
            }

        } catch (SQLException ex) {
        }
    }*/
     
    /* public void modifierAchat(Achat A){
        try {
            String req4= "UPDATE achat SET id_achat=?,nom_produit=?,quantité=?,prix_total=?,prix_unitaire=?,date_achat=? WHERE id_achat= ?";
            PreparedStatement pst = cnx1.prepareStatement(req4);
            pst.setInt(1, A.getId_achat());
            pst.setString(2, A.getNom_produit());
            pst.setInt(3, A.getQuantité());
            pst.setFloat(4, A.getPrix_total());
            pst.setFloat(5, A.getPrix_unitaire());
            pst.setString(6, A.getDate_achat());
            pst.setInt(7, A.getId_achat());
            pst.executeUpdate();
            System.out.println("Produit est modifie avec  succeé!");
        } catch (SQLException ex) {
             System.err.println(ex.getMessage());
        }
    }*/
    
}
