public interface Dekanat {
    Salary[] salaries;
    Scholarship[] scholarships;

    PayDekanat(scholarship scholarship);
    PayDekanat(salary salary);
}