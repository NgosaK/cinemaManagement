package za.ac.ngosa.repository;

/**
 * Created by User on 2015/09/19.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudBeverage {
    private Long id = (long)1;

    @Autowired
    BeverageRepository repository;
    Beverage beverage;

    @Test
    public void testCreate() throws Exception
    {
         beverage= new Beverage.Builder(1).category("Soda").volume(500).name("cream soda").price(30).build();
        repository.save(beverage);
        id= beverage.getCode();
        Assert.assertNotNull(beverage.getCode());
    }

    @Test
    public void testRead() throws Exception
    {
        id = Long.valueOf(1);
         beverage = repository.findOne(id);
        junit.framework.Assert.assertEquals(1, beverage.getCode());
    }

    @Test
    public void testUpdate() throws Exception {
        Beverage beverage = repository.findOne(id);
        Beverage newBeverage = new Beverage.Builder(12).category("Soda").volume(500).name("cream soda").price(30).build();
        repository.save(newBeverage);
        junit.framework.Assert.assertEquals(12, newBeverage.getCode());
    }

    @Test
    public void testDelete() throws Exception {
        Beverage beverage = repository.findOne(id);
        repository.delete(beverage);
        Beverage newBeverage = repository.findOne(id);
        junit.framework.Assert.assertNull(newBeverage);

    }
}*/
