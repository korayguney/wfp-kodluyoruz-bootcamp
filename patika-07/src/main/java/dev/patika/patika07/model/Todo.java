package dev.patika.patika07.model;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Todo extends BaseTodoRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int todoId;

    private int userId;
    private int id;
    private String title;
    private boolean completed;

}
