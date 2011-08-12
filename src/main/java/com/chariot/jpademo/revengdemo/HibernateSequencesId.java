package com.chariot.jpademo.revengdemo;
// Generated Aug 12, 2011 5:43:50 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * HibernateSequencesId generated by hbm2java
 */
@Embeddable
public class HibernateSequencesId  implements java.io.Serializable {


     private String sequenceName;
     private Integer sequenceNextHiValue;

    public HibernateSequencesId() {
    }

    public HibernateSequencesId(String sequenceName, Integer sequenceNextHiValue) {
       this.sequenceName = sequenceName;
       this.sequenceNextHiValue = sequenceNextHiValue;
    }
   

    @Column(name="sequence_name")
    public String getSequenceName() {
        return this.sequenceName;
    }
    
    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName;
    }

    @Column(name="sequence_next_hi_value")
    public Integer getSequenceNextHiValue() {
        return this.sequenceNextHiValue;
    }
    
    public void setSequenceNextHiValue(Integer sequenceNextHiValue) {
        this.sequenceNextHiValue = sequenceNextHiValue;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof HibernateSequencesId) ) return false;
		 HibernateSequencesId castOther = ( HibernateSequencesId ) other; 
         
		 return ( (this.getSequenceName()==castOther.getSequenceName()) || ( this.getSequenceName()!=null && castOther.getSequenceName()!=null && this.getSequenceName().equals(castOther.getSequenceName()) ) )
 && ( (this.getSequenceNextHiValue()==castOther.getSequenceNextHiValue()) || ( this.getSequenceNextHiValue()!=null && castOther.getSequenceNextHiValue()!=null && this.getSequenceNextHiValue().equals(castOther.getSequenceNextHiValue()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSequenceName() == null ? 0 : this.getSequenceName().hashCode() );
         result = 37 * result + ( getSequenceNextHiValue() == null ? 0 : this.getSequenceNextHiValue().hashCode() );
         return result;
   }   


}


