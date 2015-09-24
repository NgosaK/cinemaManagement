package za.ac.ngosa.repository;

/**
 * Created by User on 2015/09/20.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudTVShow {

    private Long id = (long)1;

    @Autowired
    TVShowRepository repository;

    TVShow tvShow;
    TVShow newTVShow;

    @Test
    public void testCreate() throws Exception {
         tvShow = new TVShow.Builder(34).duration("1hr").episode("5").genre("thriller").price(43).season("3").title("A movie").build();
        repository.save(tvShow);
        id = tvShow.getId();
        junit.framework.Assert.assertNotNull(tvShow.getGenre());
    }

    @Test
    public void testRead() throws Exception {

        id = Long.valueOf(34);
        tvShow = repository.findOne(id);
        junit.framework.Assert.assertEquals(34, tvShow.getId());
    }

    @Test
    public void testUpdate() throws Exception {
         tvShow = repository.findOne(id);
        TVShow newTVShow = new TVShow.Builder(43).duration("1hr").episode("5").genre("thriller").price(43).season("3").title("A movie").build();
        repository.save(newTVShow);
        junit.framework.Assert.assertEquals(43, newTVShow.getId());
    }

    @Test
    public void testDelete() throws Exception {
         tvShow = repository.findOne(id);
        repository.delete(tvShow);
         newTVShow = repository.findOne(id);
        junit.framework.Assert.assertNull(newTVShow);

    }

}*/
