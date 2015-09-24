package za.ac.ngosa.repository;

/**
 * Created by User on 2015/09/20.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudMovie {

    private Long id = (long)1;

    @Autowired
    MovieRepository repository;

    Movie movie;

    @Test
    public void testCreate() throws Exception {
         movie = new Movie.Builder(34).type("2D").title("Shrek").price(45).genre("animation").duration("2hr").build();
        repository.save(movie);
        id = movie.getId();
        junit.framework.Assert.assertNotNull(movie.getId());
    }

    @Test
    public void testRead() throws Exception {

        id = Long.valueOf(34);
         movie = repository.findOne(id);
        junit.framework.Assert.assertEquals(34, movie.getId());
    }

    @Test
    public void testUpdate() throws Exception {
         movie = repository.findOne(id);
        Movie newMovie = new Movie.Builder(34).type("2D").title("Shrek").price(45).genre("animation").duration("2hr").build();
        repository.save(newMovie);
        junit.framework.Assert.assertEquals(43, newMovie.getId());
    }

    @Test
    public void testDelete() throws Exception {
         movie = repository.findOne(id);
        repository.delete(movie);
        Movie newMovie = repository.findOne(id);
        junit.framework.Assert.assertNull(newMovie);

    }

}*/
