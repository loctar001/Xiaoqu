package com.cn.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Loctar on 2014/10/23.
 */
@Entity(name = "Test")
@Table(name = "ZL_TEST")
@Access(AccessType.FIELD)
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING, length = 31)
@XmlRootElement
public class Test implements Serializable{
    @Id
    @SequenceGenerator(name = "TEST_GEN", allocationSize = 1, initialValue = 1, sequenceName = "TEST_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TEST_GEN")
    @Column(name = "TEST_ID", nullable = false, precision = 19, scale = 0)
    public long id;
    @Column(name = "NAME", nullable = true, length = 60)
    public String name;

    public Test() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
