package fr.uga.l3miage.tp1.exo3.models.exo3.models;

import javax.persistence.*;

@Entity
@Table(name = "product_entity")
public class ProductEntity {
    @Id
    @Column(length = 15)
    private String barCodeNumber;
    @Column
    private String name;
    @Column
    private boolean consumable;
    @ManyToOne
    private BrandEntity brand;
}
