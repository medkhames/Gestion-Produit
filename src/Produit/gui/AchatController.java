/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produit.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;
import prod.entity.Produit;
import prod.services.ProduitCRUD;

/**
 * FXML Controller class
 *
 * @author asus
 */
public class AchatController implements Initializable {

    @FXML
    private TableView<Produit> tableProd;
    @FXML
    private TableColumn<Produit, String> LNP;
    @FXML
    private TableColumn<Produit, String> LD;
    @FXML
    private TableColumn<Produit, String> LC;
    @FXML
    private TableColumn<Produit, Integer> LP;
    @FXML
    private TextField LRECH;
    
    /////////////
    @FXML
    private TableView<Achat> table2;
    @FXML
    private Button btajt;
    @FXML
    private TextField qte;

    /**
     * Initializes the controller class.
     */
    ObservableList<Produit> list;
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         LNP.setCellValueFactory(new PropertyValueFactory<Produit, String>("Nom_prod"));
       LD.setCellValueFactory(new PropertyValueFactory<Produit, String>("Discription"));
       //Reference.setCellValueFactory(new PropertyValueFactory<Produit, String>("Reference"));
       LP.setCellValueFactory(new PropertyValueFactory<Produit, Integer>("Prix"));
       LC.setCellValueFactory(new PropertyValueFactory<Produit, String>("Categories"));
      // listM = MyConnectionProd.getAllProduit();
       //tableProduit.setItems(list);
       refresh_table();
     
    }    
   // TODO
    public void  refresh_table () {
   
             try {
              ProduitCRUD pr =new ProduitCRUD();
          ObservableList<Produit> list = FXCollections.observableArrayList(pr.afficherProduit());   
          this.tableProd.getItems().clear();
          this.tableProd.getItems().addAll(list);
          
          
        } catch (Exception e) {
        }
      
    }

    @FXML
    private void RechP(KeyEvent event) {
         ProduitCRUD Pr =new ProduitCRUD();

          ObservableList<Produit> list = FXCollections.observableArrayList(Pr.afficherProduit());   
        
      FilteredList<Produit> filteredData = new FilteredList<>(list, b -> true);
        // 2. Set the filter Predicate whenever the filter changes.
		LRECH.textProperty().addListener((observable, oldValue, newValue) -> {
                    filteredData.setPredicate(Produit -> {
                        
				// If filter text is empty, display all persons.
								
				if (newValue == null || newValue.isEmpty()) {
					
                                        //System.out.println("biennnnnnnnnnn");
                                        return true;
				}
				
				// Compare first name and last name of every person with filter text.
				String lowerCaseFilter = newValue.toLowerCase();
				
				/*if (Produit.getNom_prod.toLowerCase().indexOf(lowerCaseFilter) != -1 ) {
					return true; // Filter matches first name.
				}*/
                                 if (Produit.getDiscription().toLowerCase().indexOf(lowerCaseFilter) != -1) {
					return true; 
				} 
                                 else if (Produit.getCategories().toLowerCase().indexOf(lowerCaseFilter) != -1) {
					return true; 
				}
                             
                                else if (String.valueOf(Produit.getPrix()).indexOf(lowerCaseFilter) != -1) 
					return true; // Filter matches last name.
				
				     //return true;
				     else  
				    	 return false; // Does not match.
			
                       
                        
                    });
			
		});
		
		// 3. Wrap the FilteredList in a SortedList. 
		SortedList<Produit> sortedData = new SortedList<>(filteredData);
		
		// 4. Bind the SortedList comparator to the TableView comparator.
		// 	  Otherwise, sorting the TableView would have no effect.
		sortedData.comparatorProperty().bind(tableProd.comparatorProperty());
		
		// 5. Add sorted (and filtered) data to the table.
		tableProd.setItems(sortedData);    
    }

    @FXML
    private void tab1(MouseEvent event) {
        int id_prod = tableProd.getSelectionModel().getSelectedIndex();
        ObservableList<Achat> produits = (ObservableList<Achat>) table2.getItems();
  
    }

    
    
    @FXML
    private void tab2(MouseEvent event) {
        
    }

    @FXML
    private void Ajt(ActionEvent event) {
        
        
    }      
            
            
            
            
           




}
