
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitiesJPA;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Yeray
 */
@Entity
@Table(name = "department", schema = "grupo5_database")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**
     * Department id
     */
    private Long id;
    /**
     * Department name
     */
    private String name;
    
    /**
     * Companies collection
     */
    @ManyToMany
    private Collection<Company> companies;
    
    /**
     * Areas collection
     */
    @ManyToMany
    private Collection<Area> areas;

    /**
     * method to get the department id
     *
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Method to set department id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * Method to get departments name
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Method to set departments name
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get a collecton of companies
     * @return the companies
     */
    public Collection<Company> getCompanies() {
        return companies;
    }

    /**
     * Method to set a collection of companies
     * @param companies the companies to set
     */
    public void setCompanies(Collection<Company> companies) {
        this.companies = companies;
    }

    /**
     * Method to get a collection of areas
     * @return the areas
     */
    public Collection<Area> getAreas() {
        return areas;
    }

    /**
     * Method to set a collection of areas
     * @param areas the areas to set
     */
    public void setAreas(Collection<Area> areas) {
        this.areas = areas;
    }
    
    
    /**
     * Method to create a hashCode
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    
    /**
     * Method to know if to objects are equals
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    /**
     * Method to change the id from long to string
     * @return 
     */
    @Override
    public String toString() {
        return "entitiesJPA.Department[ id=" + id + " ]";
    }


}

