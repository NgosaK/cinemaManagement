package za.ac.ngosa.repository;

/**
 * Created by User on 2015/08/10.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class TestCrudReceipt {

    private Long id = (long)1;

    @Autowired
     ReceiptRepository repository;

    @Test
    public void testCreate() throws Exception {

        List<Movie> movies= new ArrayList<Movie>();
        Receipt receipt= new Receipt.Builder(748)
                .movieTitle(movies)
                .price(65.00)
                .item("movie")
                .quantity(2)
                .cashierName("Tom")
                .total()
                .build();repository.save(receipt);
        id = receipt.getId();
        Assert.assertNotNull(receipt.getCashierName());

    }

    @Test
    public void testRead() throws Exception {
        Receipt receipt= repository.findOne(id);

        Assert.assertEquals(2,receipt.getQuantity());
    }

    @Test
    public void testUpdate() throws Exception {
        List<Movie> movies= new ArrayList<Movie>();
        Receipt receipt= repository.findOne(id);
        Receipt newReceipt= new Receipt.Builder(545).cashierName("Terry").item("batarang").price(50.00).quantity(3).total().build();
        repository.save(newReceipt);
        Assert.assertEquals("Terry",newReceipt.getCashierName());
    }

    @Test
    public void testDelete() throws Exception {
        Receipt receipt= repository.findOne(id);
        repository.delete(receipt);
        Receipt newReceipt= repository.findOne(id);

        Assert.assertNull(newReceipt);

    }
}*/
