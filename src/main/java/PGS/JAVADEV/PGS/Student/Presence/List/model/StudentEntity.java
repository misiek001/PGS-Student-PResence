package PGS.JAVADEV.PGS.Student.Presence.List.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   long id;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "studentEntity")
    private Set<StudentSubjectEntity> studentSubjectEntities = new HashSet<>();

    public StudentEntity(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity studentEntity = (StudentEntity) o;

        return id == studentEntity.id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<StudentSubjectEntity> getStudentSubjectEntities() {
        return studentSubjectEntities;
    }

    public void setStudentSubjectEntities(Set<StudentSubjectEntity> studentSubjectEntities) {
        this.studentSubjectEntities = studentSubjectEntities;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
