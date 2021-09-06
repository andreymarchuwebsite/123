public interface User {
    Salary TakeSalary(Teacher teacher);
    Scholarship TakeScholarship(Student student);

    void TakeMoney();
}