package com.example.demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Appcontroller {
	
	@GetMapping("/view")
	public String say()
	{
		return "hello monika";
	}
	
	@GetMapping("/views")
	public String says()
	{
		return "hello monika";
	}
	
	/*@PostMapping("/create")
	@ResponseBody
	public Ticket createticket( Ticket ticket)
	{
		return ticketbookservice.createticket(ticket);
	}*/
	
/*	@Value("pooja")
	private String s,s2;
	
	@Value("deepika")
	private String s1;
	
	 @LocalServerPort
	    private int port;

	    private URL base;

	    @Autowired
	    private TestRestTemplate template;

	    @Before
	    public void setUp() throws Exception {
	        this.base = new URL("http://localhost:" + port + "/");
	    }
	    @Test
	    public void getHello() throws Exception {
	        ResponseEntity<String> response = template.getForEntity(base.toString(),
	                String.class);
	     //   assertThat(response.getBody(), equals("Greetings from Spring Boot!"));
	    }
	@GetMapping("/view")
	public String monika(@RequestParam("name")String name)
	{
		return "welcome monika"+"  "+name+"  "+s+"  "+s1+" "+s2;
		//system.out.println(s);
	}*/
	
	
}
