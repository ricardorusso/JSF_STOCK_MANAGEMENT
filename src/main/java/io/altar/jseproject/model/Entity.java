package io.altar.jseproject.model;

import java.io.Serializable;

public class Entity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Long ID;
	 
	 
	public long getID(){
			return ID;
		}
	 public void setID(long x) {
		 this.ID =  x;
	 }
	 
	    @Override
	    public boolean equals(Object other) {
	        return (other instanceof Entity) && (ID != null)
	            ? ID.equals(((Entity) other).ID)
	            : (other == this);
	    }

	    @Override
	    public int hashCode() {
	        return (ID != null)
	            ? (this.getClass().hashCode() + ID.hashCode())
	            : super.hashCode();
	    }

	    @Override
	    public String toString() {
	        return String.format("ExampleEntity[%d,]", ID);
	    }

}
