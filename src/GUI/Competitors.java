/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author rubinkazan
 */
@Entity
@Table(name = "COMPETITORS", catalog = "", schema = "JAKE4954")
@NamedQueries({
    @NamedQuery(name = "Competitors.findAll", query = "SELECT c FROM Competitors c"),
    @NamedQuery(name = "Competitors.findById", query = "SELECT c FROM Competitors c WHERE c.id = :id"),
    @NamedQuery(name = "Competitors.findBySurname", query = "SELECT c FROM Competitors c WHERE c.surname = :surname"),
    @NamedQuery(name = "Competitors.findByName", query = "SELECT c FROM Competitors c WHERE c.name = :name"),
    @NamedQuery(name = "Competitors.findByDob", query = "SELECT c FROM Competitors c WHERE c.dob = :dob"),
    @NamedQuery(name = "Competitors.findByEmail", query = "SELECT c FROM Competitors c WHERE c.email = :email"),
    @NamedQuery(name = "Competitors.findByPassword", query = "SELECT c FROM Competitors c WHERE c.password = :password"),
    @NamedQuery(name = "Competitors.findByGender", query = "SELECT c FROM Competitors c WHERE c.gender = :gender"),
    @NamedQuery(name = "Competitors.findByTrainer", query = "SELECT c FROM Competitors c WHERE c.trainer = :trainer"),
    @NamedQuery(name = "Competitors.findByWeight", query = "SELECT c FROM Competitors c WHERE c.weight = :weight"),
    @NamedQuery(name = "Competitors.findByHeight", query = "SELECT c FROM Competitors c WHERE c.height = :height")})
public class Competitors implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DOB")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "GENDER")
    private Character gender;
    @Column(name = "TRAINER")
    private String trainer;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "WEIGHT")
    private Double weight;
    @Column(name = "HEIGHT")
    private Double height;

    public Competitors() {
    }

    public Competitors(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        String oldSurname = this.surname;
        this.surname = surname;
        changeSupport.firePropertyChange("surname", oldSurname, surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        Date oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        Character oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        String oldTrainer = this.trainer;
        this.trainer = trainer;
        changeSupport.firePropertyChange("trainer", oldTrainer, trainer);
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        Double oldWeight = this.weight;
        this.weight = weight;
        changeSupport.firePropertyChange("weight", oldWeight, weight);
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        Double oldHeight = this.height;
        this.height = height;
        changeSupport.firePropertyChange("height", oldHeight, height);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Competitors)) {
            return false;
        }
        Competitors other = (Competitors) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GUI.Competitors[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
