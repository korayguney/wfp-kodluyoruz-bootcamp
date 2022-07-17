package dev.patika.patika05.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
//@Value // immutable
@Data // --> @Getter, @Setter, @EqualsAndHashCode, @ToString, @RequiredArgsConstuctor
@NoArgsConstructor
//@Entity
public class Student {
   // @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullname;
    private int schoolNumber;
    private int age;
}
