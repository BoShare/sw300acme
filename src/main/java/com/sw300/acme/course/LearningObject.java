package com.sw300.acme.course;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class LearningObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;

    @ManyToMany
    private List<Topic> topicList;

    @ManyToMany
    private List<Practice> practiceList;
}
