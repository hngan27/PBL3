package BLL;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.io.FileOutputStream;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

public class AutocompleteTrieList {
	public static void writeSomeDataFromFile(String file, TrieNode node)throws Exception{
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)); 
                oos.writeObject(node);
        } 
	public static class TrieNode implements Serializable{		
	    char data;     
	    LinkedList<TrieNode> children = new LinkedList<>();
	    boolean isEnd = false; 

	    TrieNode(char c) {
	    	data = c;
	    } 
	   
	    TrieNode getChild(char c) {
	    	if (children != null)
	    		for (TrieNode child : children)
	    			if (child.data == c)
	    				return child;
	        return null;
	    }
            public void display(TrieNode node) throws Exception{
            for (TrieNode nodetemp : node.children){
                System.out.println(nodetemp.data);
                display(nodetemp);
            }
            }
        }
	public static class Trie {
	    public TrieNode root = new TrieNode(' '); 
	    public void insert(String word) {       
	        TrieNode node = root; 	 
	        for (char ch : word.toCharArray()) {	           
	            if (node.getChild(ch) == null) 
	            	node.children.add(new TrieNode(ch));
	            node = node.getChild(ch);	            		           
	        }
	        node.isEnd = true;
            }
	    public List<String> autocomplete(String prefix) {     
		    TrieNode node = root;
		    List<String> res = new ArrayList<String>(); 
		    for (char ch: prefix.toCharArray()) { //find end of prefix
		    	node = node.getChild(ch);	     
		    	if (node == null) 
		    		return new ArrayList<String>();      
		    } 
		    helper(node, res, prefix.substring(0, prefix.length()-1));
		    return res;
		}
		
		//recursion helper, Time O(n), Space O(n), n is number of nodes in branches
	    void helper(TrieNode node, List<String> res, String prefix) {		
			if (node.isEnd)  
				res.add(prefix + node.data);		
			for (TrieNode child : node.children) 				
				helper(child, res, prefix + node.data);						
		}
            
	  
}
}