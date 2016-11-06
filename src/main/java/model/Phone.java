package model;


import lombok.Data;

import javax.persistence.*;

@Table(name = "Phone")
@Data
@Entity
public class Phone {
    @Id
    @SequenceGenerator(name = "my_seq", sequenceName = "seq1", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
    @Column(name = "id")
    private Long id;

    @Column(name = "type")
    private String type;

    @Column(name = "value")
    private String value;

}
