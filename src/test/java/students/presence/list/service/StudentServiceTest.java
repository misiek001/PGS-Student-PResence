package students.presence.list.service;

import students.presence.list.dto.StudentDTO;
import students.presence.list.model.Student;
import students.presence.list.model.Enrollment;
import students.presence.list.model.Course;
import students.presence.list.repositories.StudentRepository;
import students.presence.list.repositories.EnrollmentRepository;
import students.presence.list.repositories.CourseRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceTest {
    public static final long ID_1 = 1l;
    public static final String STUDENT1_FIRST_NAME = "Jan";
    public static final String STUDENT1_LAST_NAME = "Kowalski";
    @Autowired
    StudentService studentService;

    @Mock
    StudentRepository studentRepository;

    @Mock
    CourseRepository courseRepository;

    @Mock
    EnrollmentRepository enrollmentRepository;



    @Before
    public void setUp() throws Exception {
/*

        studentService = new StudentService(
                studentRepository, courseRepository, enrollmentRepository
        );
    }
    @Test
    public void findAllStudents() throws Exception {

        //Given
        Student studentFirst = new Student();
        Student studentSecond = new Student();
        Set<Student> studentEntities = new HashSet<>();
        studentEntities.add(studentFirst);
        studentEntities.add(studentSecond);


        when(studentRepository.findAll()).thenReturn(studentEntities);

        //When
        Set<StudentDTO> studentDTOS = studentService.findAllStudents();

        //Then
        assertEquals(1, studentDTOS.size());
        verify(studentRepository,times(1)).findAll();


    }

    @Test
    public void findById() throws Exception {

        //Given
        Student student = new Student();
        student.setId(ID_1);

        when(studentRepository.findById(ID_1)).thenReturn(student);

        //When
        StudentDTO studentDTO = studentService.findById(ID_1);

        //Then
        assertEquals(ID_1, studentDTO.getId());
        verify(studentRepository,times(2)).findById(ID_1);
    }

    @Test
    public void findByFirstNameAndLastName() throws Exception {
        //Given
        Student student = new Student();
        student.setId(ID_1);
        student.setFirstName(STUDENT1_FIRST_NAME);
        student.setLastName(STUDENT1_LAST_NAME);

        when(studentRepository.findByFirstNameAndLastName(STUDENT1_FIRST_NAME,STUDENT1_LAST_NAME)).thenReturn(student);

        //When
        StudentDTO studentDTO = studentService.findByFirstNameAndLastName(STUDENT1_FIRST_NAME,STUDENT1_LAST_NAME);

        //Then
        assertEquals(ID_1, student.getId());
        assertEquals(STUDENT1_FIRST_NAME, student.getFirstName());
        assertEquals(STUDENT1_LAST_NAME, student.getLastName());
        verify(studentRepository,times(2)).findByFirstNameAndLastName(STUDENT1_FIRST_NAME,STUDENT1_LAST_NAME);
    }

    @Test
    public void save() throws Exception {

        //Given
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setFirstName(STUDENT1_FIRST_NAME);

        Student student = new Student();
        studentDTO.setFirstName(STUDENT1_FIRST_NAME);

        //When
        studentService.saveStudent(studentDTO);

        //Then
        verify(studentRepository,times(1)).save(student);
    }

    @Test
    public void delete() throws Exception {
        long id = ID_1;

        studentService.deleteStudent(id);

        verify(studentRepository, times(1)).deleteById(id);
    }

    @Test
    public void addSubject() throws Exception{
        //Given
        Student student = new Student();
        student.setId(ID_1);

        Course course = new Course();
        course.setId(ID_1);

        Enrollment enrollment = new Enrollment();
        enrollment.setCourse(course);
        enrollment.setStudent(student);

        when(studentRepository.findById(ID_1)).thenReturn(student);
        when(courseRepository.findById(ID_1)).thenReturn(course);
        //When
        studentService.enrollStudentToCourse(course.getId(), student.getId());

        //Then
        verify(enrollmentRepository, times(1)).save(any());*/
    }



}