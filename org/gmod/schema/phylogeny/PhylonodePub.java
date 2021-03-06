package org.gmod.schema.phylogeny;
// Generated Aug 31, 2006 4:02:18 PM by Hibernate Tools 3.2.0.beta7


import org.gmod.schema.pub.Pub;










/**
 * PhylonodePub generated by hbm2java
 */


public class PhylonodePub  implements java.io.Serializable {

    // Fields    

     private int phylonodePubId;
     private Pub pub;
     private Phylonode phylonode;

     // Constructors

    /** default constructor */
    public PhylonodePub() {
    	// Deliberately empty default constructor
    }

    /** full constructor */
    public PhylonodePub(int phylonodePubId, Pub pub, Phylonode phylonode) {
       this.phylonodePubId = phylonodePubId;
       this.pub = pub;
       this.phylonode = phylonode;
    }
   
    // Property accessors

    

    public int getPhylonodePubId() {
        return this.phylonodePubId;
    }
    
    public void setPhylonodePubId(int phylonodePubId) {
        this.phylonodePubId = phylonodePubId;
    }

    

    public Pub getPub() {
        return this.pub;
    }
    
    public void setPub(Pub pub) {
        this.pub = pub;
    }

    

    public Phylonode getPhylonode() {
        return this.phylonode;
    }
    
    public void setPhylonode(Phylonode phylonode) {
        this.phylonode = phylonode;
    }




}


