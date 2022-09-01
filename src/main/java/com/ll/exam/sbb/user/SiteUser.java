package com.ll.exam.sbb.user;

import com.ll.exam.sbb.interestKeyword.InterestKeyword;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class SiteUser {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(unique = true)
    private String username;
    @ManyToMany(cascade = CascadeType.ALL)
    @Builder.Default
    private Set<InterestKeyword> interestKeywords = new HashSet<>();
}
