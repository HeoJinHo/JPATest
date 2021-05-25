package com.example.webjpaproject.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Account{

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    private String password;

    /*
    * 테이블 Account가 테이블 주인이고 상세는 Study Table
    * mappedBy 를 하고 주인쪽에 주인을 입력해야 양방향 관계형 테이블이 생성이됨
    * */
    @OneToMany(mappedBy = "owner")
    private Set<Study> studies = new HashSet<>();


    /*
    * JpaRunner에서 관계형 테이블만들때(양방향 일경우) 하나의 메소드로 묶어서 처리가능
    * 하단에 삭제할경우도 두개의 관계형 테이블을 같이 삭제를 해줘야 정상처리가됨
    * */
    public void addStudy(Study study)
    {
        this.getStudies().add(study);
        study.setOwner(this);
    }
    public void removeStudy(Study study)
    {
        this.getStudies().remove(study);
        study.setOwner(null);
    }


//
//    @Temporal(TemporalType.TIME)
//    private Date created = new Date();
//
//    private String yes;
//
//    /**
//     * @Transient 컬럼으로 만들진 않는다
//     * */
//    @Transient
//    private String no;
//
//    /**
//     * Address 라는 객체의 street를 같이 사용하는데 컬럼명을 home_street로 변경하여 사용
//     * */
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "street", column = @Column(name = "home_street"))
//    })
//    private Address address;




}
