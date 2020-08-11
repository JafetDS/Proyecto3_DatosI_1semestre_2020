/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author User
 * @param <T>
 */
public class Edge<T> {
    private T source;   
    private T target; 
    private String ID;
    private Integer cost;
    
    /**
     * Constructor del Nodo vacio
     */
    public Edge(){
               
    }

    public T getSource() {
        return source;
    }

    public void setSource(T source) {
        this.source = source;
    }

    public T getTarget() {
        return target;
    }

    public void setTarget(T target) {
        this.target = target;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Integer getCost() {
        return cost;
    }

    public void setWeight(Integer weight) {
        this.cost = weight;
    }
    
    public T getConnection(T connection){
        if(connection.equals(this.source)){
           return this.target; 
        }
        else if (connection.equals(this.target)){
            return this.source;
        }
        
        return null;
    }

        
    

    
}
