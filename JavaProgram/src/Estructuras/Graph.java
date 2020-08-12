package Estructuras;

import java.util.ArrayList;

/**
 *
 * @author User
 * @param <n>
 * @param <e>
 */
public class Graph<n,e> {
    private ListaSimple<Node<n>> nodeList;
    private ListaSimple<Edge<e>> edgeList;

    public Graph() {
        this.nodeList = new ListaSimple<>();
        this.edgeList = new ListaSimple<>();
    }
    

    public Node<n> getNode(n label){
        for (Node<n> node: this.nodeList)
            if (node.getLabel().equals(label)) {
                return node;
            }
        return null;
    }

    public void setNodeList(ListaSimple<Node<n>> nodeList) {
        this.nodeList = nodeList;
    }

    public void setEdgeList(ListaSimple<Edge<e>> edgeList) {
        this.edgeList = edgeList;
    }
    
    
    public Node<n> getNode(String ID){
        for (Node<n> node: this.nodeList)
            if (node.getID().equals(ID)) {
                return node;
            }
        return null;
    }
    
    public Node<n> getNodename(String name){
        for (Node<n> node: this.nodeList)
            if (node.getLabel().equals(name)) {
                return node;
            }
        return null;
    }
    
    public NodoListasimple<Node<n>> getNode(int pos){
        
        return this.nodeList.getNodo(pos);
        
    }
    
    
    public Edge<e> getEdge(String ID){
        for (Edge<e> edge: this.edgeList){
            if (edge.getID().equals(ID)){
                return edge;
            }
        }
        return null;
    }
    
    public NodoListasimple<Edge<e>> getEdge(int pos){
        return this.edgeList.getNodo(pos);
    }
    
    public Edge<e> getEdge(e Source, e Targe){
        for (Edge<e>edge: this.edgeList){
            if (edge.getSource().equals(Source) && edge.getTarget().equals(Targe)){
                return edge;
            }
            
            else if (edge.getSource().equals(Targe) && edge.getTarget().equals(Source)){
                return edge;
            }
        }
        System.out.print("The edge not exist");
        return null;  
    }
    
   
    
    public void addNode(n data){
        Node<n> node = new Node<>(data);
        this.nodeList.addFirst(node);
    }
    
    public void addNode(Node<n> node){
        this.nodeList.addFirst(node);
    }
    
    /**
     *
     * @param edge
     */
    public void addEdge(Edge<e> edge){
        e sourge = edge.getSource();
        e target = edge.getTarget();
        if (this.ifExistEdge(sourge, target)||ifExistEdge(target, sourge)){ 
            System.out.print("This edge already exists ");
        }else{
            this.edgeList.addFirst(edge);
        }
        
    }


    public ListaSimple<Node<n>> getNodeList() {
        return nodeList;
    }

    public ListaSimple<Edge<e>> getEdgeList() {
        return edgeList;
    }
    
    public void removeEdge(String ID){
        for (Edge<e> edge: this.getEdgeList()){
            if (edge.getID().equals(ID)){
                this.edgeList.remove(edge);
            }
        }
    }
    
    public void removeEdge(Edge<e> edge){
        this.edgeList.remove(edge);
    }
    
    public void removeEdge(e source,e target){
        for (Edge<e> edge: this.getEdgeList()){
            if (edge.getSource().equals(source)&&edge.getTarget().equals(target)){
                this.edgeList.remove(edge);
            }
        }
    }
    
    public void removeNode(String label){
        for (Node<n> node: this.nodeList){
            if (node.getLabel().equals(label)){
                this.nodeList.remove(node);
            }
        }
    }
    
    public void removeNodeID(String ID){
        for (Node<n> node: this.nodeList){
            if (node.getID().equals(ID)){
                this.nodeList.remove(node);
            }
        }
    }
    
    public void removeNode(Node<n> node){
        this.nodeList.remove(node);
    }
    
    public boolean ifExistNode(String label){
        for (Node<n>node: this.getNodeList()){
            if (node.getLabel().equals(label)){
                return true;
            }
        }
        return false;
    }
    
    public boolean ifExistEdge(e source,e target){
        for (Edge<e> edge: this.getEdgeList()){
            if (edge.getSource().equals(source)&&edge.getTarget().equals(target)){
                return true;
                
            }
        }
        return false;
    }
    
    public int sizeEdgeList(){
        return this.edgeList.size();
    }
    
    public int sizeNodeList(){
        return this.edgeList.size();
    }
    
    public ArrayList<Edge<e>> allrelationNodes(e node){
        ArrayList<Edge<e>> relationList = new ArrayList<>();
        for (Edge<e> auxedge: this.getEdgeList()){
            if(auxedge.getSource().equals(node) || auxedge.getTarget().equals(node)){
                relationList.add(auxedge);
            }
            
        }
        return relationList;
    }
}
