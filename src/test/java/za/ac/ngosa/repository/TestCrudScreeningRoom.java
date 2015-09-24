package za.ac.ngosa.repository;

/**
 * Created by User on 2015/08/10.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudScreeningRoom {

    private Long id = (long)1;

    @Autowired
    ScreeningRoomRepository repository;

    @Test
    public void testCreate() throws Exception {

        ScreeningRoom screeningRoom= new ScreeningRoom.Builder(345)
                .size(235)
                .type("3D")
                .build();repository.save(screeningRoom);
        id = screeningRoom.getNumberID();
        Assert.assertEquals(345, screeningRoom.getNumberID());

    }

    @Test
    public void testRead() throws Exception {
        ScreeningRoom screeningRoom= repository.findOne(id);

        Assert.assertEquals(345,screeningRoom.getNumberID());

    }

    @Test
    public void testUpdate() throws Exception {

        ScreeningRoom screeningRoom= repository.findOne(id);
        ScreeningRoom newScreeningRoom= new ScreeningRoom.Builder(586)
                .build();
        repository.save(newScreeningRoom);
        id= newScreeningRoom.getNumberID();
        ScreeningRoom updatedScreeningRoom= repository.findOne(id);

        Assert.assertEquals(586,updatedScreeningRoom.getNumberID());
    }

    @Test
    public void testDelete() throws Exception {
        ScreeningRoom screeningRoom= repository.findOne(id);
        repository.delete(screeningRoom);

        ScreeningRoom newScreeningRoom= repository.findOne(id);

        Assert.assertNull(newScreeningRoom);
    }
}
*/