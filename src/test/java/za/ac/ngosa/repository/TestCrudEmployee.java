package za.ac.ngosa.repository;

/**
 * Created by OWNER on 2015/04/24.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudEmployee {

    private Long id = (long)1;

    @Autowired
    EmployeeRepository repository;

    @Test
    public void testCreate() throws Exception {
        Manager employee = new Manager.Builder(232).department("Maintenance").jobTitle("Maintenance Manager").name("Jim").numberOfEmployees(23).phoneNumber("3445555").build();
        repository.save(employee);
        id = employee.getId();
        junit.framework.Assert.assertNotNull(employee.getJobTitle());
    }

    @Test
    public void testRead() throws Exception {

        id = Long.valueOf(232);
        Manager employee = repository.findOne(id);
        junit.framework.Assert.assertEquals(232, employee.getId());
    }

    @Test
    public void testUpdate() throws Exception {
        Manager employee = repository.findOne(id);
        Manager newEmployee = new Manager.Builder(43).department("The Department").jobTitle("manager").name("jake").numberOfEmployees(35).phoneNumber("454564").build();
        repository.save(newEmployee);
        junit.framework.Assert.assertEquals(43, newEmployee.getId());
    }

    @Test
    public void testDelete() throws Exception {
        Manager employee = repository.findOne(id);
        repository.delete(employee);
        Manager newEmployee = repository.findOne(id);
        junit.framework.Assert.assertNull(newEmployee);

    }

}*/
