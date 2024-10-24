package departmentManager.proiectSCD.Employee;

import departmentManager.proiectSCD.Department.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findAllByDepartment(Department department);

    List<Employee> findAllByDepartmentAndIsManager(Department department, Boolean isManager);
}
