package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
	
	private ArrayList<Integer>votadores;
	
	public Registry() {
		votadores=new ArrayList<Integer>();
		
	}
    public RegisterResult registerVoter(Person p) {
    	Integer id=p.getId();
    	RegisterResult registerResult= RegisterResult.VALID;
    	
    		if(yaVoto(id)){
    			registerResult=RegisterResult.DUPLICATED;
    		}else if(!p.isAlive()){
    			registerResult=RegisterResult.DEAD;
    		}else if(p.getAge()<0 || p.getAge()>150) {
    			registerResult=RegisterResult.INVALID_AGE;
    		}else if(p.getAge()<18) {
    			registerResult=RegisterResult.UNDERAGE;
    		}else {
    			votadores.add(id);
    		}
    		
    		return registerResult;
    }
    
    public Boolean yaVoto(int id) {
    	for(int i=0;i<votadores.size();i++) {
    		if(votadores.get(i)==id) {
    			return true;
    		}else {
    			return false;
    		}
    		
    	}
    	return false;
    	
    }
}