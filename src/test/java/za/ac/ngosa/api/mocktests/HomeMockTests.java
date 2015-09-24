package za.ac.ngosa.api.mocktests;

/**
 * Created by User on 2015/08/26.
 */
/*@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@ContextConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class HomeMockTests {

    final String BASE_URL = "http://localhost:8080/";

    private MockMvc mockMvc;
    @Before
    public void SetUp() throws Exception
    {
        mockMvc = MockMvcBuilders.standaloneSetup(
                new HomePage()).build();
    }

    @Test
    public void read() throws Exception
    {
        mockMvc.perform(MockMvcRequestBuilders
                .get(BASE_URL + "api/home")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(is("This is a Home Page")));
    }

}*/
