package za.ac.ngosa.repository;

/**
 * Created by User on 2015/09/19.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudFood {

    private Long id = (long)1;

    @Autowired
    FoodRepository repository;

    @Test
    public void testCreate() throws Exception {
        Food food = new Food.Builder(23).category("candy").name("jawbreakers").price(34).weight(45).build();
        repository.save(food);
        id = food.getCode();
        junit.framework.Assert.assertNotNull(food.getCode());
    }

    @Test
    public void testRead() throws Exception {

        id = Long.valueOf(23);
        Food food = repository.findOne(id);
        junit.framework.Assert.assertEquals(23, food.getCode());
    }

    @Test
    public void testUpdate() throws Exception {
        Food employee = repository.findOne(id);
        Food newFood = new Food.Builder(43).category("candy").name("jawbreakers").price(34).weight(45).build();
        repository.save(newFood);
        junit.framework.Assert.assertEquals(43, newFood.getCode());
    }

    @Test
    public void testDelete() throws Exception {
        Food food = repository.findOne(id);
        repository.delete(food);
        Food newFood = repository.findOne(id);
        junit.framework.Assert.assertNull(newFood);

    }


}*/
