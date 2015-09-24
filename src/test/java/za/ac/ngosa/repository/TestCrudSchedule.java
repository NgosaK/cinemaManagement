package za.ac.ngosa.repository;

/**
 * Created by User on 2015/08/10.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudSchedule {

    private Long id = (long)1;

    @Autowired
    private ScheduleRepository repository;

    @Test
    public void testCreate() throws Exception {

        Schedule schedule= new Schedule.Builder(485)
                .duration(2)
                .startTime(14)
                .title("9")
                .endTime()
                .build();repository.save(schedule);
        id = schedule.getId();
        Assert.assertNotNull(schedule.getTitle());

    }

    @Test
    public void testRead() throws Exception {
        Schedule schedule= repository.findOne(id);
        Assert.assertEquals(485,schedule.getId());
    }

    @Test
    public void testUpdate() throws Exception {

        Schedule schedule= repository.findOne(id);
        Schedule newSchedule= new Schedule.Builder(885)
                .build();repository.save(newSchedule);
        Assert.assertEquals("12 15", newSchedule.getTitle());
    }

    @Test
    public void testDelete() throws Exception {
        Schedule schedule= repository.findOne(id);
        repository.delete(schedule);
        Schedule newSchedule= repository.findOne(id);

        Assert.assertNull(newSchedule);

    }


}*/
