package za.ac.ngosa.domain;

/*
public class CinemaTests {
    @Before
    public  void setUp() throws Exception
    {

    }

    @Test
    public void testTVShow()
    {
        TVShow tvShow= new TVShow.Builder(345).duration("1h 39min").episode("2").genre("fantasy").price(50.00).
                season("2").title("game of thrones").build();
        Assert.assertEquals("game of thrones", tvShow.getTitle());
        Assert.assertEquals(345,tvShow.getId());
        Assert.assertEquals("1h 39min",tvShow.getDuration());
        Assert.assertEquals("2",tvShow.getEpisode());
        Assert.assertEquals("fantasy",tvShow.getGenre());
        Assert.assertEquals(50.00,tvShow.getPrice(),0.01);
        Assert.assertEquals("2",tvShow.getSeason());
    }

    @Test
    public void testScreeningRoom()
    {
        ScreeningRoom screeningRoom= new ScreeningRoom.Builder(23).size(250).type("3D").build();
        Assert.assertEquals(23,screeningRoom.getNumberID());
        Assert.assertEquals(250,screeningRoom.getSize());
        Assert.assertEquals("3D",screeningRoom.getType());
    }

    @Test
    public void testSchedule()
    {

        Schedule schedule= new Schedule.Builder(3453).duration(2).startTime(11).endTime().title("Still Alice").
                build();
        Assert.assertEquals(13,schedule.getEndTime());
        Assert.assertEquals(11,schedule.getStartTime());
        Assert.assertEquals(2,schedule.getDuration());
        Assert.assertEquals(3453,schedule.getId());
        Assert.assertEquals("Still Alice",schedule.getTitle());
    }

    @Test
    public void testReceipt()
    {
        List<Movie> movies = new ArrayList<Movie>();

        Receipt receipt= new Receipt.Builder(232).cashierName("Sandy").movieTitle(movies).price(60.00).quantity(2)
                .item("movie").total().build();

        Assert.assertEquals("Sandy",receipt.getCashierName());
        Assert.assertEquals(232,receipt.getId());
        Assert.assertEquals(60.00,receipt.getPrice(),0.01);
        Assert.assertEquals(2,receipt.getQuantity());
        Assert.assertEquals("movie",receipt.getItem());
        Assert.assertEquals(120.00,receipt.getTotal(),0.01);
    }

    @Test
    public void testMovie()
    {
        Movie movie= new Movie.Builder(234).duration("1h 35min").genre("Drama").title("Cake").type("2D").price(45)
                .build();
        Assert.assertEquals("1h 35min",movie.getDuration());
        Assert.assertEquals(234,movie.getId());
        Assert.assertEquals("Drama",movie.getGenre());
        Assert.assertEquals("Cake",movie.getTitle());
        Assert.assertEquals("2D",movie.getType());
        Assert.assertEquals(45,movie.getPrice(),0.01);
    }

    @Test
    public void testManager()
    {
        Manager manager= new Manager.Builder(535).department("Maintenance").jobTitle("Maintenance manager")
                .numberOfEmployees(10).name("Jerry").phoneNumber("09857343").build();
        Assert.assertEquals("Maintenance",manager.getDepartment());
        Assert.assertEquals(535,manager.getId());
        Assert.assertEquals("Maintenance manager",manager.getJobTitle());
        Assert.assertEquals(10,manager.getNumOfEmployees());
        Assert.assertEquals("Jerry",manager.getName());
        Assert.assertEquals("09857343",manager.getPhoneNumber());
    }

    @Test
    public void testFood()
    {
        Food food= new Food.Builder(343).category("candy").name("Whispers").weight(50.00).price(35.50).build();
        Assert.assertEquals("candy",food.getCategory());
        Assert.assertEquals("Whispers",food.getName());
        Assert.assertEquals(343,food.getCode());
        Assert.assertEquals(50.00,food.getWeight(),0.01);
        Assert.assertEquals(35.50,food.getPrice(),0.01);

    }

    @Test
    public void testBeverage()
    {
        Beverage beverage= new Beverage.Builder(2342).category("Soda").volume(330).name("Cream soda").price(30.00)
                .build();
        Assert.assertEquals("Soda",beverage.getCategory());
        Assert.assertEquals(330,beverage.getVolume(),0.01);
        Assert.assertEquals(2342,beverage.getCode());
        Assert.assertEquals("Cream soda",beverage.getName());
        Assert.assertEquals(30.00,beverage.getPrice(),0.01);
    }


}*/
