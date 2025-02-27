package Tema9;

import Tema5.Professor;
import Tema5.ProfessorType;
import Tema5.Student;
import Tema5.StudentType;

import java.util.UUID;
//3. Create a HumanService class having 2 HumanRepository fields
public class HumanService {
    private HumanRepository <Student> StudentRepository;
    private HumanRepository <Professor> ProfessorRepository;

    public HumanService(HumanRepository<Student> injectedStudentRepository,
                        HumanRepository<Professor> injectedProfessorRepository){
        StudentRepository = injectedStudentRepository;
        ProfessorRepository = injectedProfessorRepository;

    }




    public void exercise1() {
        //3.1 Add 4 obj inside each repository
        Student s1 = new Student("Ana", "Pop", 1, 2, "Lala",
                "sport", StudentType.BACHELOR, UUID.randomUUID());
        Student s2 = new Student("Maria", "Popescu", 13, 13, "Lala",
                "informatica", StudentType.BACHELOR, UUID.randomUUID());
        Student s3 = new Student("Ion", "Ionescu", 22, 11, "Lala",
                "matematica", StudentType.PHD, UUID.randomUUID());
        Student s4 = new Student("Marius", "Escu", 12, 13, "Lala",
                "chimie", StudentType.MASTERS, UUID.randomUUID());
        //Student s5 = null;

        StudentRepository.add(s1);
        StudentRepository.add(s2);
        StudentRepository.add(s3);
        StudentRepository.add(s4);
        //StudentRepository.add(s5);

        Professor p1 = new Professor("Horatiu", "Malaele", 01, 30, "Film",
                ProfessorType.PROFESSOR, UUID.randomUUID());
        Professor p2 = new Professor("Cristi", "Puiu", 10, 25, "Film",
                ProfessorType.ASSOCIATE, UUID.randomUUID());
        Professor p3 = new Professor("Horatiu", "Malaele", 11, 30, "Film",
                ProfessorType.ASSISTENT, UUID.randomUUID());
        Professor p4 = new Professor("Victor", "Marcu ", 13, 30, "Film",
                ProfessorType.PROFESSOR, UUID.randomUUID());

        ProfessorRepository.add(p1);
        ProfessorRepository.add(p2);
        ProfessorRepository.add(p3);
        ProfessorRepository.add(p4);
    }

    public void exercise2() {
        //3.2 Print all
        System.out.println(StudentRepository);
        System.out.println(ProfessorRepository);
    }

    public void exercise3() {
        //3.3 Modify 2 obj inside each repository
        // nu imi schimba type
        Student update1 = new Student("Ioana", "Petresco", 13, 12, "Film",
                "Regie", StudentType.PHD, UUID.randomUUID());
        Student update2 = new Student("Paul", "Nemes", 4, 5, "UTCN",
                "Mecanica", StudentType.PHD, UUID.randomUUID());
        Professor update3 = new Professor("Felicia", "Cornea", 17, 10, "Psihologie",
                ProfessorType.PROFESSOR, UUID.randomUUID());
        Professor update4 = new Professor("Otilia", "Cornea", 20, 30, "Sociologie",
                ProfessorType.PROFESSOR, UUID.randomUUID());
        //Professor update5 = null;

        StudentRepository.updateById(s1.getUniqueID().toString(), update1);
        StudentRepository.updateById(s2.getUniqueID().toString(), update2);
        ProfessorRepository.updateById(p2.getUniqueID().toString(), update3);
        ProfessorRepository.updateById(p3.getUniqueID().toString(), update4);
        //ProfessorRepository.updateById(p1.getUniqueID().toString(),update5);
    }

    public void exercise31() {
        System.out.println("3.3 Modify 2 obj");
        System.out.println(StudentRepository);
        System.out.println(ProfessorRepository);
    }

    public void exercise4() {

        //3.4 Delete two obj from each repo...
        StudentRepository.deleteById(s4.getUniqueID().toString());
        StudentRepository.deleteById(s3.getUniqueID().toString());
        ProfessorRepository.deleteById(p1.getUniqueID().toString());
        ProfessorRepository.deleteById(p2.getUniqueID().toString());
        //ProfessorRepository.deleteById(null);
        System.out.println("3.4 Delete two obj");
        System.out.println(StudentRepository);
        System.out.println(ProfessorRepository);
    }

    public void exercise6(){
        //3.6 Read a single elem by its name
        System.out.println(StudentRepository.getAllByName("Ioana"));
        System.out.println(ProfessorRepository.getAllByName("Victor"));

    }










}
