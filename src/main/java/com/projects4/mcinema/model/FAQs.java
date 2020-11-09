package com.projects4.mcinema.model;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FAQs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int faqsid;

    @Column(length = 100)
    private  String question;

    @Column(length = 100)
    private String answer;
}
