package edu.msg.ro.persistence.user.entity;

import javax.persistence.*;

@Entity
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPermision;
    @Column(nullable = false, length = 50)
    private String type;

    public Long getIdPermision() {
        return idPermision;
    }

    public void setIdPermision(Long idPermision) {
        this.idPermision = idPermision;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(nullable = false, length = 50)
    private String description;

}
